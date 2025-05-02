package ab.bluecollar;

import ab.bluecollar.block.ModBlocks;
import ab.bluecollar.item.ModItems;
import ab.bluecollar.item.ModItemsGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlueCollarMod implements ModInitializer {
	public static final String MOD_ID = "blue-collar";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemsGroup.registerModItemsGroup();

		ModBlocks.registerModBlocks();
	}
}