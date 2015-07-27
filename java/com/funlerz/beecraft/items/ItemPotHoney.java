package com.funlerz.beecraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.funlerz.beecraft.BeeCraftInfo;
import com.funlerz.beecraft.BeeCraftItems;

public class ItemPotHoney extends ItemFood {
	
private final String name = "potHoney";
	
	public ItemPotHoney() {
		super(3, 0.4f, false);
		this.setMaxStackSize(1);
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(BeeCraftInfo.ID + "_" + name);
	}
	
	// Returns an empty pot to the user after they finish eating.
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        playerIn.getFoodStats().addStats(this, stack);
		return new ItemStack(BeeCraftItems.potEmpty);
	}
	
	public String getName() {
		return name;
	}
	
}
