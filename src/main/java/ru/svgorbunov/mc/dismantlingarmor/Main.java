package ru.svgorbunov.mc.dismantlingarmor;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.svgorbunov.mc.dismantlingarmor.proxy.CommonProxy;

/**
 * Created by svgor on 31.01.2016.
 */
@Mod(modid = ModInfo.MODID, name = ModInfo.NAME, version = ModInfo.VERSION)
public class Main {
    @Mod.Instance
    public static Main Instance = new Main();

    @SidedProxy(clientSide = "ru.svgorbunov.mc.dismantlingarmor.proxy.ClientProxy", serverSide = "ru.svgorbunov.mc.dismantlingarmor.proxy.ServerProxy")
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
