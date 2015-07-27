package com.funlerz.beecraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.funlerz.beecraft.items.ItemHoneycomb;
import com.funlerz.beecraft.items.ItemPotEmpty;
import com.funlerz.beecraft.items.ItemPotHoney;
import com.funlerz.beecraft.items.ItemPotUnfired;

public class BeeCraftItems {
	
	// Misc.
	public static Item honeycomb;
	
	// Pots
	public static Item potUnfired;
	public static Item potEmpty;
	public static Item potHoney;
	
	public static void load() {
		// Misc.
		honeycomb = new ItemHoneycomb();
		
		// Pots
		potUnfired = new ItemPotUnfired();
		potEmpty = new ItemPotEmpty();
		potHoney = new ItemPotHoney();
	}
	
	public static void render() {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		// Misc.
		renderItem.getItemModelMesher().register(honeycomb, 0, new ModelResourceLocation(BeeCraftInfo.ID + ":" + ((ItemHoneycomb) honeycomb).getName(), "inventory"));
		
		// Pots
		renderItem.getItemModelMesher().register(potUnfired, 0, new ModelResourceLocation(BeeCraftInfo.ID + ":" + ((ItemPotUnfired) potUnfired).getName(), "inventory"));
		renderItem.getItemModelMesher().register(potEmpty, 0, new ModelResourceLocation(BeeCraftInfo.ID + ":" + ((ItemPotEmpty) potEmpty).getName(), "inventory"));
		renderItem.getItemModelMesher().register(potHoney, 0, new ModelResourceLocation(BeeCraftInfo.ID + ":" + ((ItemPotHoney) potHoney).getName(), "inventory"));
	}
	
}
