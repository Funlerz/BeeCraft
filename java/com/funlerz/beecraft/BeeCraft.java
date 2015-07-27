package com.funlerz.beecraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid=BeeCraftInfo.ID, name=BeeCraftInfo.NAME,
	 version=BeeCraftInfo.VERSION, acceptedMinecraftVersions=BeeCraftInfo.MCVERSION)
public class BeeCraft {
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		BeeCraftItems.load();
		// TODO: BeeCraftBlocks.load();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		BeeCraftRecipes.load();
		
		if (event.getSide() == Side.CLIENT) {
			BeeCraftItems.render();
			// TODO: BeeCraftBlocks.render();
		}
	}
	
}
