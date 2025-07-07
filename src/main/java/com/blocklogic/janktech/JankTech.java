package com.blocklogic.janktech;

import com.blocklogic.janktech.block.JTBlocks;
import com.blocklogic.janktech.block.entity.JTBlockEntities;
import com.blocklogic.janktech.item.JTCreativeTabs;
import com.blocklogic.janktech.item.JTItems;
import com.blocklogic.janktech.screen.JTMenuTypes;
import com.blocklogic.janktech.screen.transport.ItemTransmitterNodeScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(JankTech.MODID)
public class JankTech {

    public static final String MODID = "janktech";

    public static final Logger LOGGER = LogUtils.getLogger();

    public JankTech(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);

        JTBlocks.register(modEventBus);
        JTItems.register(modEventBus);
        JTCreativeTabs.register(modEventBus);
        JTBlockEntities.register(modEventBus);
        JTMenuTypes.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(JankTech::registerScreens);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void registerScreens(RegisterMenuScreensEvent event) {
        event.register(JTMenuTypes.ITEM_TRANSMITTER_NODE_MENU.get(), ItemTransmitterNodeScreen::new);
    }
}