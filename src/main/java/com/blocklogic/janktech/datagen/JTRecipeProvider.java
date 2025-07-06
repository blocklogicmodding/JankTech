package com.blocklogic.janktech.datagen;

import com.blocklogic.janktech.block.JTBlocks;
import com.blocklogic.janktech.item.JTItems;
import com.blocklogic.janktech.util.JTTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class JTRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public JTRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //Misc
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.NOPESCOPE_GLASS.get(), 8)
                .pattern("CCC")
                .pattern("CGC")
                .pattern("CCC")
                .define('C', Items.COAL)
                .define('G', Tags.Items.GLASS_BLOCKS)
                .unlockedBy("has_coal", has(Items.COAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.SEEMORE_GLASS.get(), 8)
                .pattern("XXX")
                .pattern("XGX")
                .pattern("XXX")
                .define('X', Items.GLOWSTONE_DUST)
                .define('G', Tags.Items.GLASS_BLOCKS)
                .unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.CHEESE_BLOCK.get())
                .pattern("CC ")
                .pattern("CC ")
                .pattern("   ")
                .define('C', JTItems.CHEESE.get())
                .unlockedBy("has_cheese", has(JTItems.CHEESE.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, JTItems.CHEESE.get(), 4)
                .requires(JTBlocks.CHEESE_BLOCK.get())
                .unlockedBy("has_cheese_block", has(JTBlocks.CHEESE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ENDER_PEARL_BLOCK.get())
                .pattern("EE ")
                .pattern("EE ")
                .pattern("   ")
                .define('E', Items.ENDER_PEARL)
                .unlockedBy("has_ender_pearl", has(Items.ENDER_PEARL))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.ENDER_PEARL, 4)
                .requires(JTBlocks.ENDER_PEARL_BLOCK.get())
                .unlockedBy("has_ender_pearl_block", has(JTBlocks.ENDER_PEARL_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ECHO_SHARD_BLOCK.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', Items.ECHO_SHARD)
                .unlockedBy("has_echo_shard", has(Items.ECHO_SHARD))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.ECHO_SHARD, 9)
                .requires(JTBlocks.ECHO_SHARD_BLOCK.get())
                .unlockedBy("has_echo_shard_block", has(JTBlocks.ECHO_SHARD_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.NETHER_STAR_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.NETHER_STAR)
                .unlockedBy("has_nether_star", has(Items.NETHER_STAR))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.NETHER_STAR, 9)
                .requires(JTBlocks.NETHER_STAR_BLOCK.get())
                .unlockedBy("has_nether_star_block", has(JTBlocks.NETHER_STAR_BLOCK.get()))
                .save(recipeOutput);

        //Transport
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ENERGY_PIPE.get(), 16)
                .pattern("RCR")
                .pattern("C C")
                .pattern("RCR")
                .define('R', Items.REDSTONE)
                .define('C', Items.COPPER_INGOT)
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ENERGY_RECEIVER_NODE.get(), 4)
                .pattern(" E ")
                .pattern("EHE")
                .pattern(" E ")
                .define('E', JTBlocks.ENERGY_PIPE.get())
                .define('H', Items.HOPPER)
                .unlockedBy("has_energy_pipe", has(JTBlocks.ENERGY_PIPE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ENERGY_TRANSMITTER_NODE.get(), 4)
                .pattern(" E ")
                .pattern("EDE")
                .pattern(" E ")
                .define('E', JTBlocks.ENERGY_PIPE.get())
                .define('D', Items.DISPENSER)
                .unlockedBy("has_energy_pipe", has(JTBlocks.ENERGY_PIPE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ITEM_PIPE.get(), 16)
                .pattern("ICI")
                .pattern("C C")
                .pattern("ICI")
                .define('I', Items.IRON_INGOT)
                .define('C', Items.COPPER_INGOT)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ITEM_RECEIVER_NODE.get(), 4)
                .pattern(" E ")
                .pattern("EHE")
                .pattern(" E ")
                .define('E', JTBlocks.ITEM_PIPE.get())
                .define('H', Items.HOPPER)
                .unlockedBy("has_item_pipe", has(JTBlocks.ITEM_PIPE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ITEM_TRANSMITTER_NODE.get(), 4)
                .pattern(" E ")
                .pattern("EDE")
                .pattern(" E ")
                .define('E', JTBlocks.ITEM_PIPE.get())
                .define('D', Items.DISPENSER)
                .unlockedBy("has_item_pipe", has(JTBlocks.ITEM_PIPE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.FLUID_PIPE.get(), 16)
                .pattern("BCB")
                .pattern("C C")
                .pattern("BCB")
                .define('B', Items.BUCKET)
                .define('C', Items.COPPER_INGOT)
                .unlockedBy("has_bucket", has(Items.BUCKET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.FLUID_RECEIVER_NODE.get(), 4)
                .pattern(" E ")
                .pattern("EHE")
                .pattern(" E ")
                .define('E', JTBlocks.FLUID_PIPE.get())
                .define('H', Items.HOPPER)
                .unlockedBy("has_fluid_pipe", has(JTBlocks.FLUID_PIPE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.FLUID_TRANSMITTER_NODE.get(), 4)
                .pattern(" E ")
                .pattern("EDE")
                .pattern(" E ")
                .define('E', JTBlocks.FLUID_PIPE.get())
                .define('D', Items.DISPENSER)
                .unlockedBy("has_fluid_pipe", has(JTBlocks.FLUID_PIPE.get()))
                .save(recipeOutput);

        // Generators
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ENDER_GENERATOR.get())
                .pattern("EYE")
                .pattern("YRY")
                .pattern("EYE")
                .define('E', JTBlocks.ENDER_PEARL_BLOCK.get())
                .define('Y', Items.ENDER_EYE)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_ender_pearl_block", has(JTBlocks.ENDER_PEARL_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.BIO_GENERATOR.get())
                .pattern("HPH")
                .pattern("BRC")
                .pattern("HWH")
                .define('H', Blocks.HAY_BLOCK)
                .define('P', Items.POTATO)
                .define('B', Items.BEETROOT)
                .define('C', Items.CARROT)
                .define('W', Items.WHEAT)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_hay_block", has(Blocks.HAY_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.MOBLET_GENERATOR.get())
                .pattern("BFB")
                .pattern("SRG")
                .pattern("BXB")
                .define('B', Blocks.BONE_BLOCK)
                .define('F', Items.ROTTEN_FLESH)
                .define('S', Items.SPIDER_EYE)
                .define('G', Items.GUNPOWDER)
                .define('X', Items.BONE)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_bone_block", has(Blocks.BONE_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.CHEESY_GENERATOR.get())
                .pattern("BCB")
                .pattern("CRC")
                .pattern("BCB")
                .define('B', JTBlocks.CHEESE_BLOCK.get())
                .define('C', JTItems.CHEESE.get())
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_cheese_block", has(JTBlocks.CHEESE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.COALBURN_GENERATOR.get())
                .pattern("BCB")
                .pattern("CRC")
                .pattern("BCB")
                .define('B', Blocks.COAL_BLOCK)
                .define('C', Items.COAL)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_coal_block", has(Blocks.COAL_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.LAVA_GENERATOR.get())
                .pattern("MLM")
                .pattern("LRL")
                .pattern("MLM")
                .define('M', Blocks.MAGMA_BLOCK)
                .define('L', Items.LAVA_BUCKET)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_magma_cube", has(Blocks.MAGMA_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.STARRY_GENERATOR.get())
                .pattern("SDS")
                .pattern("DRD")
                .pattern("SDS")
                .define('D', Blocks.DIAMOND_BLOCK)
                .define('S', Items.NETHER_STAR)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_nether_star", has(Items.NETHER_STAR))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ECHOING_GENERATOR.get())
                .pattern("SES")
                .pattern("ERE")
                .pattern("SES")
                .define('S', Blocks.SCULK)
                .define('E', Items.ECHO_SHARD)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_sculk", has(Blocks.SCULK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.COLORBURN_GENERATOR.get())
                .pattern("BDB")
                .pattern("DRD")
                .pattern("BDB")
                .define('B', JTTags.Items.JANKTECH_DYE_BLOCK_ITEMS)
                .define('D', Tags.Items.DYES)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_dye", has(Tags.Items.DYES))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.STICKY_GENERATOR.get())
                .pattern("BHB")
                .pattern("HRH")
                .pattern("BHB")
                .define('B', Blocks.HONEY_BLOCK)
                .define('H', Items.HONEY_BOTTLE)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_honey_block", has(Blocks.HONEY_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.WITHERED_GENERATOR.get())
                .pattern("WDW")
                .pattern("DRD")
                .pattern("WDW")
                .define('D', Blocks.DIAMOND_BLOCK)
                .define('W', Blocks.WITHER_SKELETON_SKULL)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_wither_skeleton_skull", has(Blocks.WITHER_SKELETON_SKULL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ALCHEMICAL_GENERATOR.get())
                .pattern("PEP")
                .pattern("PRP")
                .pattern("PEP")
                .define('E', Blocks.EMERALD_BLOCK)
                .define('P', Tags.Items.POTIONS)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_emerald_block", has(Blocks.EMERALD_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.SUPER_AWESOME_EXTREME_GENERATOR.get())
                .pattern("NEN")
                .pattern("SXW")
                .pattern("NBN")
                .define('E', JTBlocks.ENDER_PEARL_BLOCK.get())
                .define('S', JTBlocks.ECHO_SHARD_BLOCK.get())
                .define('W', JTBlocks.NETHER_STAR_BLOCK.get())
                .define('B', Blocks.NETHERITE_BLOCK)
                .define('N', Items.NETHERITE_INGOT)
                .define('X', Blocks.BEACON)
                .unlockedBy("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(recipeOutput);

        // Storage
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.XPOT.get())
                .pattern("EGE")
                .pattern("GXG")
                .pattern("EGE")
                .define('E', Items.EMERALD)
                .define('G', Tags.Items.GLASS_BLOCKS)
                .define('X', Items.EXPERIENCE_BOTTLE)
                .unlockedBy("has_emerald", has(Items.EMERALD))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.SPLOOSH_DRUM.get())
                .pattern("WWW")
                .pattern("IBI")
                .pattern("WWW")
                .define('I', Items.IRON_INGOT)
                .define('W', ItemTags.PLANKS)
                .define('B', Items.BUCKET)
                .unlockedBy("has_bucket", has(Items.BUCKET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.STUFF_BOX.get())
                .pattern("WWW")
                .pattern("WCW")
                .pattern("WWW")
                .define('W', ItemTags.PLANKS)
                .define('C', Blocks.CHEST)
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .save(recipeOutput);

        // Trashcans
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ITEMS_TRASHCAN.get())
                .pattern("I I")
                .pattern("ICI")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .define('C', Blocks.CHEST)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.FLUIDS_TRASHCAN.get())
                .pattern("I I")
                .pattern("IBI")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .define('B', Items.BUCKET)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ENERGY_TRASHCAN.get())
                .pattern("I I")
                .pattern("IRI")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);

        // Machine Things
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.SNARKLES.get())
                .pattern(" S ")
                .pattern("SIS")
                .pattern(" S ")
                .define('S', Items.IRON_SWORD)
                .define('I', Items.IRON_BLOCK)
                .unlockedBy("has_iron_sword", has(Items.IRON_SWORD))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.CHUNKYBOI.get())
                .pattern("EEE")
                .pattern("ERE")
                .pattern("EEE")
                .define('E', Items.ENDER_PEARL)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_ender_pearl", has(Items.ENDER_PEARL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.SPLOOSH_MOOSE.get())
                .pattern("BBB")
                .pattern("BPB")
                .pattern("BBB")
                .define('B', Items.BUCKET)
                .define('P', Items.PISTON)
                .unlockedBy("has_bucket", has(Items.BUCKET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.SMASHINATOR.get())
                .pattern("PPP")
                .pattern("PDP")
                .pattern("RRR")
                .define('P', Items.PISTON)
                .define('D', Items.DIAMOND_PICKAXE)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_diamond_pickaxe", has(Items.DIAMOND_PICKAXE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.GET_IT_ROBIT.get())
                .pattern("DPD")
                .pattern("PSP")
                .pattern("RRR")
                .define('D', Items.DIAMOND)
                .define('P', Items.PISTON)
                .define('S', Blocks.STONE)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_diamond", has(Items.DIAMOND))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.MOO_JUICE_ROBIT.get())
                .pattern("BBB")
                .pattern("LHL")
                .pattern("III")
                .define('B', Items.MILK_BUCKET)
                .define('H', Items.HOPPER)
                .define('L', Items.LEATHER)
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_milk_bucket", has(Items.MILK_BUCKET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.MOO_JUICE_SYNTHESIZER.get())
                .pattern("WWW")
                .pattern("WBW")
                .pattern("RRR")
                .define('W', Items.WHEAT)
                .define('B', Items.MILK_BUCKET)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.CHEESE_SQUEEZER.get())
                .pattern("CCC")
                .pattern("CPC")
                .pattern("IRI")
                .define('C', JTItems.CHEESE.get())
                .define('P', Items.PISTON)
                .define('I', Items.IRON_INGOT)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_cheese", has(JTItems.CHEESE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.LAVA_BUCKETLER.get())
                .pattern("BBB")
                .pattern("BPB")
                .pattern("IRI")
                .define('B', Items.BUCKET)
                .define('P', Items.PISTON)
                .define('I', Items.IRON_INGOT)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_bucket", has(Items.BUCKET))
                .save(recipeOutput);

        // Items
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTItems.SPEEDY_NODE_TRANSFER_UPGRADE.get())
                .pattern("RGR")
                .pattern("GDG")
                .pattern("RGR")
                .define('R', Items.REDSTONE)
                .define('G', Items.GOLD_INGOT)
                .define('D', Items.DIAMOND)
                .unlockedBy("has_diamond", has(Items.DIAMOND))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTItems.ITEM_FILTER.get())
                .pattern("III")
                .pattern("IPI")
                .pattern("III")
                .define('I', Items.IRON_BARS)
                .define('P', Items.PAPER)
                .unlockedBy("has_iron_bars", has(Items.IRON_BARS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTItems.KINDA_BIG_UPGRADE.get())
                .pattern("III")
                .pattern("ICI")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .define('C', Blocks.CHEST)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTItems.REALLY_BIG_UPGRADE.get())
                .pattern("DDD")
                .pattern("DKD")
                .pattern("DDD")
                .define('D', Items.DIAMOND)
                .define('K', JTItems.KINDA_BIG_UPGRADE.get())
                .unlockedBy("has_kinda_big_upgrade", has(JTItems.KINDA_BIG_UPGRADE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTItems.ACTUALLY_HUGE_UPGRADE.get())
                .pattern("NNN")
                .pattern("NRN")
                .pattern("NNN")
                .define('N', Items.NETHERITE_INGOT)
                .define('R', JTItems.REALLY_BIG_UPGRADE.get())
                .unlockedBy("has_really_big_upgrade", has(JTItems.REALLY_BIG_UPGRADE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTItems.PAIN_INTENSIFIER_UPGRADE.get())
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', Items.IRON_SWORD)
                .define('D', Items.DIAMOND)
                .unlockedBy("has_iron_sword", has(Items.IRON_SWORD))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTItems.DOPAMINE_HIT_UPGRADE.get())
                .pattern("LLL")
                .pattern("LDL")
                .pattern("LLL")
                .define('L', Items.LAPIS_LAZULI)
                .define('D', Items.DIAMOND)
                .unlockedBy("has_lapis", has(Items.LAPIS_LAZULI))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTItems.MACHINE_THINGS_SPEEDY_UPGRADE.get())
                .pattern("RCR")
                .pattern("CRC")
                .pattern("RCR")
                .define('R', Items.REDSTONE)
                .define('C', Items.CLOCK)
                .unlockedBy("has_clock", has(Items.CLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTItems.BRIEFCASE_OF_HOLDING.get())
                .pattern("LLL")
                .pattern("LCL")
                .pattern("III")
                .define('L', Items.LEATHER)
                .define('I', Items.IRON_INGOT)
                .define('C', Blocks.CHEST)
                .unlockedBy("has_leather", has(Items.LEATHER))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTItems.MOB_BOOPER.get())
                .pattern("III")
                .pattern("IEI")
                .pattern("III")
                .define('I', Items.IRON_BARS)
                .define('E', Items.ENDER_PEARL)
                .unlockedBy("has_iron_bars", has(Items.IRON_BARS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTItems.PIPE_FACADER.get())
                .pattern("  I")
                .pattern(" I ")
                .pattern("S  ")
                .define('S', Items.STICK)
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);

        // Grilled Cheese Sandwich smelting recipe
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(JTItems.CHEESE_SAMMY.get()),
                        RecipeCategory.FOOD, JTItems.GRILLED_CHEESE_SANDWICH.get(), 0.35f, 200)
                .unlockedBy("has_cheese_bread_combo", has(JTItems.CHEESE_SAMMY.get()))
                .save(recipeOutput);

        // Cheese + Bread combination for grilled cheese
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, JTItems.CHEESE_SAMMY.get())
                .requires(JTItems.CHEESE.get(), 2)
                .requires(Items.BREAD)
                .unlockedBy("has_cheese", has(JTItems.CHEESE.get()))
                .save(recipeOutput);

        // Dye Blocks - All colors following 2x2 pattern
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.WHITE_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.WHITE_DYE)
                .unlockedBy("has_white_dye", has(Items.WHITE_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.WHITE_DYE, 4)
                .requires(JTBlocks.WHITE_DYE_BLOCK.get())
                .unlockedBy("has_white_dye_block", has(JTBlocks.WHITE_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.LIGHT_GRAY_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.LIGHT_GRAY_DYE)
                .unlockedBy("has_light_gray_dye", has(Items.LIGHT_GRAY_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LIGHT_GRAY_DYE, 4)
                .requires(JTBlocks.LIGHT_GRAY_DYE_BLOCK.get())
                .unlockedBy("has_light_gray_dye_block", has(JTBlocks.LIGHT_GRAY_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.GRAY_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.GRAY_DYE)
                .unlockedBy("has_gray_dye", has(Items.GRAY_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GRAY_DYE, 4)
                .requires(JTBlocks.GRAY_DYE_BLOCK.get())
                .unlockedBy("has_gray_dye_block", has(JTBlocks.GRAY_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.BLACK_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.BLACK_DYE)
                .unlockedBy("has_black_dye", has(Items.BLACK_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLACK_DYE, 4)
                .requires(JTBlocks.BLACK_DYE_BLOCK.get())
                .unlockedBy("has_black_dye_block", has(JTBlocks.BLACK_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.BROWN_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.BROWN_DYE)
                .unlockedBy("has_brown_dye", has(Items.BROWN_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BROWN_DYE, 4)
                .requires(JTBlocks.BROWN_DYE_BLOCK.get())
                .unlockedBy("has_brown_dye_block", has(JTBlocks.BROWN_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.RED_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.RED_DYE)
                .unlockedBy("has_red_dye", has(Items.RED_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RED_DYE, 4)
                .requires(JTBlocks.RED_DYE_BLOCK.get())
                .unlockedBy("has_red_dye_block", has(JTBlocks.RED_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.ORANGE_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.ORANGE_DYE)
                .unlockedBy("has_orange_dye", has(Items.ORANGE_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.ORANGE_DYE, 4)
                .requires(JTBlocks.ORANGE_DYE_BLOCK.get())
                .unlockedBy("has_orange_dye_block", has(JTBlocks.ORANGE_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.YELLOW_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.YELLOW_DYE)
                .unlockedBy("has_yellow_dye", has(Items.YELLOW_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.YELLOW_DYE, 4)
                .requires(JTBlocks.YELLOW_DYE_BLOCK.get())
                .unlockedBy("has_yellow_dye_block", has(JTBlocks.YELLOW_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.LIME_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.LIME_DYE)
                .unlockedBy("has_lime_dye", has(Items.LIME_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LIME_DYE, 4)
                .requires(JTBlocks.LIME_DYE_BLOCK.get())
                .unlockedBy("has_lime_dye_block", has(JTBlocks.LIME_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.GREEN_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.GREEN_DYE)
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GREEN_DYE, 4)
                .requires(JTBlocks.GREEN_DYE_BLOCK.get())
                .unlockedBy("has_green_dye_block", has(JTBlocks.GREEN_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.CYAN_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.CYAN_DYE)
                .unlockedBy("has_cyan_dye", has(Items.CYAN_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.CYAN_DYE, 4)
                .requires(JTBlocks.CYAN_DYE_BLOCK.get())
                .unlockedBy("has_cyan_dye_block", has(JTBlocks.CYAN_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.LIGHT_BLUE_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_light_blue_dye", has(Items.LIGHT_BLUE_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE, 4)
                .requires(JTBlocks.LIGHT_BLUE_DYE_BLOCK.get())
                .unlockedBy("has_light_blue_dye_block", has(JTBlocks.LIGHT_BLUE_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.BLUE_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.BLUE_DYE)
                .unlockedBy("has_blue_dye", has(Items.BLUE_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLUE_DYE, 4)
                .requires(JTBlocks.BLUE_DYE_BLOCK.get())
                .unlockedBy("has_blue_dye_block", has(JTBlocks.BLUE_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.PURPLE_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.PURPLE_DYE)
                .unlockedBy("has_purple_dye", has(Items.PURPLE_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PURPLE_DYE, 4)
                .requires(JTBlocks.PURPLE_DYE_BLOCK.get())
                .unlockedBy("has_purple_dye_block", has(JTBlocks.PURPLE_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.MAGENTA_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.MAGENTA_DYE)
                .unlockedBy("has_magenta_dye", has(Items.MAGENTA_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MAGENTA_DYE, 4)
                .requires(JTBlocks.MAGENTA_DYE_BLOCK.get())
                .unlockedBy("has_magenta_dye_block", has(JTBlocks.MAGENTA_DYE_BLOCK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, JTBlocks.PINK_DYE_BLOCK.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("   ")
                .define('D', Items.PINK_DYE)
                .unlockedBy("has_pink_dye", has(Items.PINK_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PINK_DYE, 4)
                .requires(JTBlocks.PINK_DYE_BLOCK.get())
                .unlockedBy("has_pink_dye_block", has(JTBlocks.PINK_DYE_BLOCK.get()))
                .save(recipeOutput);

    }
}
