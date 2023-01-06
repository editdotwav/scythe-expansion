
package net.mcreator.scytheexpansion.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.scytheexpansion.procedures.EndScytheUnbreakbleProcedure;
import net.mcreator.scytheexpansion.init.ScytheexpansionModTabs;

public class EndScytheItem extends SwordItem {
	public EndScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 4000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.DIORITE_SLAB));
			}
		}, 3, -2.6f, new Item.Properties().tab(ScytheexpansionModTabs.TAB_SCYTHE_EXPANSION));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		EndScytheUnbreakbleProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("itemstack", itemstack).build());
	}
}
