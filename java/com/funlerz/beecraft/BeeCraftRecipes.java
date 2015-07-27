package com.funlerz.beecraft;

import com.funlerz.beecraft.items.ItemHoneyBottle;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BeeCraftRecipes {
	
	public static void load() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(BeeCraftItems.honeyBottle, 3),
				BeeCraftItems.honeycomb, Items.glass_bottle, Items.glass_bottle, Items.glass_bottle);
		
	}
	
}
