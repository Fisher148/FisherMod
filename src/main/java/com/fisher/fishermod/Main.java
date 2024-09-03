package com.fisher.fishermod;

import com.fisher.fishermod.proxy.ClientProxy;
import com.fisher.fishermod.proxy.ServerProxy;
import com.fisher.fishermod.util.Reference;
import com.fisher.fishermod.util.handlers.RegistryHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	public static ServerProxy serverProxy = new ServerProxy();
    public static ClientProxy clientProxy = new ClientProxy();
	
	@EventHandler
	public static void  PreInt(FMLPreInitializationEvent event) 
	{
		RegistryHandler.preInitRegistries();
	}
	@EventHandler
	public static void  init(FMLInitializationEvent event) 
	{
		
	}
	@EventHandler
	public static void  PostInt(FMLPostInitializationEvent event) 
	{
		
	}
}
