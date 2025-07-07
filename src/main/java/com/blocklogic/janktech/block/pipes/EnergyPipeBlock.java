package com.blocklogic.janktech.block.pipes;

import com.blocklogic.janktech.block.JTBlocks;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;

public class EnergyPipeBlock extends BasePipeBlock {

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
}