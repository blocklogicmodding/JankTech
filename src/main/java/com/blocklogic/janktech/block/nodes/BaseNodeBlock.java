// Base abstract node class
// src/main/java/com/blocklogic/janktech/block/nodes/BaseNodeBlock.java
package com.blocklogic.janktech.block.nodes;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public abstract class BaseNodeBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static final BooleanProperty NORTH = BooleanProperty.create("north");
    public static final BooleanProperty EAST = BooleanProperty.create("east");
    public static final BooleanProperty SOUTH = BooleanProperty.create("south");
    public static final BooleanProperty WEST = BooleanProperty.create("west");
    public static final BooleanProperty UP = BooleanProperty.create("up");
    public static final BooleanProperty DOWN = BooleanProperty.create("down");

    protected static final VoxelShape SHAPE_UP = Block.box(5, 0, 5, 11, 10, 11);
    protected static final VoxelShape SHAPE_DOWN = Block.box(5, 6, 5, 11, 16, 11);
    protected static final VoxelShape SHAPE_NORTH = Block.box(5, 5, 6, 11, 11, 16);
    protected static final VoxelShape SHAPE_SOUTH = Block.box(5, 5, 0, 11, 11, 10);
    protected static final VoxelShape SHAPE_EAST = Block.box(0, 5, 5, 10, 11, 11);
    protected static final VoxelShape SHAPE_WEST = Block.box(6, 5, 5, 16, 11, 11);

    protected static final VoxelShape NORTH_SHAPE = Block.box(6, 6, 0, 10, 10, 6);
    protected static final VoxelShape EAST_SHAPE = Block.box(10, 6, 6, 16, 10, 10);
    protected static final VoxelShape SOUTH_SHAPE = Block.box(6, 6, 10, 10, 10, 16);
    protected static final VoxelShape WEST_SHAPE = Block.box(0, 6, 6, 6, 10, 10);
    protected static final VoxelShape UP_SHAPE = Block.box(6, 10, 6, 10, 16, 10);
    protected static final VoxelShape DOWN_SHAPE = Block.box(6, 0, 6, 10, 6, 10);

    public BaseNodeBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.UP)
                .setValue(NORTH, false)
                .setValue(EAST, false)
                .setValue(SOUTH, false)
                .setValue(WEST, false)
                .setValue(UP, false)
                .setValue(DOWN, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, NORTH, EAST, SOUTH, WEST, UP, DOWN);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction facing = context.getClickedFace();
        BlockPos pos = context.getClickedPos();

        return this.defaultBlockState()
                .setValue(FACING, facing)
                .setValue(NORTH, canConnectToPipe(context.getLevel().getBlockState(pos.north())))
                .setValue(EAST, canConnectToPipe(context.getLevel().getBlockState(pos.east())))
                .setValue(SOUTH, canConnectToPipe(context.getLevel().getBlockState(pos.south())))
                .setValue(WEST, canConnectToPipe(context.getLevel().getBlockState(pos.west())))
                .setValue(UP, canConnectToPipe(context.getLevel().getBlockState(pos.above())))
                .setValue(DOWN, canConnectToPipe(context.getLevel().getBlockState(pos.below())));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        VoxelShape shape = switch (state.getValue(FACING)) {
            case UP -> SHAPE_UP;
            case DOWN -> SHAPE_DOWN;
            case NORTH -> SHAPE_NORTH;
            case SOUTH -> SHAPE_SOUTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
        };

        if (state.getValue(NORTH)) shape = Shapes.or(shape, NORTH_SHAPE);
        if (state.getValue(EAST)) shape = Shapes.or(shape, EAST_SHAPE);
        if (state.getValue(SOUTH)) shape = Shapes.or(shape, SOUTH_SHAPE);
        if (state.getValue(WEST)) shape = Shapes.or(shape, WEST_SHAPE);
        if (state.getValue(UP)) shape = Shapes.or(shape, UP_SHAPE);
        if (state.getValue(DOWN)) shape = Shapes.or(shape, DOWN_SHAPE);

        return shape;
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        BooleanProperty property = getPropertyForDirection(direction);
        return state.setValue(property, canConnectToPipe(neighborState));
    }

    protected BooleanProperty getPropertyForDirection(Direction direction) {
        return switch (direction) {
            case NORTH -> NORTH;
            case EAST -> EAST;
            case SOUTH -> SOUTH;
            case WEST -> WEST;
            case UP -> UP;
            case DOWN -> DOWN;
        };
    }

    protected abstract boolean canConnectToPipe(BlockState pipeState);
}