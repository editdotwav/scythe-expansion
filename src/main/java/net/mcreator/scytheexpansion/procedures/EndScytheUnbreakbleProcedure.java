package net.mcreator.scytheexpansion.procedures;

import net.minecraft.world.item.ItemStack;

public class EndScytheUnbreakbleProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).setDamageValue(0);
	}
}
