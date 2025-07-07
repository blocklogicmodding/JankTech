package com.blocklogic.janktech.block.nodes;

import com.blocklogic.janktech.block.pipes.FluidPipeBlock;
import net.minecraft.world.level.block.state.BlockState;

public class FluidTransmitterNodeBlock extends BaseNodeBlock {

    public FluidTransmitterNodeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean canConnectToPipe(BlockState pipeState) {
        return pipeState.getBlock() instanceof FluidPipeBlock;
    }
}