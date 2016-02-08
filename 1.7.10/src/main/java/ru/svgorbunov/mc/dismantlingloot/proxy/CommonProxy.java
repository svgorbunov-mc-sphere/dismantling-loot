package ru.svgorbunov.mc.dismantlingloot.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ru.svgorbunov.mc.dismantlingloot.DismantlingRecipes;

/**
 * Created by svgor on 31.01.2016.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
        DismantlingRecipes.init();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
