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
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;

public class ItemReceiverNodeBlockEntity extends BlockEntity {

    public static final MapCodec<ItemReceiverNodeBlockEntity> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    ItemStack.CODEC.fieldOf("upgrade_slot").forGetter(be -> be.itemHandler.getStackInSlot(0)),
                    ItemStack.CODEC.fieldOf("filter_slot").forGetter(be -> be.itemHandler.getStackInSlot(1))
            ).apply(instance, ItemReceiverNodeBlockEntity::new)
    );

    public static final StreamCodec<?, ItemReceiverNodeBlockEntity> STREAM_CODEC =
            StreamCodec.composite(
                    ItemStack.STREAM_CODEC, be -> be.itemHandler.getStackInSlot(0),
                    ItemStack.STREAM_CODEC, be -> be.itemHandler.getStackInSlot(1),
                    ItemReceiverNodeBlockEntity::new
            );

    private final ItemStackHandler itemHandler = new ItemStackHandler(2) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, ItemStack stack) {
            if (slot == 0) {
                return stack.getItem() == JTItems.SPEEDY_NODE_TRANSFER_UPGRADE.get();
            } else if (slot == 1) {
                return stack.getItem() == JTItems.ITEM_FILTER.get();
            }
            return false;
        }

        @Override
        public int getSlotLimit(int slot) {
            if (slot == 0) {
                return 8;
            } else if (slot == 1) {
                return 1;
            }
            return super.getSlotLimit(slot);
        }
    };

    public ItemReceiverNodeBlockEntity(BlockPos pos, BlockState blockState) {
        super(JTBlockEntities.ITEM_RECEIVER_NODE_BE.get(), pos, blockState);
    }

    private ItemReceiverNodeBlockEntity(ItemStack upgradeStack, ItemStack filterStack) {
        super(JTBlockEntities.ITEM_RECEIVER_NODE_BE.get(), BlockPos.ZERO, null);
        this.itemHandler.setStackInSlot(0, upgradeStack);
        this.itemHandler.setStackInSlot(1, filterStack);
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

    public ItemStack getFilterStack() {
        return itemHandler.getStackInSlot(1);
    }

    public boolean canReceiveItem(ItemStack stack) {
        ItemStack filter = getFilterStack();
        if (filter.isEmpty()) {
            return true;
        }

        // TODO: Implement filter logic when filter system is ready
        return true;
    }

    public int getItemsPerTick() {
        int baseRate = 1;
        ItemStack upgrade = getUpgradeStack();

        if (!upgrade.isEmpty()) {
            int upgradeCount = upgrade.getCount();
            return baseRate + (upgradeCount * 8);
        }

        return baseRate;
    }

    public IItemHandler findConnectedInventory(Level level, BlockPos pos) {
        for (Direction direction : Direction.values()) {
            BlockPos checkPos = pos.relative(direction);
            IItemHandler itemHandler = level.getCapability(Capabilities.ItemHandler.BLOCK, checkPos, direction.getOpposite());
            if (itemHandler != null) {
                return itemHandler;
            }
        }
        return null;
    }
}