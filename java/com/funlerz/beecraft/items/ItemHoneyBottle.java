package com.funlerz.beecraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.funlerz.beecraft.BeeCraftInfo;

public class ItemHoneyBottle extends ItemFood {
	
private final String name = "honeyBottle";
	
	public ItemHoneyBottle() {
		super(2, 0.2f, false);
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(BeeCraftInfo.ID + "_" + name);
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack)
	{
		return EnumAction.DRINK;
	}
	
	public String getName() {
		return name;
	}
	
}
