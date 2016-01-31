package ru.svgorbunov.mc.dismantlingarmor.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ru.svgorbunov.mc.dismantlingarmor.SmeltingRecipes;

/**
 * Created by svgor on 31.01.2016.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
        SmeltingRecipes.init();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
