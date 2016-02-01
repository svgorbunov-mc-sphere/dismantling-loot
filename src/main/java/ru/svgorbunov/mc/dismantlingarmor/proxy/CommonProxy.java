package ru.svgorbunov.mc.dismantlingarmor.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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
