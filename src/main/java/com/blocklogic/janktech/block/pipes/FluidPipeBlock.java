package com.blocklogic.janktech.block.pipes;

import com.blocklogic.janktech.block.JTBlocks;
import com.blocklogic.janktech.block.entity.transport.FluidPipeBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class FluidPipeBlock extends BasePipeBlock implements EntityBlock {

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

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new FluidPipeBlockEntity(pos, state);
    }
}