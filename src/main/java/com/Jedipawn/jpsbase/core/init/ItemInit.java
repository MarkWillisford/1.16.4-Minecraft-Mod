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
	
	// Colored Stairs and Slabs
	public static final RegistryObject<BlockItem> TERRACOTTA_STAIRS = ITEMS.register("terracotta_stairs", () -> new BlockItem(BlockInit.TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> TERRACOTTA_SLAB = ITEMS.register("terracotta_slab", () -> new BlockItem(BlockInit.TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> WHITE_TERRACOTTA_STAIRS = ITEMS.register("white_terracotta_stairs", () -> new BlockItem(BlockInit.WHITE_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> WHITE_TERRACOTTA_SLAB = ITEMS.register("white_terracotta_slab", () -> new BlockItem(BlockInit.WHITE_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> ORANGE_TERRACOTTA_STAIRS = ITEMS.register("orange_terracotta_stairs", () -> new BlockItem(BlockInit.ORANGE_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> ORANGE_TERRACOTTA_SLAB = ITEMS.register("orange_terracotta_slab", () -> new BlockItem(BlockInit.ORANGE_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> MAGENTA_TERRACOTTA_STAIRS = ITEMS.register("magenta_terracotta_stairs", () -> new BlockItem(BlockInit.MAGENTA_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> MAGENTA_TERRACOTTA_SLAB = ITEMS.register("magenta_terracotta_slab", () -> new BlockItem(BlockInit.MAGENTA_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIGHT_BLUE_TERRACOTTA_STAIRS = ITEMS.register("light_blue_terracotta_stairs", () -> new BlockItem(BlockInit.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIGHT_BLUE_TERRACOTTA_SLAB = ITEMS.register("light_blue_terracotta_slab", () -> new BlockItem(BlockInit.LIGHT_BLUE_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> YELLOW_TERRACOTTA_STAIRS = ITEMS.register("yellow_terracotta_stairs", () -> new BlockItem(BlockInit.YELLOW_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> YELLOW_TERRACOTTA_SLAB = ITEMS.register("yellow_terracotta_slab", () -> new BlockItem(BlockInit.YELLOW_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIME_TERRACOTTA_STAIRS = ITEMS.register("lime_terracotta_stairs", () -> new BlockItem(BlockInit.LIME_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIME_TERRACOTTA_SLAB = ITEMS.register("lime_terracotta_slab", () -> new BlockItem(BlockInit.LIME_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> PINK_TERRACOTTA_STAIRS = ITEMS.register("pink_terracotta_stairs", () -> new BlockItem(BlockInit.PINK_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> PINK_TERRACOTTA_SLAB = ITEMS.register("pink_terracotta_slab", () -> new BlockItem(BlockInit.PINK_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> GRAY_TERRACOTTA_STAIRS = ITEMS.register("gray_terracotta_stairs", () -> new BlockItem(BlockInit.GRAY_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> GRAY_TERRACOTTA_SLAB = ITEMS.register("gray_terracotta_slab", () -> new BlockItem(BlockInit.GRAY_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIGHT_GRAY_TERRACOTTA_STAIRS = ITEMS.register("light_gray_terracotta_stairs", () -> new BlockItem(BlockInit.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIGHT_GRAY_TERRACOTTA_SLAB = ITEMS.register("light_gray_terracotta_slab", () -> new BlockItem(BlockInit.LIGHT_GRAY_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> CYAN_TERRACOTTA_STAIRS = ITEMS.register("cyan_terracotta_stairs", () -> new BlockItem(BlockInit.CYAN_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> CYAN_TERRACOTTA_SLAB = ITEMS.register("cyan_terracotta_slab", () -> new BlockItem(BlockInit.CYAN_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> PURPLE_TERRACOTTA_STAIRS = ITEMS.register("purple_terracotta_stairs", () -> new BlockItem(BlockInit.PURPLE_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> PURPLE_TERRACOTTA_SLAB = ITEMS.register("purple_terracotta_slab", () -> new BlockItem(BlockInit.PURPLE_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BLUE_TERRACOTTA_STAIRS = ITEMS.register("blue_terracotta_stairs", () -> new BlockItem(BlockInit.BLUE_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BLUE_TERRACOTTA_SLAB = ITEMS.register("blue_terracotta_slab", () -> new BlockItem(BlockInit.BLUE_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BROWN_TERRACOTTA_STAIRS = ITEMS.register("brown_terracotta_stairs", () -> new BlockItem(BlockInit.BROWN_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BROWN_TERRACOTTA_SLAB = ITEMS.register("brown_terracotta_slab", () -> new BlockItem(BlockInit.BROWN_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> GREEN_TERRACOTTA_STAIRS = ITEMS.register("green_terracotta_stairs", () -> new BlockItem(BlockInit.GREEN_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> GREEN_TERRACOTTA_SLAB = ITEMS.register("green_terracotta_slab", () -> new BlockItem(BlockInit.GREEN_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> RED_TERRACOTTA_STAIRS = ITEMS.register("red_terracotta_stairs", () -> new BlockItem(BlockInit.RED_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> RED_TERRACOTTA_SLAB = ITEMS.register("red_terracotta_slab", () -> new BlockItem(BlockInit.RED_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BLACK_TERRACOTTA_STAIRS = ITEMS.register("black_terracotta_stairs", () -> new BlockItem(BlockInit.BLACK_TERRACOTTA_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BLACK_TERRACOTTA_SLAB = ITEMS.register("black_terracotta_slab", () -> new BlockItem(BlockInit.BLACK_TERRACOTTA_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	
	public static final RegistryObject<BlockItem> WHITE_WOOL_STAIRS = ITEMS.register("white_wool_stairs", () -> new BlockItem(BlockInit.WHITE_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> WHITE_WOOL_SLAB = ITEMS.register("white_wool_slab", () -> new BlockItem(BlockInit.WHITE_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> ORANGE_WOOL_STAIRS = ITEMS.register("orange_wool_stairs", () -> new BlockItem(BlockInit.ORANGE_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> ORANGE_WOOL_SLAB = ITEMS.register("orange_wool_slab", () -> new BlockItem(BlockInit.ORANGE_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> MAGENTA_WOOL_STAIRS = ITEMS.register("magenta_wool_stairs", () -> new BlockItem(BlockInit.MAGENTA_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> MAGENTA_WOOL_SLAB = ITEMS.register("magenta_wool_slab", () -> new BlockItem(BlockInit.MAGENTA_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIGHT_BLUE_WOOL_STAIRS = ITEMS.register("light_blue_wool_stairs", () -> new BlockItem(BlockInit.LIGHT_BLUE_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIGHT_BLUE_WOOL_SLAB = ITEMS.register("light_blue_wool_slab", () -> new BlockItem(BlockInit.LIGHT_BLUE_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> YELLOW_WOOL_STAIRS = ITEMS.register("yellow_wool_stairs", () -> new BlockItem(BlockInit.YELLOW_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> YELLOW_WOOL_SLAB = ITEMS.register("yellow_wool_slab", () -> new BlockItem(BlockInit.YELLOW_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIME_WOOL_STAIRS = ITEMS.register("lime_wool_stairs", () -> new BlockItem(BlockInit.LIME_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIME_WOOL_SLAB = ITEMS.register("lime_wool_slab", () -> new BlockItem(BlockInit.LIME_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> PINK_WOOL_STAIRS = ITEMS.register("pink_wool_stairs", () -> new BlockItem(BlockInit.PINK_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> PINK_WOOL_SLAB = ITEMS.register("pink_wool_slab", () -> new BlockItem(BlockInit.PINK_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> GRAY_WOOL_STAIRS = ITEMS.register("gray_wool_stairs", () -> new BlockItem(BlockInit.GRAY_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> GRAY_WOOL_SLAB = ITEMS.register("gray_wool_slab", () -> new BlockItem(BlockInit.GRAY_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIGHT_GRAY_WOOL_STAIRS = ITEMS.register("light_gray_wool_stairs", () -> new BlockItem(BlockInit.LIGHT_GRAY_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIGHT_GRAY_WOOL_SLAB = ITEMS.register("light_gray_wool_slab", () -> new BlockItem(BlockInit.LIGHT_GRAY_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> CYAN_WOOL_STAIRS = ITEMS.register("cyan_wool_stairs", () -> new BlockItem(BlockInit.CYAN_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> CYAN_WOOL_SLAB = ITEMS.register("cyan_wool_slab", () -> new BlockItem(BlockInit.CYAN_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> PURPLE_WOOL_STAIRS = ITEMS.register("purple_wool_stairs", () -> new BlockItem(BlockInit.PURPLE_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> PURPLE_WOOL_SLAB = ITEMS.register("purple_wool_slab", () -> new BlockItem(BlockInit.PURPLE_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BLUE_WOOL_STAIRS = ITEMS.register("blue_wool_stairs", () -> new BlockItem(BlockInit.BLUE_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BLUE_WOOL_SLAB = ITEMS.register("blue_wool_slab", () -> new BlockItem(BlockInit.BLUE_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BROWN_WOOL_STAIRS = ITEMS.register("brown_wool_stairs", () -> new BlockItem(BlockInit.BROWN_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BROWN_WOOL_SLAB = ITEMS.register("brown_wool_slab", () -> new BlockItem(BlockInit.BROWN_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> GREEN_WOOL_STAIRS = ITEMS.register("green_wool_stairs", () -> new BlockItem(BlockInit.GREEN_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> GREEN_WOOL_SLAB = ITEMS.register("green_wool_slab", () -> new BlockItem(BlockInit.GREEN_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> RED_WOOL_STAIRS = ITEMS.register("red_wool_stairs", () -> new BlockItem(BlockInit.RED_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> RED_WOOL_SLAB = ITEMS.register("red_wool_slab", () -> new BlockItem(BlockInit.RED_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BLACK_WOOL_STAIRS = ITEMS.register("black_wool_stairs", () -> new BlockItem(BlockInit.BLACK_WOOL_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BLACK_WOOL_SLAB = ITEMS.register("black_wool_slab", () -> new BlockItem(BlockInit.BLACK_WOOL_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	
	public static final RegistryObject<BlockItem> WHITE_CONCRETE_STAIRS = ITEMS.register("white_concrete_stairs", () -> new BlockItem(BlockInit.WHITE_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> WHITE_CONCRETE_SLAB = ITEMS.register("white_concrete_slab", () -> new BlockItem(BlockInit.WHITE_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> ORANGE_CONCRETE_STAIRS = ITEMS.register("orange_concrete_stairs", () -> new BlockItem(BlockInit.ORANGE_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> ORANGE_CONCRETE_SLAB = ITEMS.register("orange_concrete_slab", () -> new BlockItem(BlockInit.ORANGE_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> MAGENTA_CONCRETE_STAIRS = ITEMS.register("magenta_concrete_stairs", () -> new BlockItem(BlockInit.MAGENTA_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> MAGENTA_CONCRETE_SLAB = ITEMS.register("magenta_concrete_slab", () -> new BlockItem(BlockInit.MAGENTA_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIGHT_BLUE_CONCRETE_STAIRS = ITEMS.register("light_blue_concrete_stairs", () -> new BlockItem(BlockInit.LIGHT_BLUE_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIGHT_BLUE_CONCRETE_SLAB = ITEMS.register("light_blue_concrete_slab", () -> new BlockItem(BlockInit.LIGHT_BLUE_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> YELLOW_CONCRETE_STAIRS = ITEMS.register("yellow_concrete_stairs", () -> new BlockItem(BlockInit.YELLOW_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> YELLOW_CONCRETE_SLAB = ITEMS.register("yellow_concrete_slab", () -> new BlockItem(BlockInit.YELLOW_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIME_CONCRETE_STAIRS = ITEMS.register("lime_concrete_stairs", () -> new BlockItem(BlockInit.LIME_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIME_CONCRETE_SLAB = ITEMS.register("lime_concrete_slab", () -> new BlockItem(BlockInit.LIME_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> PINK_CONCRETE_STAIRS = ITEMS.register("pink_concrete_stairs", () -> new BlockItem(BlockInit.PINK_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> PINK_CONCRETE_SLAB = ITEMS.register("pink_concrete_slab", () -> new BlockItem(BlockInit.PINK_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> GRAY_CONCRETE_STAIRS = ITEMS.register("gray_concrete_stairs", () -> new BlockItem(BlockInit.GRAY_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> GRAY_CONCRETE_SLAB = ITEMS.register("gray_concrete_slab", () -> new BlockItem(BlockInit.GRAY_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIGHT_GRAY_CONCRETE_STAIRS = ITEMS.register("light_gray_concrete_stairs", () -> new BlockItem(BlockInit.LIGHT_GRAY_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> LIGHT_GRAY_CONCRETE_SLAB = ITEMS.register("light_gray_concrete_slab", () -> new BlockItem(BlockInit.LIGHT_GRAY_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> CYAN_CONCRETE_STAIRS = ITEMS.register("cyan_concrete_stairs", () -> new BlockItem(BlockInit.CYAN_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> CYAN_CONCRETE_SLAB = ITEMS.register("cyan_concrete_slab", () -> new BlockItem(BlockInit.CYAN_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> PURPLE_CONCRETE_STAIRS = ITEMS.register("purple_concrete_stairs", () -> new BlockItem(BlockInit.PURPLE_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> PURPLE_CONCRETE_SLAB = ITEMS.register("purple_concrete_slab", () -> new BlockItem(BlockInit.PURPLE_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BLUE_CONCRETE_STAIRS = ITEMS.register("blue_concrete_stairs", () -> new BlockItem(BlockInit.BLUE_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BLUE_CONCRETE_SLAB = ITEMS.register("blue_concrete_slab", () -> new BlockItem(BlockInit.BLUE_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BROWN_CONCRETE_STAIRS = ITEMS.register("brown_concrete_stairs", () -> new BlockItem(BlockInit.BROWN_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BROWN_CONCRETE_SLAB = ITEMS.register("brown_concrete_slab", () -> new BlockItem(BlockInit.BROWN_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> GREEN_CONCRETE_STAIRS = ITEMS.register("green_concrete_stairs", () -> new BlockItem(BlockInit.GREEN_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> GREEN_CONCRETE_SLAB = ITEMS.register("green_concrete_slab", () -> new BlockItem(BlockInit.GREEN_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> RED_CONCRETE_STAIRS = ITEMS.register("red_concrete_stairs", () -> new BlockItem(BlockInit.RED_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> RED_CONCRETE_SLAB = ITEMS.register("red_concrete_slab", () -> new BlockItem(BlockInit.RED_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BLACK_CONCRETE_STAIRS = ITEMS.register("black_concrete_stairs", () -> new BlockItem(BlockInit.BLACK_CONCRETE_STAIRS.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	public static final RegistryObject<BlockItem> BLACK_CONCRETE_SLAB = ITEMS.register("black_concrete_slab", () -> new BlockItem(BlockInit.BLACK_CONCRETE_SLAB.get(), new Item.Properties().group(JpsBase.MOD_TAB)));
	
}