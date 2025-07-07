package com.blocklogic.janktech.block.pipes;

import com.blocklogic.janktech.block.JTBlocks;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;

public class ItemPipeBlock extends BasePipeBlock {

    public ItemPipeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean canConnectTo(BlockState neighborState, Direction direction) {
        if (neighborState.getBlock() instanceof ItemPipeBlock) {
            return true;
        }

        if (neighborState.is(JTBlocks.ITEM_RECEIVER_NODE.get()) ||
                neighborState.is(JTBlocks.ITEM_TRANSMITTER_NODE.get())) {
            return true;
        }

        return false;
    }
}