package com.Jedipawn.jpsbase.core.init;

import com.Jedipawn.jpsbase.JpsBase;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JpsBase.MOD_ID);

	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().group(JpsBase.MOD_TAB)));
	
	
	
	
	// Block Items
	public static final RegistryObject<BlockItem> MARBLE = ITEMS.register("marble", () -> new BlockItem(BlockInit.MARBLE.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> MARBLE_SLAB = ITEMS.register("marble_slab", () -> new BlockItem(BlockInit.MARBLE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> MARBLE_STAIRS = ITEMS.register("marble_stairs", () -> new BlockItem(BlockInit.MARBLE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
}