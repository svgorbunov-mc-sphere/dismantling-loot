package ru.svgorbunov.mc.dismantlingarmor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by svgor on 01.02.2016.
 */
public class SmeltingRecipes {
    public static void init() {
        GameRegistry.addSmelting(Items.iron_helmet, new ItemStack(Items.iron_ingot, 2, 0), 0.1F);
        GameRegistry.addSmelting(Items.iron_boots, new ItemStack(Items.iron_ingot, 2, 0), 0.1F);
        GameRegistry.addSmelting(Items.iron_chestplate, new ItemStack(Items.iron_ingot, 4, 0), 0.1F);
        GameRegistry.addSmelting(Items.iron_leggings, new ItemStack(Items.iron_ingot, 3, 0), 0.1F);

        GameRegistry.addSmelting(Items.chainmail_helmet, new ItemStack(Items.iron_ingot, 2, 0), 0.1F);
        GameRegistry.addSmelting(Items.chainmail_boots, new ItemStack(Items.iron_ingot, 2, 0), 0.1F);
        GameRegistry.addSmelting(Items.chainmail_chestplate, new ItemStack(Items.iron_ingot, 4, 0), 0.1F);
        GameRegistry.addSmelting(Items.chainmail_leggings, new ItemStack(Items.iron_ingot, 3, 0), 0.1F);

        GameRegistry.addSmelting(Items.golden_helmet, new ItemStack(Items.gold_ingot, 2, 0), 0.1F);
        GameRegistry.addSmelting(Items.golden_boots, new ItemStack(Items.gold_ingot, 2, 0), 0.1F);
        GameRegistry.addSmelting(Items.golden_chestplate, new ItemStack(Items.gold_ingot, 4, 0), 0.1F);
        GameRegistry.addSmelting(Items.golden_leggings, new ItemStack(Items.gold_ingot, 3, 0), 0.1F);
    }
}
