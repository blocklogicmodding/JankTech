package com.blocklogic.janktech.block.nodes;

import com.blocklogic.janktech.block.entity.transport.ItemReceiverNodeBlockEntity;
import com.blocklogic.janktech.block.pipes.ItemPipeBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class ItemReceiverNodeBlock extends BaseNodeBlock implements EntityBlock {

    public ItemReceiverNodeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean canConnectToPipe(BlockState pipeState) {
        return pipeState.getBlock() instanceof ItemPipeBlock;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ItemReceiverNodeBlockEntity(pos, state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }
}