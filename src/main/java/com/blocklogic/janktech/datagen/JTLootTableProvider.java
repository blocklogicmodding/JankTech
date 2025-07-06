package com.blocklogic.janktech.datagen;

import com.blocklogic.janktech.block.JTBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.Set;
import java.util.function.Supplier;

public class JTLootTableProvider extends BlockLootSubProvider {
    protected JTLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(JTBlocks.DARK_DIRT.get());
        dropSelf(JTBlocks.GLIMMER_GRASS.get());
        dropSelf(JTBlocks.NOPESCOPE_GLASS.get());
        dropSelf(JTBlocks.SEEMORE_GLASS.get());
        dropSelf(JTBlocks.CHEESE_BLOCK.get());
        dropSelf(JTBlocks.ENDER_PEARL_BLOCK.get());
        dropSelf(JTBlocks.NETHER_STAR_BLOCK.get());
        dropSelf(JTBlocks.ECHO_SHARD_BLOCK.get());
        dropSelf(JTBlocks.ENERGY_RECEIVER_NODE.get());
        dropSelf(JTBlocks.ENERGY_TRANSMITTER_NODE.get());
        dropSelf(JTBlocks.ENERGY_PIPE.get());
        dropSelf(JTBlocks.FLUID_RECEIVER_NODE.get());
        dropSelf(JTBlocks.FLUID_TRANSMITTER_NODE.get());
        dropSelf(JTBlocks.FLUID_PIPE.get());
        dropSelf(JTBlocks.ITEM_RECEIVER_NODE.get());
        dropSelf(JTBlocks.ITEM_TRANSMITTER_NODE.get());
        dropSelf(JTBlocks.ITEM_PIPE.get());
        dropSelf(JTBlocks.ENDER_GENERATOR.get());
        dropSelf(JTBlocks.BIO_GENERATOR.get());
        dropSelf(JTBlocks.MOBLET_GENERATOR.get());
        dropSelf(JTBlocks.CHEESY_GENERATOR.get());
        dropSelf(JTBlocks.COALBURN_GENERATOR.get());
        dropSelf(JTBlocks.LAVA_GENERATOR.get());
        dropSelf(JTBlocks.STARRY_GENERATOR.get());
        dropSelf(JTBlocks.ECHOING_GENERATOR.get());
        dropSelf(JTBlocks.COLORBURN_GENERATOR.get());
        dropSelf(JTBlocks.STICKY_GENERATOR.get());
        dropSelf(JTBlocks.WITHERED_GENERATOR.get());
        dropSelf(JTBlocks.ALCHEMICAL_GENERATOR.get());
        dropSelf(JTBlocks.SUPER_AWESOME_EXTREME_GENERATOR.get());
        dropSelf(JTBlocks.XPOT.get());
        dropSelf(JTBlocks.SPLOOSH_DRUM.get());
        dropSelf(JTBlocks.STUFF_BOX.get());
        dropSelf(JTBlocks.ITEMS_TRASHCAN.get());
        dropSelf(JTBlocks.FLUIDS_TRASHCAN.get());
        dropSelf(JTBlocks.ENERGY_TRASHCAN.get());
        dropSelf(JTBlocks.SNARKLES.get());
        dropSelf(JTBlocks.CHUNKYBOI.get());
        dropSelf(JTBlocks.SPLOOSH_MOOSE.get());
        dropSelf(JTBlocks.SMASHINATOR.get());
        dropSelf(JTBlocks.GET_IT_ROBIT.get());
        dropSelf(JTBlocks.MOO_JUICE_ROBIT.get());
        dropSelf(JTBlocks.MOO_JUICE_SYNTHESIZER.get());
        dropSelf(JTBlocks.CHEESE_SQUEEZER.get());
        dropSelf(JTBlocks.LAVA_BUCKETLER.get());

        addDyeBlockLoot(JTBlocks.BLACK_DYE_BLOCK, Items.BLACK_DYE);
        addDyeBlockLoot(JTBlocks.BROWN_DYE_BLOCK, Items.BROWN_DYE);
        addDyeBlockLoot(JTBlocks.BLUE_DYE_BLOCK, Items.BLUE_DYE);
        addDyeBlockLoot(JTBlocks.CYAN_DYE_BLOCK, Items.CYAN_DYE);
        addDyeBlockLoot(JTBlocks.GRAY_DYE_BLOCK, Items.GRAY_DYE);
        addDyeBlockLoot(JTBlocks.GREEN_DYE_BLOCK, Items.GREEN_DYE);
        addDyeBlockLoot(JTBlocks.LIGHT_BLUE_DYE_BLOCK, Items.LIGHT_BLUE_DYE);
        addDyeBlockLoot(JTBlocks.LIGHT_GRAY_DYE_BLOCK, Items.LIGHT_GRAY_DYE);
        addDyeBlockLoot(JTBlocks.LIME_DYE_BLOCK, Items.LIME_DYE);
        addDyeBlockLoot(JTBlocks.MAGENTA_DYE_BLOCK, Items.MAGENTA_DYE);
        addDyeBlockLoot(JTBlocks.ORANGE_DYE_BLOCK, Items.ORANGE_DYE);
        addDyeBlockLoot(JTBlocks.PINK_DYE_BLOCK, Items.PINK_DYE);
        addDyeBlockLoot(JTBlocks.PURPLE_DYE_BLOCK, Items.PURPLE_DYE);
        addDyeBlockLoot(JTBlocks.RED_DYE_BLOCK, Items.RED_DYE);
        addDyeBlockLoot(JTBlocks.WHITE_DYE_BLOCK, Items.WHITE_DYE);
        addDyeBlockLoot(JTBlocks.YELLOW_DYE_BLOCK, Items.YELLOW_DYE);
    }

    private void addDyeBlockLoot(Supplier<Block> block, Item dye) {
        add(block.get(), createSingleItemTableWithSilkTouch(block.get(), dye, ConstantValue.exactly(4.0F)));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return JTBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
