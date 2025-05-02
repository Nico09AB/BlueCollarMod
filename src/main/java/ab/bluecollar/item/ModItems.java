package ab.bluecollar.item;

import ab.bluecollar.BlueCollarMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static void registerModItems() {
        BlueCollarMod.LOGGER.info("MOD ITEMS REGISTERED FOR: " + BlueCollarMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToCreativeModTab);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BlueCollarMod.MOD_ID, name), item);
    }

    private static void addItemsToCreativeModTab(FabricItemGroupEntries entries) {
        entries.add(STEEL_INGOT);
    }

    public static final Item STEEL_INGOT = registerItem("steel-ingot", new Item(new FabricItemSettings()));
    public static final Item CAST_IRON_INGOT = registerItem("cast-iron-ingot", new Item(new FabricItemSettings()));

}
