
package net.mcreator.scytheexpansion.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.scytheexpansion.init.ScytheexpansionModTabs;

public class NetherScytheItem extends SwordItem {
	public NetherScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 4000;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.7f, new Item.Properties().tab(ScytheexpansionModTabs.TAB_SCYTHE_EXPANSION));
	}
}
