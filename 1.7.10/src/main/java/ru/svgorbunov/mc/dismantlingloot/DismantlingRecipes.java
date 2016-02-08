package ru.svgorbunov.mc.dismantlingloot;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by svgor on 01.02.2016.
 */
public class DismantlingRecipes {
    public static void init() {
        registerSmeltingRecipes();
        registerShapelessRecipes();
    }

    private static void registerSmeltingRecipes() {
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

    private static void registerShapelessRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 2, 0), new Object[]{new ItemStack(Items.leather_boots, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 2, 0), new Object[]{new ItemStack(Items.leather_helmet, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 4, 0), new Object[]{new ItemStack(Items.leather_chestplate, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 3, 0), new Object[]{new ItemStack(Items.leather_leggings, 1, OreDictionary.WILDCARD_VALUE)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 2, 0), new Object[]{new ItemStack(Items.diamond_boots, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 2, 0), new Object[]{new ItemStack(Items.diamond_helmet, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 4, 0), new Object[]{new ItemStack(Items.diamond_chestplate, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 3, 0), new Object[]{new ItemStack(Items.diamond_leggings, 1, OreDictionary.WILDCARD_VALUE)});

        // sword
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 1, 0), new Object[]{new ItemStack(Items.iron_sword, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 1, 0), new Object[]{new ItemStack(Items.golden_sword, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 1, 0), new Object[]{new ItemStack(Items.diamond_sword, 1, OreDictionary.WILDCARD_VALUE)});

        // pickaxe
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2, 0), new Object[]{new ItemStack(Items.iron_pickaxe, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 2, 0), new Object[]{new ItemStack(Items.golden_pickaxe, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 2, 0), new Object[]{new ItemStack(Items.diamond_pickaxe, 1, OreDictionary.WILDCARD_VALUE)});

        // axe
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2, 0), new Object[]{new ItemStack(Items.iron_axe, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 2, 0), new Object[]{new ItemStack(Items.golden_axe, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 2, 0), new Object[]{new ItemStack(Items.diamond_axe, 1, OreDictionary.WILDCARD_VALUE)});

        // hoe
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 1, 0), new Object[]{new ItemStack(Items.iron_hoe, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 1, 0), new Object[]{new ItemStack(Items.golden_hoe, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 1, 0), new Object[]{new ItemStack(Items.diamond_hoe, 1, OreDictionary.WILDCARD_VALUE)});
    }
}
