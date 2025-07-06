package com.blocklogic.janktech.util;

import com.blocklogic.janktech.JankTech;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class JTTags {
    public static class Blocks {
        public static final TagKey<Block> JANKTECH_MOB_SPAWNABLE_BLOCKS = createTag("janktech_mob_spawnable_blocks");
        public static final TagKey<Block> JANKTECH_TRANSPORT = createTag("janktech_transport");
        public static final TagKey<Block> JANKTECH_GENERATORS = createTag("janktech_generators");
        public static final TagKey<Block> JANKTECH_STORAGE = createTag("janktech_storage");
        public static final TagKey<Block> JANKTECH_TRASHCANS = createTag("janktech_trashcans");
        public static final TagKey<Block> JANKTECH_MACHINE_THINGS = createTag("janktech_machine_things");
        public static final TagKey<Block> JANKTECH_MIC_BLOCKS = createTag("janktech_misc_blocks");
        public static final TagKey<Block> JANKTECH_DIRT_LIKE_BLOCKS = createTag("janktech_dirt_like_blocks");
        public static final TagKey<Block> JANKTECH_DYE_BLOCKS = createTag("janktech_dye_blocks");
        public static final TagKey<Block> JANKTECH_WOOL_BLOCKS = createTag("janktech_wool_blocks");

        private static TagKey<Block> createTag (String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(JankTech.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> JANKTECH_UPGRADES = createTag("janktech_upgrades");
        public static final TagKey<Item> JANKTECH_MOB_DROPS = createTag("janktech_mob_drops");
        public static final TagKey<Item> JANKTECH_ITEM_STORAGE = createTag("janktech_item_storage");
        public static final TagKey<Item> JANKTECH_DUSTS = createTag("janktech_dusts");
        public static final TagKey<Item> JANKTECH_FOOD = createTag("janktech_food");
        public static final TagKey<Item> JANKTECH_DIRT_LIKE_BLOCK_ITEMS = createTag("janktech_dirt_like_block_items");
        public static final TagKey<Item> JANKTECH_DYE_BLOCK_ITEMS = createTag("janktech_dye_block_items");
        public static final TagKey<Item> JANKTECH_WOOL_BLOCK_ITEMS = createTag("janktech_wool_block_items");

        public static final TagKey<Item> JANKTECH_ENDER_GEN_FUEL = createTag("janktech_ender_gen_fuel");
        public static final TagKey<Item> JANKTECH_BIO_GEN_FUEL = createTag("janktech_bio_gen_fuel");
        public static final TagKey<Item> JANKTECH_MOBLET_GEN_FUEL = createTag("janktech_moblet_gen_fuel");
        public static final TagKey<Item> JANKTECH_CHEESY_GEN_FUEL = createTag("janktech_cheesy_gen_fuel");
        public static final TagKey<Item> JANKTECH_COALBURN_GEN_FUEL = createTag("janktech_coalburn_gen_fuel");
        public static final TagKey<Item> JANKTECH_LAVA_GEN_FUEL = createTag("janktech_lava_gen_fuel");
        public static final TagKey<Item> JANKTECH_STARRY_GEN_FUEL = createTag("janktech_starry_gen_fuel");
        public static final TagKey<Item> JANKTECH_ECHOING_GEN_FUEL = createTag("janktech_echoing_gen_fuel");
        public static final TagKey<Item> JANKTECH_COLORBURN_GEN_FUEL = createTag("janktech_colorburn_gen_fuel");
        public static final TagKey<Item> JANKTECH_STICKY_GEN_FUEL = createTag("janktech_sticky_gen_fuel");
        public static final TagKey<Item> JANKTECH_WITHERED_GEN_FUEL = createTag("janktech_withered_gen_fuel");
        public static final TagKey<Item> JANKTECH_ALCHEMICAL_GEN_FUEL = createTag("janktech_alchemical_gen_fuel");

        private static TagKey<Item> createTag (String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(JankTech.MODID, name));
        }
    }
}
