package com.blocklogic.janktech.block;

import com.blocklogic.janktech.JankTech;
import com.blocklogic.janktech.item.JTItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class JTBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(JankTech.MODID);

    //Mob Spawning
    public static final DeferredBlock<Block> DARK_DIRT = registerBlock("dark_dirt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> GLIMMER_GRASS = registerBlock("glimmer_grass",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    // Misc
    public static final DeferredBlock<Block> NOPESCOPE_GLASS = registerBlock("nopescope_glass",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> SEEMORE_GLASS = registerBlock("seemore_glass",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> CHEESE_BLOCK = registerBlock("block_of_cheese",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> ENDER_PEARL_BLOCK = registerBlock("block_of_ender_pearls",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> NETHER_STAR_BLOCK = registerBlock("block_of_nether_stars",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> ECHO_SHARD_BLOCK = registerBlock("block_of_echo_shards",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> BLACK_DYE_BLOCK = registerBlock("black_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> BLUE_DYE_BLOCK = registerBlock("blue_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> BROWN_DYE_BLOCK = registerBlock("brown_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> CYAN_DYE_BLOCK = registerBlock("cyan_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> GRAY_DYE_BLOCK = registerBlock("gray_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> GREEN_DYE_BLOCK = registerBlock("green_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> LIGHT_BLUE_DYE_BLOCK = registerBlock("light_blue_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> LIGHT_GRAY_DYE_BLOCK = registerBlock("light_gray_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> LIME_DYE_BLOCK = registerBlock("lime_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> MAGENTA_DYE_BLOCK = registerBlock("magenta_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> ORANGE_DYE_BLOCK = registerBlock("orange_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> PINK_DYE_BLOCK = registerBlock("pink_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> PURPLE_DYE_BLOCK = registerBlock("purple_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> RED_DYE_BLOCK = registerBlock("red_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> WHITE_DYE_BLOCK = registerBlock("white_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> YELLOW_DYE_BLOCK = registerBlock("yellow_dye_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GRAVEL)
                    .noOcclusion())
    );

    //Transport
    public static final DeferredBlock<Block> ENERGY_RECEIVER_NODE = registerBlock("energy_receiver_node",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> ENERGY_TRANSMITTER_NODE = registerBlock("energy_transmitter_node",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> ENERGY_PIPE = registerBlock("energy_pipe",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> FLUID_RECEIVER_NODE = registerBlock("fluid_receiver_node",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> FLUID_TRANSMITTER_NODE = registerBlock("fluid_transmitter_node",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> FLUID_PIPE = registerBlock("fluid_pipe",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> ITEM_RECEIVER_NODE = registerBlock("item_receiver_node",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> ITEM_TRANSMITTER_NODE = registerBlock("item_transmitter_node",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> ITEM_PIPE = registerBlock("item_pipe",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    //Generators
    public static final DeferredBlock<Block> ENDER_GENERATOR = registerBlock("ender_generator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> BIO_GENERATOR = registerBlock("bio_generator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> MOBLET_GENERATOR = registerBlock("moblet_generator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> CHEESY_GENERATOR = registerBlock("cheesy_generator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> COALBURN_GENERATOR = registerBlock("coalburn_generator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> LAVA_GENERATOR = registerBlock("lava_generator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> STARRY_GENERATOR = registerBlock("starry_generator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> ECHOING_GENERATOR = registerBlock("echoing_generator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> COLORBURN_GENERATOR = registerBlock("colorburn_generator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> STICKY_GENERATOR = registerBlock("sticky_generator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> WITHERED_GENERATOR = registerBlock("withered_generator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> ALCHEMICAL_GENERATOR = registerBlock("alchemical_generator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> SUPER_AWESOME_EXTREME_GENERATOR = registerBlock("super_awesome_extreme_generator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    //Storage
    public static final DeferredBlock<Block> XPOT = registerBlock("xpot",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> SPLOOSH_DRUM = registerBlock("sploosh_drum",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> STUFF_BOX = registerBlock("stuff_box",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    //Trashcans
    public static final DeferredBlock<Block> ITEMS_TRASHCAN = registerBlock("items_trashcan",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> FLUIDS_TRASHCAN = registerBlock("fluids_trashcan",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> ENERGY_TRASHCAN = registerBlock("energy_trashcan",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    //Machine Things
    public static final DeferredBlock<Block> SNARKLES = registerBlock("snarkles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> CHUNKYBOI = registerBlock("chunkyboi",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> SPLOOSH_MOOSE = registerBlock("sploosh_moose",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> SMASHINATOR = registerBlock("smashinator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> GET_IT_ROBIT = registerBlock("get_it_robit",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> MOO_JUICE_ROBIT = registerBlock("moo_juice_robit",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> MOO_JUICE_SYNTHESIZER = registerBlock("moo_juice_synthesizer",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> CHEESE_SQUEEZER = registerBlock("cheese_squeezer",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );

    public static final DeferredBlock<Block> LAVA_BUCKETLER = registerBlock("lava_bucketler",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .noOcclusion())
    );


    private static <T extends Block>DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        JTItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
