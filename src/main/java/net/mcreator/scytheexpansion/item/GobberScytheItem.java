
package net.mcreator.scytheexpansion.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.scytheexpansion.init.ScytheexpansionModTabs;

public class GobberScytheItem extends SwordItem {
	public GobberScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 3800;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().tab(ScytheexpansionModTabs.TAB_SCYTHE_EXPANSION));
	}
}
