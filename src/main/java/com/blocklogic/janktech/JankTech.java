package com.blocklogic.janktech;

import com.blocklogic.janktech.block.JTBlocks;
import com.blocklogic.janktech.item.JTCreativeTabs;
import com.blocklogic.janktech.item.JTItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(JankTech.MODID)
public class JankTech {

    public static final String MODID = "janktech";

    public static final Logger LOGGER = LogUtils.getLogger();

    public JankTech(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);
        JTBlocks.register(modEventBus);
        JTItems.register(modEventBus);
        JTCreativeTabs.register(modEventBus);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
