package com.funlerz.beecraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.funlerz.beecraft.BeeCraftInfo;

public class ItemHoneycomb extends Item {
	
	private final String name = "honeycomb";
	
	public ItemHoneycomb() {
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(BeeCraftInfo.ID + "_" + name);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public String getName() {
		return name;
	}
	
}
