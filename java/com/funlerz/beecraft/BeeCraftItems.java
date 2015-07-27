package com.funlerz.beecraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.funlerz.beecraft.items.*;

public class BeeCraftItems {
	
	public static Item honeycomb;
	public static Item honeyBottle;
	
	public static void load() {
		honeycomb = new ItemHoneycomb();
		honeyBottle = new ItemHoneyBottle();
	}
	
	public static void render() {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		renderItem.getItemModelMesher().register(honeycomb, 0, new ModelResourceLocation(BeeCraftInfo.ID + ":" + ((ItemHoneycomb) honeycomb).getName(), "inventory"));
		renderItem.getItemModelMesher().register(honeyBottle, 0, new ModelResourceLocation(BeeCraftInfo.ID + ":" + ((ItemHoneyBottle) honeyBottle).getName(), "inventory"));
	}
	
}
