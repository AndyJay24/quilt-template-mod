package io.github.andyjay24.bingus_mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BingusMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Bingus Mod");
	public static final ToolItem L_SWORD = new SwordItem(LToolMaterial.INSTANCE, 8, 1.4F, new QuiltItemSettings());

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.addItem(L_SWORD);
		});

		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "l_sword"), L_SWORD);
	}
}
