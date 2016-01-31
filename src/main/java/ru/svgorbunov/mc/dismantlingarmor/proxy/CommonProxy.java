package ru.svgorbunov.mc.dismantlingarmor.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by svgor on 31.01.2016.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
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

        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 3), new Object[] {Items.leather_helmet });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 2), new Object[] {Items.leather_boots });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 4), new Object[] {Items.leather_chestplate});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 4), new Object[] {Items.leather_leggings });

        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 3), new Object[] {Items.diamond_helmet });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 2), new Object[] {Items.diamond_boots });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 4), new Object[] {Items.diamond_chestplate });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 4), new Object[] {Items.diamond_leggings });
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
