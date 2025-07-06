package com.blocklogic.janktech.item;

import com.blocklogic.janktech.JankTech;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class JTItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JankTech.MODID);

    public static final DeferredItem<Item> SPEEDY_NODE_TRANSFER_UPGRADE = ITEMS.register("speedy_node_transfer_upgrade",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.speedy_node_transfer_upgrade").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> ITEM_FILTER = ITEMS.register("item_filter",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.item_filter").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> KINDA_BIG_UPGRADE = ITEMS.register("kinda_big_upgrade",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.kinda_big_upgrade").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> REALLY_BIG_UPGRADE = ITEMS.register("really_big_upgrade",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.really_big_upgrade").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> ACTUALLY_HUGE_UPGRADE = ITEMS.register("actually_huge_upgrade",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.actually_huge_upgrade").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> PAIN_INTENSIFIER_UPGRADE = ITEMS.register("pain_intensifier_upgrade",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.pain_intensifier_upgrade").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> DOPAMINE_HIT_UPGRADE = ITEMS.register("dopamine_hit_upgrade",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.dopamine_hit_upgrade").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> MACHINE_THINGS_SPEEDY_UPGRADE = ITEMS.register("machine_things_speedy_upgrade",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.machine_things_speedy_upgrade").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> WITHER_WISP = ITEMS.register("wither_wisp",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.wither_wisp").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> GLIMMER_SPROUT = ITEMS.register("glimmer_sprout",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.glimmer_sprout").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.cheese").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> CHEESE_SAMMY = ITEMS.register("cheese_sammy",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.cheese_sammy").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> GRILLED_CHEESE_SANDWICH = ITEMS.register("grilled_cheese_sandwich",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.grilled_cheese_sandwich").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> BRIEFCASE_OF_HOLDING = ITEMS.register("briefcase_of_holding",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.briefcase_of_holding").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> MOB_BOOPER = ITEMS.register("mob_booper",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.mob_booper").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> PIPE_FACADER = ITEMS.register("pipe_facader",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.pipe_facader").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.copper_dust").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> IRON_DUST = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.iron_dust").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static final DeferredItem<Item> GOLD_DUST = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties())
            {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.item.gold_dust").withStyle(ChatFormatting.DARK_PURPLE));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.item.shift_info"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
