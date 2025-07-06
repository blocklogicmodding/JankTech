package com.blocklogic.janktech.datagen;

import com.blocklogic.janktech.JankTech;
import com.blocklogic.janktech.item.JTItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class JTItemModelProvider extends ItemModelProvider {
    public JTItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, JankTech.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(JTItems.SPEEDY_NODE_TRANSFER_UPGRADE.get());
        basicItem(JTItems.ITEM_FILTER.get());
        basicItem(JTItems.KINDA_BIG_UPGRADE.get());
        basicItem(JTItems.REALLY_BIG_UPGRADE.get());
        basicItem(JTItems.ACTUALLY_HUGE_UPGRADE.get());
        basicItem(JTItems.PAIN_INTENSIFIER_UPGRADE.get());
        basicItem(JTItems.DOPAMINE_HIT_UPGRADE.get());
        basicItem(JTItems.MACHINE_THINGS_SPEEDY_UPGRADE.get());
        basicItem(JTItems.WITHER_WISP.get());
        basicItem(JTItems.GLIMMER_SPROUT.get());
        basicItem(JTItems.BRIEFCASE_OF_HOLDING.get());
        basicItem(JTItems.MOB_BOOPER.get());
        basicItem(JTItems.PIPE_FACADER.get());
        basicItem(JTItems.COPPER_DUST.get());
        basicItem(JTItems.IRON_DUST.get());
        basicItem(JTItems.GOLD_DUST.get());
        basicItem(JTItems.CHEESE.get());
        basicItem(JTItems.GRILLED_CHEESE_SANDWICH.get());
        basicItem(JTItems.CHEESE_SAMMY.get());
    }
}
