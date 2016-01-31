package ru.svgorbunov.mc.remeltingarmor;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ru.svgorbunov.mc.remeltingarmor.proxy.CommonProxy;

/**
 * Created by svgor on 31.01.2016.
 */
@Mod(modid = ModInfo.MODID, name = ModInfo.NAME, version = ModInfo.VERSION)
public class Main {
    @Mod.Instance
    public static Main Instance = new Main(); // TODO: public field??

    @SidedProxy(clientSide = "ru.svgorbunov.mc.remeltingarmor.proxy.ClientProxy", serverSide = "ru.svgorbunov.mc.remeltingarmor.proxy.ServerProxy")
    private static CommonProxy _proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        _proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        _proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        _proxy.postInit(e);
    }
}
