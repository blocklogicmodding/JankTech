package com.blocklogic.janktech.datagen;

import com.blocklogic.janktech.JankTech;
import com.blocklogic.janktech.block.JTBlocks;
import com.blocklogic.janktech.util.JTTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class JTBlockTagProvider extends BlockTagsProvider {
    public JTBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, JankTech.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(JTBlocks.NOPESCOPE_GLASS.get())
                .add(JTBlocks.SEEMORE_GLASS.get())
                .add(JTBlocks.CHEESE_BLOCK.get())
                .add(JTBlocks.ENDER_PEARL_BLOCK.get())
                .add(JTBlocks.ECHO_SHARD_BLOCK.get())
                .add(JTBlocks.NETHER_STAR_BLOCK.get())
                .add(JTBlocks.ENERGY_RECEIVER_NODE.get())
                .add(JTBlocks.ENERGY_TRANSMITTER_NODE.get())
                .add(JTBlocks.ENERGY_PIPE.get())
                .add(JTBlocks.FLUID_RECEIVER_NODE.get())
                .add(JTBlocks.FLUID_TRANSMITTER_NODE.get())
                .add(JTBlocks.FLUID_PIPE.get())
                .add(JTBlocks.ITEM_RECEIVER_NODE.get())
                .add(JTBlocks.ITEM_TRANSMITTER_NODE.get())
                .add(JTBlocks.ITEM_PIPE.get())
                .add(JTBlocks.ENDER_GENERATOR.get())
                .add(JTBlocks.BIO_GENERATOR.get())
                .add(JTBlocks.MOBLET_GENERATOR.get())
                .add(JTBlocks.CHEESY_GENERATOR.get())
                .add(JTBlocks.COALBURN_GENERATOR.get())
                .add(JTBlocks.LAVA_GENERATOR.get())
                .add(JTBlocks.STARRY_GENERATOR.get())
                .add(JTBlocks.ECHOING_GENERATOR.get())
                .add(JTBlocks.COLORBURN_GENERATOR.get())
                .add(JTBlocks.STICKY_GENERATOR.get())
                .add(JTBlocks.WITHERED_GENERATOR.get())
                .add(JTBlocks.ALCHEMICAL_GENERATOR.get())
                .add(JTBlocks.SUPER_AWESOME_EXTREME_GENERATOR.get())
                .add(JTBlocks.XPOT.get())
                .add(JTBlocks.ITEMS_TRASHCAN.get())
                .add(JTBlocks.FLUIDS_TRASHCAN.get())
                .add(JTBlocks.ENERGY_TRASHCAN.get())
                .add(JTBlocks.SNARKLES.get())
                .add(JTBlocks.CHUNKYBOI.get())
                .add(JTBlocks.SPLOOSH_MOOSE.get())
                .add(JTBlocks.SMASHINATOR.get())
                .add(JTBlocks.GET_IT_ROBIT.get())
                .add(JTBlocks.MOO_JUICE_ROBIT.get())
                .add(JTBlocks.MOO_JUICE_SYNTHESIZER.get())
                .add(JTBlocks.CHEESE_SQUEEZER.get())
                .add(JTBlocks.LAVA_BUCKETLER.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(JTBlocks.STUFF_BOX.get())
                .add(JTBlocks.SPLOOSH_DRUM.get());

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(JTBlocks.DARK_DIRT.get())
                .add(JTBlocks.GLIMMER_GRASS.get())
                .add(JTBlocks.BLACK_DYE_BLOCK.get())
                .add(JTBlocks.BLUE_DYE_BLOCK.get())
                .add(JTBlocks.BROWN_DYE_BLOCK.get())
                .add(JTBlocks.CYAN_DYE_BLOCK.get())
                .add(JTBlocks.GRAY_DYE_BLOCK.get())
                .add(JTBlocks.GREEN_DYE_BLOCK.get())
                .add(JTBlocks.LIGHT_BLUE_DYE_BLOCK.get())
                .add(JTBlocks.LIGHT_GRAY_DYE_BLOCK.get())
                .add(JTBlocks.LIME_DYE_BLOCK.get())
                .add(JTBlocks.MAGENTA_DYE_BLOCK.get())
                .add(JTBlocks.ORANGE_DYE_BLOCK.get())
                .add(JTBlocks.PINK_DYE_BLOCK.get())
                .add(JTBlocks.PURPLE_DYE_BLOCK.get())
                .add(JTBlocks.RED_DYE_BLOCK.get())
                .add(JTBlocks.WHITE_DYE_BLOCK.get())
                .add(JTBlocks.YELLOW_DYE_BLOCK.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(JTBlocks.ECHO_SHARD_BLOCK.get())
                .add(JTBlocks.NETHER_STAR_BLOCK.get());


        tag(JTTags.Blocks.JANKTECH_MOB_SPAWNABLE_BLOCKS)
                .add(JTBlocks.DARK_DIRT.get())
                .add(JTBlocks.GLIMMER_GRASS.get());

        tag(JTTags.Blocks.JANKTECH_TRANSPORT)
                .add(JTBlocks.ENERGY_RECEIVER_NODE.get())
                .add(JTBlocks.ENERGY_TRANSMITTER_NODE.get())
                .add(JTBlocks.ENERGY_PIPE.get())
                .add(JTBlocks.FLUID_RECEIVER_NODE.get())
                .add(JTBlocks.FLUID_TRANSMITTER_NODE.get())
                .add(JTBlocks.FLUID_PIPE.get())
                .add(JTBlocks.ITEM_RECEIVER_NODE.get())
                .add(JTBlocks.ITEM_TRANSMITTER_NODE.get())
                .add(JTBlocks.ITEM_PIPE.get());

        tag(JTTags.Blocks.JANKTECH_GENERATORS)
                .add(JTBlocks.ENDER_GENERATOR.get())
                .add(JTBlocks.BIO_GENERATOR.get())
                .add(JTBlocks.MOBLET_GENERATOR.get())
                .add(JTBlocks.CHEESY_GENERATOR.get())
                .add(JTBlocks.COALBURN_GENERATOR.get())
                .add(JTBlocks.LAVA_GENERATOR.get())
                .add(JTBlocks.STARRY_GENERATOR.get())
                .add(JTBlocks.ECHOING_GENERATOR.get())
                .add(JTBlocks.COLORBURN_GENERATOR.get())
                .add(JTBlocks.STICKY_GENERATOR.get())
                .add(JTBlocks.WITHERED_GENERATOR.get())
                .add(JTBlocks.ALCHEMICAL_GENERATOR.get())
                .add(JTBlocks.SUPER_AWESOME_EXTREME_GENERATOR.get());

        tag(JTTags.Blocks.JANKTECH_STORAGE)
                .add(JTBlocks.STUFF_BOX.get())
                .add(JTBlocks.SPLOOSH_DRUM.get())
                .add(JTBlocks.XPOT.get());

        tag(JTTags.Blocks.JANKTECH_TRASHCANS)
                .add(JTBlocks.ITEMS_TRASHCAN.get())
                .add(JTBlocks.FLUIDS_TRASHCAN.get())
                .add(JTBlocks.ENERGY_TRASHCAN.get());

        tag(JTTags.Blocks.JANKTECH_MACHINE_THINGS)
                .add(JTBlocks.SNARKLES.get())
                .add(JTBlocks.CHUNKYBOI.get())
                .add(JTBlocks.SPLOOSH_MOOSE.get())
                .add(JTBlocks.SMASHINATOR.get())
                .add(JTBlocks.GET_IT_ROBIT.get())
                .add(JTBlocks.MOO_JUICE_ROBIT.get())
                .add(JTBlocks.MOO_JUICE_SYNTHESIZER.get())
                .add(JTBlocks.CHEESE_SQUEEZER.get())
                .add(JTBlocks.LAVA_BUCKETLER.get());

        tag(JTTags.Blocks.JANKTECH_MIC_BLOCKS)
                .add(JTBlocks.NOPESCOPE_GLASS.get())
                .add(JTBlocks.SEEMORE_GLASS.get())
                .add(JTBlocks.CHEESE_BLOCK.get())
                .add(JTBlocks.ENDER_PEARL_BLOCK.get())
                .add(JTBlocks.ECHO_SHARD_BLOCK.get())
                .add(JTBlocks.NETHER_STAR_BLOCK.get())
                .add(JTBlocks.ENERGY_RECEIVER_NODE.get())
                .add(JTBlocks.BLACK_DYE_BLOCK.get())
                .add(JTBlocks.BLUE_DYE_BLOCK.get())
                .add(JTBlocks.BROWN_DYE_BLOCK.get())
                .add(JTBlocks.CYAN_DYE_BLOCK.get())
                .add(JTBlocks.GRAY_DYE_BLOCK.get())
                .add(JTBlocks.GREEN_DYE_BLOCK.get())
                .add(JTBlocks.LIGHT_BLUE_DYE_BLOCK.get())
                .add(JTBlocks.LIGHT_GRAY_DYE_BLOCK.get())
                .add(JTBlocks.LIME_DYE_BLOCK.get())
                .add(JTBlocks.MAGENTA_DYE_BLOCK.get())
                .add(JTBlocks.ORANGE_DYE_BLOCK.get())
                .add(JTBlocks.PINK_DYE_BLOCK.get())
                .add(JTBlocks.PURPLE_DYE_BLOCK.get())
                .add(JTBlocks.RED_DYE_BLOCK.get())
                .add(JTBlocks.WHITE_DYE_BLOCK.get())
                .add(JTBlocks.YELLOW_DYE_BLOCK.get());

        tag(JTTags.Blocks.JANKTECH_DIRT_LIKE_BLOCKS)
                .add(Blocks.DIRT)
                .add(Blocks.PODZOL)
                .add(Blocks.MYCELIUM)
                .add(Blocks.COARSE_DIRT)
                .add(Blocks.ROOTED_DIRT)
                .add(Blocks.GRASS_BLOCK);

        tag(JTTags.Blocks.JANKTECH_DYE_BLOCKS)
                .add(JTBlocks.BLACK_DYE_BLOCK.get())
                .add(JTBlocks.BLUE_DYE_BLOCK.get())
                .add(JTBlocks.BROWN_DYE_BLOCK.get())
                .add(JTBlocks.CYAN_DYE_BLOCK.get())
                .add(JTBlocks.GRAY_DYE_BLOCK.get())
                .add(JTBlocks.GREEN_DYE_BLOCK.get())
                .add(JTBlocks.LIGHT_BLUE_DYE_BLOCK.get())
                .add(JTBlocks.LIGHT_GRAY_DYE_BLOCK.get())
                .add(JTBlocks.LIME_DYE_BLOCK.get())
                .add(JTBlocks.MAGENTA_DYE_BLOCK.get())
                .add(JTBlocks.ORANGE_DYE_BLOCK.get())
                .add(JTBlocks.PINK_DYE_BLOCK.get())
                .add(JTBlocks.PURPLE_DYE_BLOCK.get())
                .add(JTBlocks.RED_DYE_BLOCK.get())
                .add(JTBlocks.WHITE_DYE_BLOCK.get())
                .add(JTBlocks.YELLOW_DYE_BLOCK.get());

        tag(JTTags.Blocks.JANKTECH_WOOL_BLOCKS)
                .add(Blocks.BLACK_WOOL)
                .add(Blocks.BLUE_WOOL)
                .add(Blocks.BROWN_WOOL)
                .add(Blocks.CYAN_WOOL)
                .add(Blocks.GRAY_WOOL)
                .add(Blocks.GREEN_WOOL)
                .add(Blocks.LIGHT_BLUE_WOOL)
                .add(Blocks.LIGHT_GRAY_WOOL)
                .add(Blocks.LIME_WOOL)
                .add(Blocks.MAGENTA_WOOL)
                .add(Blocks.ORANGE_WOOL)
                .add(Blocks.PINK_WOOL)
                .add(Blocks.PURPLE_WOOL)
                .add(Blocks.RED_WOOL)
                .add(Blocks.WHITE_WOOL)
                .add(Blocks.YELLOW_WOOL);
    }
}
