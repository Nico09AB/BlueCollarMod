package ab.bluecollar.item;

import ab.bluecollar.BlueCollarMod;
import ab.bluecollar.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroup {

    public static void registerModItemsGroup() {
        BlueCollarMod.LOGGER.info("MOD ITEM GROUPS REGISTERED FOR: " + BlueCollarMod.MOD_ID);
    }

    public static final ItemGroup METALS =
            Registry.register(Registries.ITEM_GROUP,
                    new Identifier(BlueCollarMod.MOD_ID, "metals"),
                    FabricItemGroup.builder()
                            .displayName(Text.translatable("itemgroup.metals"))
                            .icon(() -> new ItemStack(ModItems.STEEL_INGOT))
                            .entries((displayContext, entries) -> {
                                entries.add(ModItems.STEEL_INGOT);
                                entries.add(ModItems.CAST_IRON_INGOT);
                                entries.add(ModItems.ALUMINUM_INGOT);

                                entries.add(ModBlocks.STEEL_BLOCK);
                                entries.add(ModBlocks.CAST_IRON_BLOCK);
                                entries.add(ModBlocks.ALUMINUM_BLOCK);

                                entries.add(Items.IRON_INGOT);
                                entries.add(Items.COPPER_INGOT);
                                entries.add(Items.GOLD_INGOT);
                            })
                            .build());
}