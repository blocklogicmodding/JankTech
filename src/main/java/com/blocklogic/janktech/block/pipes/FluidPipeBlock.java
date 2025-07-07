package com.blocklogic.janktech.block.pipes;

import com.blocklogic.janktech.block.JTBlocks;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;

public class FluidPipeBlock extends BasePipeBlock {

    public FluidPipeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean canConnectTo(BlockState neighborState, Direction direction) {
        if (neighborState.getBlock() instanceof FluidPipeBlock) {
            return true;
        }

        if (neighborState.is(JTBlocks.FLUID_RECEIVER_NODE.get()) ||
                neighborState.is(JTBlocks.FLUID_TRANSMITTER_NODE.get())) {
            return true;
        }

        return false;
    }
}