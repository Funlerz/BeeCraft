package com.funlerz.beecraft;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BeeCraftRecipes {
	
	public static void load() {
		// Unfired Pot
		GameRegistry.addShapedRecipe(new ItemStack(BeeCraftItems.potUnfired),
				"C C",
				" C ",
				'C', Items.clay_ball);
		
		// Empty Pot
		GameRegistry.addSmelting(BeeCraftItems.potUnfired, new ItemStack(BeeCraftItems.potEmpty), 0);
		
		// Honey Pot
		GameRegistry.addShapelessRecipe(new ItemStack(BeeCraftItems.potHoney),
				BeeCraftItems.honeycomb, BeeCraftItems.honeycomb, BeeCraftItems.honeycomb, BeeCraftItems.potEmpty);
		
	}
	
}
