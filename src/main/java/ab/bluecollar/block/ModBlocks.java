package ab.bluecollar.block;

import ab.bluecollar.BlueCollarMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static void registerModBlocks() {
        BlueCollarMod.LOGGER.info("MOD BLOCKS REGISTERED FOR: " + BlueCollarMod.MOD_ID);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BlueCollarMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BlueCollarMod.MOD_ID, name), block);
    }

    /* Blocks */

    public static final Block STEEL_BLOCK = registerBlock("steel-block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)));
    public static final Block CAST_IRON_BLOCK = registerBlock("cast-iron-block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)));
    public static final Block ALUMINUM_BLOCK = registerBlock("aluminum-block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    /* Ores */

    public static final Block BAUXITE_ORE = registerBlock("bauxite-ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0f, 20f), UniformIntProvider.create(2, 5)));
    public static final Block DEEPSLATE_BAUXITE_ORE = registerBlock("deepslate-bauxite-ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4.5f, 20f), UniformIntProvider.create(2, 5)));
}
