package com.blocklogic.janktech.block.pipes;

import com.blocklogic.janktech.block.JTBlocks;
import com.blocklogic.janktech.block.entity.transport.ItemPipeBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class ItemPipeBlock extends BasePipeBlock implements EntityBlock {

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

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ItemPipeBlockEntity(pos, state);
    }
}