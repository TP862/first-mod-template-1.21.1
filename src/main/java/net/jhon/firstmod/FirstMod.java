package net.jhon.firstmod;

import net.fabricmc.api.ModInitializer;

import net.jhon.firstmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "first-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}