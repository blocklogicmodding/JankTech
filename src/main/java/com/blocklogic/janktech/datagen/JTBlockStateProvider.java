package com.blocklogic.janktech.datagen;

import com.blocklogic.janktech.JankTech;
import com.blocklogic.janktech.block.JTBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class JTBlockStateProvider extends BlockStateProvider {
    public JTBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, JankTech.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(JTBlocks.CHEESE_BLOCK);
        blockWithItem(JTBlocks.ENDER_PEARL_BLOCK);
        blockWithItem(JTBlocks.NETHER_STAR_BLOCK);
        blockWithItem(JTBlocks.ECHO_SHARD_BLOCK);
        blockWithItem(JTBlocks.NOPESCOPE_GLASS);
        blockWithItem(JTBlocks.SEEMORE_GLASS);

        blockWithItem(JTBlocks.BLACK_DYE_BLOCK);
        blockWithItem(JTBlocks.BLUE_DYE_BLOCK);
        blockWithItem(JTBlocks.BROWN_DYE_BLOCK);
        blockWithItem(JTBlocks.CYAN_DYE_BLOCK);
        blockWithItem(JTBlocks.GRAY_DYE_BLOCK);
        blockWithItem(JTBlocks.GREEN_DYE_BLOCK);
        blockWithItem(JTBlocks.LIGHT_BLUE_DYE_BLOCK);
        blockWithItem(JTBlocks.LIGHT_GRAY_DYE_BLOCK);
        blockWithItem(JTBlocks.LIME_DYE_BLOCK);
        blockWithItem(JTBlocks.MAGENTA_DYE_BLOCK);
        blockWithItem(JTBlocks.ORANGE_DYE_BLOCK);
        blockWithItem(JTBlocks.PINK_DYE_BLOCK);
        blockWithItem(JTBlocks.PURPLE_DYE_BLOCK);
        blockWithItem(JTBlocks.RED_DYE_BLOCK);
        blockWithItem(JTBlocks.WHITE_DYE_BLOCK);
        blockWithItem(JTBlocks.YELLOW_DYE_BLOCK);
    }

    private void blockWithItem (DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
