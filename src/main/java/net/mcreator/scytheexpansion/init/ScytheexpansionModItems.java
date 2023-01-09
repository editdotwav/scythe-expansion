
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scytheexpansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

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
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ScytheexpansionMod.MODID);
	public static final RegistryObject<Item> WOODEN_SCYTHE = REGISTRY.register("wooden_scythe", () -> new WoodenScytheItem());
	public static final RegistryObject<Item> STONE_SCYTHE = REGISTRY.register("stone_scythe", () -> new StoneScytheItem());
	public static final RegistryObject<Item> GOLDEN_SCYTHE = REGISTRY.register("golden_scythe", () -> new GoldenScytheItem());
	public static final RegistryObject<Item> IRON_SCYTHE = REGISTRY.register("iron_scythe", () -> new IronScytheItem());
	public static final RegistryObject<Item> DIAMOND_SCYTHE = REGISTRY.register("diamond_scythe", () -> new DiamondScytheItem());
	public static final RegistryObject<Item> NETHERITE_SCYTHE = REGISTRY.register("netherite_scythe", () -> new NetheriteScytheItem());
	public static final RegistryObject<Item> GOBBER_SCYTHE = REGISTRY.register("gobber_scythe", () -> new GobberScytheItem());
	public static final RegistryObject<Item> NETHER_SCYTHE = REGISTRY.register("nether_scythe", () -> new NetherScytheItem());
	public static final RegistryObject<Item> END_SCYTHE = REGISTRY.register("end_scythe", () -> new EndScytheItem());
}
