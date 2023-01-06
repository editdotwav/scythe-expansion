
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scytheexpansion.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.scytheexpansion.item.WoodenScytheItem;
import net.mcreator.scytheexpansion.item.StoneScytheItem;
import net.mcreator.scytheexpansion.item.NetheriteScytheItem;
import net.mcreator.scytheexpansion.item.NetherScytheItem;
import net.mcreator.scytheexpansion.item.IronScytheItem;
import net.mcreator.scytheexpansion.item.GoldenScytheItem;
import net.mcreator.scytheexpansion.item.GobberScytheItem;
import net.mcreator.scytheexpansion.item.EndScytheItem;
import net.mcreator.scytheexpansion.item.DiamondScytheItem;
import net.mcreator.scytheexpansion.ScytheexpansionMod;

public class ScytheexpansionModItems {
	public static Item WOODEN_SCYTHE;
	public static Item STONE_SCYTHE;
	public static Item GOLDEN_SCYTHE;
	public static Item IRON_SCYTHE;
	public static Item DIAMOND_SCYTHE;
	public static Item NETHERITE_SCYTHE;
	public static Item GOBBER_SCYTHE;
	public static Item NETHER_SCYTHE;
	public static Item END_SCYTHE;

	public static void load() {
		WOODEN_SCYTHE = Registry.register(Registry.ITEM, new ResourceLocation(ScytheexpansionMod.MODID, "wooden_scythe"), new WoodenScytheItem());
		STONE_SCYTHE = Registry.register(Registry.ITEM, new ResourceLocation(ScytheexpansionMod.MODID, "stone_scythe"), new StoneScytheItem());
		GOLDEN_SCYTHE = Registry.register(Registry.ITEM, new ResourceLocation(ScytheexpansionMod.MODID, "golden_scythe"), new GoldenScytheItem());
		IRON_SCYTHE = Registry.register(Registry.ITEM, new ResourceLocation(ScytheexpansionMod.MODID, "iron_scythe"), new IronScytheItem());
		DIAMOND_SCYTHE = Registry.register(Registry.ITEM, new ResourceLocation(ScytheexpansionMod.MODID, "diamond_scythe"), new DiamondScytheItem());
		NETHERITE_SCYTHE = Registry.register(Registry.ITEM, new ResourceLocation(ScytheexpansionMod.MODID, "netherite_scythe"),
				new NetheriteScytheItem());
		GOBBER_SCYTHE = Registry.register(Registry.ITEM, new ResourceLocation(ScytheexpansionMod.MODID, "gobber_scythe"), new GobberScytheItem());
		NETHER_SCYTHE = Registry.register(Registry.ITEM, new ResourceLocation(ScytheexpansionMod.MODID, "nether_scythe"), new NetherScytheItem());
		END_SCYTHE = Registry.register(Registry.ITEM, new ResourceLocation(ScytheexpansionMod.MODID, "end_scythe"), new EndScytheItem());
	}
}
