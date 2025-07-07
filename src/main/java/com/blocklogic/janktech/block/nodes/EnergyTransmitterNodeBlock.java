package com.blocklogic.janktech.block.nodes;

import com.blocklogic.janktech.block.pipes.EnergyPipeBlock;
import net.minecraft.world.level.block.state.BlockState;

public class EnergyTransmitterNodeBlock extends BaseNodeBlock {

    public EnergyTransmitterNodeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean canConnectToPipe(BlockState pipeState) {
        return pipeState.getBlock() instanceof EnergyPipeBlock;
    }
}