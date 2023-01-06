
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scytheexpansion.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class ScytheexpansionModTabs {
	public static CreativeModeTab TAB_SCYTHE_EXPANSION;

	public static void load() {
		TAB_SCYTHE_EXPANSION = FabricItemGroupBuilder.create(new ResourceLocation("scytheexpansion", "scythe_expansion"))
				.icon(() -> new ItemStack(ScytheexpansionModItems.NETHERITE_SCYTHE)).build();
	}
}
