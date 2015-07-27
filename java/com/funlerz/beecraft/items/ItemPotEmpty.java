package com.funlerz.beecraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.funlerz.beecraft.BeeCraftInfo;

public class ItemPotEmpty extends Item {
	
	private final String name = "potEmpty";
	
	public ItemPotEmpty() {
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(16);
		setUnlocalizedName(BeeCraftInfo.ID + "_" + name);
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public String getName() {
		return name;
	}
	
}
