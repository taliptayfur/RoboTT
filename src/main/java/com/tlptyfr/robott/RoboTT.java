package com.tlptyfr.robott;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RoboTT.MODID, name = RoboTT.MODNAME, version = RoboTT.VERSION, dependencies = "required-after:Forge@[12.16.0.1634,)", useMetadata = true)
public class RoboTT {

	public static final String MODID = "taifuru_robo_tt";
	public static final String MODNAME = "Robo TT";
	public static final String VERSION = "0.0.1";

	@SidedProxy(clientSide = "com.tlptyfr.robott.ClientProxy", serverSide = "com.tlptyfr.robott.ServerProxy")
	public static CommonProxy proxy;

	@Mod.Instance
	public static RoboTT instance;

	public static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}