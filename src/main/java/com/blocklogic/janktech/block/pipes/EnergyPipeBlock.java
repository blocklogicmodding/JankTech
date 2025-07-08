package com.blocklogic.janktech.block.pipes;

import com.blocklogic.janktech.block.JTBlocks;
import com.blocklogic.janktech.block.entity.transport.EnergyPipeBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class EnergyPipeBlock extends BasePipeBlock implements EntityBlock {

    public EnergyPipeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean canConnectTo(BlockState neighborState, Direction direction) {
        if (neighborState.getBlock() instanceof EnergyPipeBlock) {
            return true;
        }

        if (neighborState.is(JTBlocks.ENERGY_RECEIVER_NODE.get()) ||
                neighborState.is(JTBlocks.ENERGY_TRANSMITTER_NODE.get())) {
            return true;
        }

        return false;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new EnergyPipeBlockEntity(pos, state);
    }
}