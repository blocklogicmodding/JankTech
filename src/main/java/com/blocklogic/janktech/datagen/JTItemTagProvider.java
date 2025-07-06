package com.blocklogic.janktech.datagen;

import com.blocklogic.janktech.JankTech;
import com.blocklogic.janktech.block.JTBlocks;
import com.blocklogic.janktech.item.JTItems;
import com.blocklogic.janktech.util.JTTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class JTItemTagProvider extends ItemTagsProvider {
    public JTItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, JankTech.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(Tags.Items.FOODS)
                .add(JTItems.CHEESE.get())
                .add(JTItems.GRILLED_CHEESE_SANDWICH.get())
                .add(JTItems.CHEESE_SAMMY.get());


        tag(JTTags.Items.JANKTECH_UPGRADES)
                .add(JTItems.SPEEDY_NODE_TRANSFER_UPGRADE.get())
                .add(JTItems.ITEM_FILTER.get())
                .add(JTItems.KINDA_BIG_UPGRADE.get())
                .add(JTItems.REALLY_BIG_UPGRADE.get())
                .add(JTItems.ACTUALLY_HUGE_UPGRADE.get())
                .add(JTItems.PAIN_INTENSIFIER_UPGRADE.get())
                .add(JTItems.DOPAMINE_HIT_UPGRADE.get())
                .add(JTItems.MACHINE_THINGS_SPEEDY_UPGRADE.get());

        tag(JTTags.Items.JANKTECH_MOB_DROPS)
                .add(JTItems.WITHER_WISP.get())
                .add(JTItems.GLIMMER_SPROUT.get());

        tag(JTTags.Items.JANKTECH_ITEM_STORAGE)
                .add(JTItems.BRIEFCASE_OF_HOLDING.get())
                .add(JTItems.MOB_BOOPER.get());

        tag(JTTags.Items.JANKTECH_DUSTS)
                .add(JTItems.COPPER_DUST.get())
                .add(JTItems.IRON_DUST.get())
                .add(JTItems.GOLD_DUST.get());

        tag(JTTags.Items.JANKTECH_FOOD)
                .add(JTItems.CHEESE.get())
                .add(JTItems.GRILLED_CHEESE_SANDWICH.get())
                .add(JTItems.CHEESE_SAMMY.get());

        copy(JTTags.Blocks.JANKTECH_DIRT_LIKE_BLOCKS, JTTags.Items.JANKTECH_DIRT_LIKE_BLOCK_ITEMS);
        copy(JTTags.Blocks.JANKTECH_DYE_BLOCKS, JTTags.Items.JANKTECH_DYE_BLOCK_ITEMS);
        copy(JTTags.Blocks.JANKTECH_WOOL_BLOCKS, JTTags.Items.JANKTECH_WOOL_BLOCK_ITEMS);

        tag(JTTags.Items.JANKTECH_ENDER_GEN_FUEL)
                .add(Items.ENDER_EYE)
                .add(Items.ENDER_PEARL)
                .add(JTBlocks.ENDER_PEARL_BLOCK.asItem());

        tag(JTTags.Items.JANKTECH_BIO_GEN_FUEL)
                .add(Blocks.HAY_BLOCK.asItem())
                .add(Blocks.MOSS_BLOCK.asItem())
                .add(Blocks.OAK_LEAVES.asItem())
                .add(Blocks.SPRUCE_LEAVES.asItem())
                .add(Blocks.BIRCH_LEAVES.asItem())
                .add(Blocks.JUNGLE_LEAVES.asItem())
                .add(Blocks.ACACIA_LEAVES.asItem())
                .add(Blocks.DARK_OAK_LEAVES.asItem())
                .add(Blocks.MANGROVE_LEAVES.asItem())
                .add(Blocks.CHERRY_LEAVES.asItem())
                .add(Blocks.AZALEA_LEAVES.asItem())
                .add(Blocks.FLOWERING_AZALEA_LEAVES.asItem())
                .add(Blocks.OAK_SAPLING.asItem())
                .add(Blocks.SPRUCE_SAPLING.asItem())
                .add(Blocks.BIRCH_SAPLING.asItem())
                .add(Blocks.JUNGLE_SAPLING.asItem())
                .add(Blocks.ACACIA_SAPLING.asItem())
                .add(Blocks.DARK_OAK_SAPLING.asItem())
                .add(Blocks.MANGROVE_PROPAGULE.asItem())
                .add(Blocks.CHERRY_SAPLING.asItem())
                .addTag(Tags.Items.CROPS)
                .addTag(Tags.Items.SEEDS)
                .addTag(Tags.Items.FOODS);

        tag(JTTags.Items.JANKTECH_MOBLET_GEN_FUEL)
                .add(Items.ROTTEN_FLESH)
                .add(Items.BONE)
                .add(Items.BONE_BLOCK.asItem())
                .add(Items.STRING)
                .addTag(JTTags.Items.JANKTECH_WOOL_BLOCK_ITEMS)
                .add(Items.SPIDER_EYE)
                .add(Items.GUNPOWDER)
                .add(Items.FEATHER)
                .add(Items.CHICKEN)
                .add(Items.LEATHER)
                .add(Items.BEEF)
                .add(Items.PORKCHOP)
                .add(Items.RABBIT)
                .add(Items.RABBIT_HIDE)
                .add(Items.SLIME_BALL);

        tag(JTTags.Items.JANKTECH_CHEESY_GEN_FUEL)
                .add(JTItems.CHEESE.get())
                .add(JTBlocks.CHEESE_BLOCK.asItem());

        tag(JTTags.Items.JANKTECH_COALBURN_GEN_FUEL)
                .add(Items.COAL)
                .add(Items.CHARCOAL)
                .add(Blocks.COAL_BLOCK.asItem());

        tag(JTTags.Items.JANKTECH_LAVA_GEN_FUEL)
                .add(Items.LAVA_BUCKET);

        tag(JTTags.Items.JANKTECH_STARRY_GEN_FUEL)
                .add(JTBlocks.NETHER_STAR_BLOCK.asItem());

        tag(JTTags.Items.JANKTECH_ECHOING_GEN_FUEL)
                .add(JTBlocks.ECHO_SHARD_BLOCK.asItem());

        tag(JTTags.Items.JANKTECH_COLORBURN_GEN_FUEL)
                .addTag(Tags.Items.DYES)
                .addTag(JTTags.Items.JANKTECH_DYE_BLOCK_ITEMS);

        tag(JTTags.Items.JANKTECH_STICKY_GEN_FUEL)
                .add(Items.HONEY_BOTTLE)
                .add(Blocks.HONEY_BLOCK.asItem());

        tag(JTTags.Items.JANKTECH_WITHERED_GEN_FUEL)
                .add(Blocks.WITHER_SKELETON_SKULL.asItem());

        tag(JTTags.Items.JANKTECH_ALCHEMICAL_GEN_FUEL)
                .addTag(Tags.Items.POTIONS);
    }
}
