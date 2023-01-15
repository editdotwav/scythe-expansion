
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.scytheexpansion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ScytheexpansionModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 28),

					new ItemStack(ScytheexpansionModItems.DIAMOND_SCYTHE.get()), 10, 5, 0.08f));
		}
	}
}
