
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scytheexpansion.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ScytheexpansionModTabs {
	public static CreativeModeTab TAB_SCYTHE_EXPANSION;

	public static void load() {
		TAB_SCYTHE_EXPANSION = new CreativeModeTab("tabscythe_expansion") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ScytheexpansionModItems.NETHERITE_SCYTHE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
