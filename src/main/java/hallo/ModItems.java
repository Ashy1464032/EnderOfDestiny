package hallo;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
	public static void initialize() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
		.register((itemGroup) -> itemGroup.add(ModItems.VOID_STAR));
	}
	public static Item register(Item item, String id) {
		Identifier itemID = Identifier.of(Halloween.MOD_ID, id);
		
		Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
		
		return registeredItem;
	}
	
	public static final Item VOID_STAR = register(
			new Item(new FabricItemSettings()
					.rarity(Rarity.RARE)
					.maxCount(1)
					.fireproof()),
			"void_star"
	);
}
