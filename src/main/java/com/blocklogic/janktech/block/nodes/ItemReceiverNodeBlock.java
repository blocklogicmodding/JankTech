package com.blocklogic.janktech.block.nodes;

import com.blocklogic.janktech.block.pipes.ItemPipeBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ItemReceiverNodeBlock extends BaseNodeBlock {

    public ItemReceiverNodeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean canConnectToPipe(BlockState pipeState) {
        return pipeState.getBlock() instanceof ItemPipeBlock;
    }
}