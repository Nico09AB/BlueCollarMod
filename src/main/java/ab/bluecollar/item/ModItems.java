package ab.bluecollar.item;

import ab.bluecollar.BlueCollarMod;
import ab.bluecollar.block.ModBlocks;
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

    private static void addItemsToCreativeModTab(FabricItemGroupEntries entries) {
        entries.add(RAW_BAUXITE);
        entries.add(ModBlocks.BAUXITE_ORE);
        entries.add(ModBlocks.DEEPSLATE_BAUXITE_ORE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BlueCollarMod.MOD_ID, name), item);
    }

    /* Items */

    public static final Item STEEL_INGOT = registerItem("steel-ingot", new Item(new FabricItemSettings()));
    public static final Item CAST_IRON_INGOT = registerItem("cast-iron-ingot", new Item(new FabricItemSettings()));

    public static final Item ALUMINUM_INGOT = registerItem("aluminum-ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_BAUXITE = registerItem("raw-bauxite", new Item(new FabricItemSettings()));
}
