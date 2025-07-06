package com.blocklogic.janktech.item;

import com.blocklogic.janktech.JankTech;
import com.blocklogic.janktech.block.JTBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class JTCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JankTech.MODID);

    public static final Supplier<CreativeModeTab> JANKTECH = CREATIVE_MODE_TAB.register("janktech",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(JTBlocks.MOO_JUICE_ROBIT.get()))
                    .title(Component.translatable("creativetab.janktech.janktech"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(JTItems.SPEEDY_NODE_TRANSFER_UPGRADE);
                        output.accept(JTItems.ITEM_FILTER);
                        output.accept(JTItems.KINDA_BIG_UPGRADE);
                        output.accept(JTItems.REALLY_BIG_UPGRADE);
                        output.accept(JTItems.ACTUALLY_HUGE_UPGRADE);
                        output.accept(JTItems.PAIN_INTENSIFIER_UPGRADE);
                        output.accept(JTItems.DOPAMINE_HIT_UPGRADE);
                        output.accept(JTItems.MACHINE_THINGS_SPEEDY_UPGRADE);
                        output.accept(JTItems.WITHER_WISP);
                        output.accept(JTItems.GLIMMER_SPROUT);
                        output.accept(JTItems.CHEESE);
                        output.accept(JTItems.GRILLED_CHEESE_SANDWICH);
                        output.accept(JTItems.BRIEFCASE_OF_HOLDING);
                        output.accept(JTItems.MOB_BOOPER);
                        output.accept(JTItems.PIPE_FACADER);

                        output.accept(JTItems.COPPER_DUST);
                        output.accept(JTItems.IRON_DUST);
                        output.accept(JTItems.GOLD_DUST);

                        output.accept(JTBlocks.CHEESE_BLOCK);
                        output.accept(JTBlocks.ENDER_PEARL_BLOCK);
                        output.accept(JTBlocks.NETHER_STAR_BLOCK);
                        output.accept(JTBlocks.ECHO_SHARD_BLOCK);
                        output.accept(JTBlocks.DARK_DIRT);
                        output.accept(JTBlocks.GLIMMER_GRASS);
                        output.accept(JTBlocks.NOPESCOPE_GLASS);
                        output.accept(JTBlocks.SEEMORE_GLASS);

                        output.accept(JTBlocks.ENERGY_PIPE);
                        output.accept(JTBlocks.FLUID_PIPE);
                        output.accept(JTBlocks.ITEM_PIPE);
                        output.accept(JTBlocks.ENERGY_RECEIVER_NODE);
                        output.accept(JTBlocks.FLUID_RECEIVER_NODE);
                        output.accept(JTBlocks.ITEM_RECEIVER_NODE);
                        output.accept(JTBlocks.ENERGY_TRANSMITTER_NODE);
                        output.accept(JTBlocks.FLUID_TRANSMITTER_NODE);
                        output.accept(JTBlocks.ITEM_TRANSMITTER_NODE);

                        output.accept(JTBlocks.ENDER_GENERATOR);
                        output.accept(JTBlocks.BIO_GENERATOR);
                        output.accept(JTBlocks.MOBLET_GENERATOR);
                        output.accept(JTBlocks.CHEESY_GENERATOR);
                        output.accept(JTBlocks.COALBURN_GENERATOR);
                        output.accept(JTBlocks.LAVA_GENERATOR);
                        output.accept(JTBlocks.STARRY_GENERATOR);
                        output.accept(JTBlocks.ECHOING_GENERATOR);
                        output.accept(JTBlocks.COLORBURN_GENERATOR);
                        output.accept(JTBlocks.STICKY_GENERATOR);
                        output.accept(JTBlocks.WITHERED_GENERATOR);
                        output.accept(JTBlocks.ALCHEMICAL_GENERATOR);
                        output.accept(JTBlocks.SUPER_AWESOME_EXTREME_GENERATOR);

                        output.accept(JTBlocks.XPOT);
                        output.accept(JTBlocks.SPLOOSH_DRUM);
                        output.accept(JTBlocks.STUFF_BOX);

                        output.accept(JTBlocks.ENERGY_TRASHCAN);
                        output.accept(JTBlocks.FLUIDS_TRASHCAN);
                        output.accept(JTBlocks.ITEMS_TRASHCAN);

                        output.accept(JTBlocks.SNARKLES);
                        output.accept(JTBlocks.CHUNKYBOI);
                        output.accept(JTBlocks.SPLOOSH_MOOSE);
                        output.accept(JTBlocks.SMASHINATOR);
                        output.accept(JTBlocks.GET_IT_ROBIT);
                        output.accept(JTBlocks.MOO_JUICE_ROBIT);
                        output.accept(JTBlocks.MOO_JUICE_SYNTHESIZER);
                        output.accept(JTBlocks.CHEESE_SQUEEZER);
                        output.accept(JTBlocks.LAVA_BUCKETLER);

                        output.accept(JTBlocks.BLACK_DYE_BLOCK);
                        output.accept(JTBlocks.BLUE_DYE_BLOCK);
                        output.accept(JTBlocks.BROWN_DYE_BLOCK);
                        output.accept(JTBlocks.CYAN_DYE_BLOCK);
                        output.accept(JTBlocks.GRAY_DYE_BLOCK);
                        output.accept(JTBlocks.GREEN_DYE_BLOCK);
                        output.accept(JTBlocks.LIGHT_BLUE_DYE_BLOCK);
                        output.accept(JTBlocks.LIGHT_GRAY_DYE_BLOCK);
                        output.accept(JTBlocks.LIME_DYE_BLOCK);
                        output.accept(JTBlocks.MAGENTA_DYE_BLOCK);
                        output.accept(JTBlocks.ORANGE_DYE_BLOCK);
                        output.accept(JTBlocks.PINK_DYE_BLOCK);
                        output.accept(JTBlocks.PURPLE_DYE_BLOCK);
                        output.accept(JTBlocks.RED_DYE_BLOCK);
                        output.accept(JTBlocks.WHITE_DYE_BLOCK);
                        output.accept(JTBlocks.YELLOW_DYE_BLOCK);
                    })
                    .build());

    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
