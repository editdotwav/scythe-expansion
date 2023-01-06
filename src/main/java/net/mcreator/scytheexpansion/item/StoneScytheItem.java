
package net.mcreator.scytheexpansion.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.scytheexpansion.init.ScytheexpansionModTabs;

public class StoneScytheItem extends SwordItem {
	public StoneScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 131;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.STONE), new ItemStack(Blocks.COBBLESTONE));
			}
		}, 3, -3.1f, new Item.Properties().tab(ScytheexpansionModTabs.TAB_SCYTHE_EXPANSION));
	}
}
