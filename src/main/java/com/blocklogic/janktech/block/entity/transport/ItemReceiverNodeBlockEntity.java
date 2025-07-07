package com.blocklogic.janktech.block.entity.transport;

import com.blocklogic.janktech.block.entity.JTBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.items.IItemHandler;

public class ItemReceiverNodeBlockEntity extends BlockEntity {

    public ItemReceiverNodeBlockEntity(BlockPos pos, BlockState blockState) {
        super(JTBlockEntities.ITEM_RECEIVER_NODE_BE.get(), pos, blockState);
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
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

    public boolean canReceiveItem(ItemStack stack) {
        return true;
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