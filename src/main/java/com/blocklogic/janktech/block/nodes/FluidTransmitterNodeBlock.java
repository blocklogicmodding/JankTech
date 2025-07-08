package com.blocklogic.janktech.block.nodes;

import com.blocklogic.janktech.block.entity.JTBlockEntities;
import com.blocklogic.janktech.block.entity.transport.FluidTransmitterNodeBlockEntity;
import com.blocklogic.janktech.block.pipes.FluidPipeBlock;
import com.blocklogic.janktech.screen.transport.FluidTransmitterNodeMenu;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.items.IItemHandler;
import org.jetbrains.annotations.Nullable;

public class FluidTransmitterNodeBlock extends BaseNodeBlock implements EntityBlock {

    public static final MapCodec<FluidTransmitterNodeBlock> CODEC = simpleCodec(FluidTransmitterNodeBlock::new);

    public FluidTransmitterNodeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean canConnectToPipe(BlockState pipeState) {
        return pipeState.getBlock() instanceof FluidPipeBlock;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new FluidTransmitterNodeBlockEntity(pos, state);
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if (level.isClientSide()) {
            return null;
        }
        if (blockEntityType == JTBlockEntities.FLUID_TRANSMITTER_NODE_BE.get()) {
            return (BlockEntityTicker<T>) (BlockEntityTicker<FluidTransmitterNodeBlockEntity>) FluidTransmitterNodeBlockEntity::tick;
        }
        return null;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide()) {
            BlockEntity entity = level.getBlockEntity(pos);
            if (entity instanceof FluidTransmitterNodeBlockEntity) {
                player.openMenu(new MenuProvider() {
                    @Override
                    public Component getDisplayName() {
                        return Component.translatable("container.janktech.fluid_transmitter_node");
                    }

                    @Override
                    public @Nullable AbstractContainerMenu createMenu(int containerId, Inventory playerInventory, Player player) {
                        return new FluidTransmitterNodeMenu(containerId, playerInventory, entity);
                    }
                }, pos);
            }
        }

        return InteractionResult.sidedSuccess(level.isClientSide());
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean movedByPiston) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = level.getBlockEntity(pos);
            if (blockEntity instanceof FluidTransmitterNodeBlockEntity transmitter) {
                IItemHandler itemHandler = transmitter.getItemHandler();
                for (int i = 0; i < itemHandler.getSlots(); i++) {
                    ItemStack stack = itemHandler.getStackInSlot(i);
                    if (!stack.isEmpty()) {
                        Containers.dropItemStack(level, pos.getX(), pos.getY(), pos.getZ(), stack);
                    }
                }
            }
        }
        super.onRemove(state, level, pos, newState, movedByPiston);
    }
}