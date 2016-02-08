package ru.svgorbunov.mc.dismantlingloot.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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
