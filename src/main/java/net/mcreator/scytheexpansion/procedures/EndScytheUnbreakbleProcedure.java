package net.mcreator.scytheexpansion.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.scytheexpansion.ScytheexpansionMod;

import java.util.Map;

public class EndScytheUnbreakbleProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ScytheexpansionMod.LOGGER.warn("Failed to load dependency itemstack for procedure EndScytheUnbreakble!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		(itemstack).setDamageValue(0);
	}
}
