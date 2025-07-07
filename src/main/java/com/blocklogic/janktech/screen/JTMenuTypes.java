package com.blocklogic.janktech.screen;

import com.blocklogic.janktech.JankTech;
import com.blocklogic.janktech.screen.transport.ItemTransmitterNodeMenu;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class JTMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(BuiltInRegistries.MENU, JankTech.MODID);

    public static final Supplier<MenuType<ItemTransmitterNodeMenu>> ITEM_TRANSMITTER_NODE_MENU =
            MENUS.register("item_transmitter_node_menu", () ->
                    IMenuTypeExtension.create(ItemTransmitterNodeMenu::new));

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}