package com.blocklogic.janktech.block.entity.transport;

import com.blocklogic.janktech.block.entity.JTBlockEntities;
import com.blocklogic.janktech.item.JTItems;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.energy.IEnergyStorage;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;

public class EnergyTransmitterNodeBlockEntity extends BlockEntity {

    public static final MapCodec<EnergyTransmitterNodeBlockEntity> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    ItemStack.CODEC.fieldOf("upgrade_slot").forGetter(be -> be.itemHandler.getStackInSlot(0))
            ).apply(instance, EnergyTransmitterNodeBlockEntity::new)
    );

    public static final StreamCodec<?, EnergyTransmitterNodeBlockEntity> STREAM_CODEC =
            StreamCodec.composite(
                    ItemStack.STREAM_CODEC, be -> be.itemHandler.getStackInSlot(0),
                    EnergyTransmitterNodeBlockEntity::new
            );

    private final ItemStackHandler itemHandler = new ItemStackHandler(1) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, ItemStack stack) {
            if (slot == 0) {
                return stack.getItem() == JTItems.SPEEDY_NODE_TRANSFER_UPGRADE.get();
            }
            return false;
        }

        @Override
        public int getSlotLimit(int slot) {
            if (slot == 0) {
                return 8;
            }
            return super.getSlotLimit(slot);
        }
    };

    private int tickCounter = 0;
    private final int TRANSFER_COOLDOWN = 1;

    public EnergyTransmitterNodeBlockEntity(BlockPos pos, BlockState blockState) {
        super(JTBlockEntities.ENERGY_TRANSMITTER_NODE_BE.get(), pos, blockState);
    }

    private EnergyTransmitterNodeBlockEntity(ItemStack upgradeStack) {
        super(JTBlockEntities.ENERGY_TRANSMITTER_NODE_BE.get(), BlockPos.ZERO, null);
        this.itemHandler.setStackInSlot(0, upgradeStack);
    }

    public IItemHandler getItemHandler() {
        return itemHandler;
    }

    public Container getContainer() {
        SimpleContainer container = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            container.setItem(i, itemHandler.getStackInSlot(i));
        }
        return container;
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        tag.put("inventory", itemHandler.serializeNBT(registries));
        super.saveAdditional(tag, registries);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        if (tag.contains("inventory")) {
            itemHandler.deserializeNBT(registries, tag.getCompound("inventory"));
        }
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        CompoundTag tag = super.getUpdateTag(registries);
        saveAdditional(tag, registries);
        return tag;
    }

    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    public ItemStack getUpgradeStack() {
        return itemHandler.getStackInSlot(0);
    }

    public int getEnergyPerTick() {
        int baseRate = 128;
        ItemStack upgrade = getUpgradeStack();

        if (!upgrade.isEmpty()) {
            int upgradeCount = upgrade.getCount();
            return baseRate + (upgradeCount * 128);
        }

        return baseRate;
    }

    public static void tick(Level level, BlockPos pos, BlockState state, EnergyTransmitterNodeBlockEntity blockEntity) {
        if (level.isClientSide()) return;

        blockEntity.tickCounter++;
        if (blockEntity.tickCounter < blockEntity.TRANSFER_COOLDOWN) {
            return;
        }
        blockEntity.tickCounter = 0;

        IEnergyStorage sourceEnergyStorage = blockEntity.findConnectedEnergyStorage(level, pos);
        if (sourceEnergyStorage == null || !sourceEnergyStorage.canExtract()) return;

        EnergyReceiverNodeBlockEntity receiver = blockEntity.findConnectedReceiver(level, pos);
        if (receiver == null) return;

        int energyToTransfer = blockEntity.getEnergyPerTick();

        IEnergyStorage targetEnergyStorage = receiver.findConnectedEnergyStorage(level, receiver.getBlockPos());
        if (targetEnergyStorage == null || !targetEnergyStorage.canReceive()) return;

        int extracted = sourceEnergyStorage.extractEnergy(energyToTransfer, true);
        if (extracted > 0) {
            int received = targetEnergyStorage.receiveEnergy(extracted, true);
            if (received > 0) {
                int actualExtracted = sourceEnergyStorage.extractEnergy(received, false);
                targetEnergyStorage.receiveEnergy(actualExtracted, false);
            }
        }
    }

    private IEnergyStorage findConnectedEnergyStorage(Level level, BlockPos pos) {
        for (Direction direction : Direction.values()) {
            BlockPos checkPos = pos.relative(direction);
            IEnergyStorage energyStorage = level.getCapability(Capabilities.EnergyStorage.BLOCK, checkPos, direction.getOpposite());
            if (energyStorage != null && energyStorage.canExtract()) {
                return energyStorage;
            }
        }
        return null;
    }

    private EnergyReceiverNodeBlockEntity findConnectedReceiver(Level level, BlockPos pos) {
        for (Direction direction : Direction.values()) {
            BlockPos checkPos = pos.relative(direction);
            BlockEntity entity = level.getBlockEntity(checkPos);

            if (entity instanceof EnergyReceiverNodeBlockEntity receiver) {
                return receiver;
            }

            if (entity instanceof EnergyPipeBlockEntity) {
                EnergyReceiverNodeBlockEntity receiver = followPipeNetwork(level, checkPos, pos, 32);
                if (receiver != null) {
                    return receiver;
                }
            }
        }
        return null;
    }

    private EnergyReceiverNodeBlockEntity followPipeNetwork(Level level, BlockPos pipePos, BlockPos startPos, int maxDistance) {
        if (maxDistance <= 0) return null;

        for (Direction direction : Direction.values()) {
            BlockPos checkPos = pipePos.relative(direction);
            if (checkPos.equals(startPos)) continue;

            BlockEntity entity = level.getBlockEntity(checkPos);

            if (entity instanceof EnergyReceiverNodeBlockEntity receiver) {
                return receiver;
            }

            if (entity instanceof EnergyPipeBlockEntity) {
                EnergyReceiverNodeBlockEntity receiver = followPipeNetwork(level, checkPos, pipePos, maxDistance - 1);
                if (receiver != null) {
                    return receiver;
                }
            }
        }
        return null;
    }
}