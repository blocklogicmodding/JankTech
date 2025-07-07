package com.blocklogic.janktech.block.entity;

import com.blocklogic.janktech.JankTech;
import com.blocklogic.janktech.block.JTBlocks;
import com.blocklogic.janktech.block.entity.transport.ItemPipeBlockEntity;
import com.blocklogic.janktech.block.entity.transport.ItemReceiverNodeBlockEntity;
import com.blocklogic.janktech.block.entity.transport.ItemTransmitterNodeBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class JTBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, JankTech.MODID);

    public static final Supplier<BlockEntityType<ItemTransmitterNodeBlockEntity>> ITEM_TRANSMITTER_NODE_BE =
            BLOCK_ENTITIES.register("item_transmitter_node_be", () ->
                    BlockEntityType.Builder.of(ItemTransmitterNodeBlockEntity::new,
                                    JTBlocks.ITEM_TRANSMITTER_NODE.get())
                            .build(null));

    public static final Supplier<BlockEntityType<ItemReceiverNodeBlockEntity>> ITEM_RECEIVER_NODE_BE =
            BLOCK_ENTITIES.register("item_receiver_node_be", () ->
                    BlockEntityType.Builder.of(ItemReceiverNodeBlockEntity::new,
                            JTBlocks.ITEM_RECEIVER_NODE.get()).build(null));

    public static final Supplier<BlockEntityType<ItemPipeBlockEntity>> ITEM_PIPE_BE =
            BLOCK_ENTITIES.register("item_pipe_be", () ->
                    BlockEntityType.Builder.of(ItemPipeBlockEntity::new,
                            JTBlocks.ITEM_PIPE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}