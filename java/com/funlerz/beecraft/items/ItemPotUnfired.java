package com.funlerz.beecraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.funlerz.beecraft.BeeCraftInfo;

public class ItemPotUnfired extends Item {
	
	private final String name = "potUnfired";
	
	public ItemPotUnfired() {
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(BeeCraftInfo.ID + "_" + name);
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public String getName() {
		return name;
	}
	
}
