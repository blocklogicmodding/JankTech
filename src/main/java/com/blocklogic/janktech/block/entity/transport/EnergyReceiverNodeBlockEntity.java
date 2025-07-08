package com.blocklogic.janktech.block.entity.transport;

import com.blocklogic.janktech.block.entity.JTBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.energy.IEnergyStorage;

public class EnergyReceiverNodeBlockEntity extends BlockEntity {

    public EnergyReceiverNodeBlockEntity(BlockPos pos, BlockState blockState) {
        super(JTBlockEntities.ENERGY_RECEIVER_NODE_BE.get(), pos, blockState);
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

    public boolean canReceiveEnergy() {
        return true;
    }

    public IEnergyStorage findConnectedEnergyStorage(Level level, BlockPos pos) {
        for (Direction direction : Direction.values()) {
            BlockPos checkPos = pos.relative(direction);
            IEnergyStorage energyStorage = level.getCapability(Capabilities.EnergyStorage.BLOCK, checkPos, direction.getOpposite());
            if (energyStorage != null && energyStorage.canReceive()) {
                return energyStorage;
            }
        }
        return null;
    }
}