package com.Jedipawn.jpsbase.core.init;

import com.Jedipawn.jpsbase.JpsBase;
import com.Jedipawn.jpsbase.common.blocks.ModSlab;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.DyeColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import java.util.function.ToIntFunction;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.trees.AcaciaTree;
import net.minecraft.block.trees.BirchTree;
import net.minecraft.block.trees.DarkOakTree;
import net.minecraft.block.trees.JungleTree;
import net.minecraft.block.trees.OakTree;
import net.minecraft.block.trees.SpruceTree;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.DyeColor;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.Effects;
import net.minecraft.state.properties.BedPart;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.ShulkerBoxTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.gen.feature.Features;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JpsBase.MOD_ID);
	
	public static final RegistryObject<Block> MARBLE = BLOCKS.register("marble", 
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE)	// .from
					.hardnessAndResistance(1.25f, 7.25f).harvestTool(ToolType.PICKAXE)
					// -1 any, 0 wood, 1 stone & gold, 2 iron, 3 diamond, 4 netherite, 5 modded; 
					// This needs to be explored more, I don't think it is working, perhaps the material above is conflicting?
					.harvestLevel(1).setRequiresTool()));
	
	private static boolean isntSolid(BlockState state, IBlockReader reader, BlockPos pos) {
	      return false;
	   }
	
	public static final RegistryObject<Block> MARBLE_SLAB = BLOCKS.register("marble_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 7.25f).harvestLevel(1).setRequiresTool()));
	public static final RegistryObject<Block> MARBLE_STAIRS = BLOCKS.register("marble_stairs", () -> new StairsBlock(() -> Blocks.STONE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.25f, 7.25f).harvestLevel(1).setRequiresTool()));
	
	// Colored Slabs and Stairs
	public static final RegistryObject<Block> TERRACOTTA_STAIRS = BLOCKS.register("terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> TERRACOTTA_SLAB = BLOCKS.register("terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = BLOCKS.register("white_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = BLOCKS.register("white_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = BLOCKS.register("orange_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = BLOCKS.register("orange_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> MAGENTA_TERRACOTTA_STAIRS = BLOCKS.register("magenta_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = BLOCKS.register("magenta_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("light_blue_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = BLOCKS.register("light_blue_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> YELLOW_TERRACOTTA_STAIRS = BLOCKS.register("yellow_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.YELLOW_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = BLOCKS.register("yellow_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> LIME_TERRACOTTA_STAIRS = BLOCKS.register("lime_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIME_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = BLOCKS.register("lime_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> PINK_TERRACOTTA_STAIRS = BLOCKS.register("pink_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.PINK_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = BLOCKS.register("pink_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> GRAY_TERRACOTTA_STAIRS = BLOCKS.register("gray_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GRAY_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = BLOCKS.register("gray_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("light_gray_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = BLOCKS.register("light_gray_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> CYAN_TERRACOTTA_STAIRS = BLOCKS.register("cyan_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.CYAN_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = BLOCKS.register("cyan_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> PURPLE_TERRACOTTA_STAIRS = BLOCKS.register("purple_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.PURPLE_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = BLOCKS.register("purple_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> BLUE_TERRACOTTA_STAIRS = BLOCKS.register("blue_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = BLOCKS.register("blue_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> BROWN_TERRACOTTA_STAIRS = BLOCKS.register("brown_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = BLOCKS.register("brown_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> GREEN_TERRACOTTA_STAIRS = BLOCKS.register("green_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = BLOCKS.register("green_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = BLOCKS.register("red_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = BLOCKS.register("red_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> BLACK_TERRACOTTA_STAIRS = BLOCKS.register("black_terracotta_stairs", () -> new StairsBlock(() -> Blocks.TERRACOTTA.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK_TERRACOTTA).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = BLOCKS.register("black_terracotta_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 4.2f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
	
	public static final RegistryObject<Block> WHITE_WOOL_STAIRS = BLOCKS.register("white_wool_stairs", () -> new StairsBlock(() -> Blocks.WHITE_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.WHITE).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> WHITE_WOOL_SLAB = BLOCKS.register("white_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> ORANGE_WOOL_STAIRS = BLOCKS.register("orange_wool_stairs", () -> new StairsBlock(() -> Blocks.ORANGE_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.ORANGE).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> ORANGE_WOOL_SLAB = BLOCKS.register("orange_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> MAGENTA_WOOL_STAIRS = BLOCKS.register("magenta_wool_stairs", () -> new StairsBlock(() -> Blocks.MAGENTA_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.MAGENTA).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = BLOCKS.register("magenta_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> LIGHT_BLUE_WOOL_STAIRS = BLOCKS.register("light_blue_wool_stairs", () -> new StairsBlock(() -> Blocks.LIGHT_BLUE_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.LIGHT_BLUE).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = BLOCKS.register("light_blue_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> YELLOW_WOOL_STAIRS = BLOCKS.register("yellow_wool_stairs", () -> new StairsBlock(() -> Blocks.YELLOW_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.YELLOW).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> YELLOW_WOOL_SLAB = BLOCKS.register("yellow_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> LIME_WOOL_STAIRS = BLOCKS.register("lime_wool_stairs", () -> new StairsBlock(() -> Blocks.LIME_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.LIME).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> LIME_WOOL_SLAB = BLOCKS.register("lime_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> PINK_WOOL_STAIRS = BLOCKS.register("pink_wool_stairs", () -> new StairsBlock(() -> Blocks.PINK_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.PINK).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> PINK_WOOL_SLAB = BLOCKS.register("pink_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> GRAY_WOOL_STAIRS = BLOCKS.register("gray_wool_stairs", () -> new StairsBlock(() -> Blocks.GRAY_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.GRAY).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> GRAY_WOOL_SLAB = BLOCKS.register("gray_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> LIGHT_GRAY_WOOL_STAIRS = BLOCKS.register("light_gray_wool_stairs", () -> new StairsBlock(() -> Blocks.LIGHT_GRAY_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.LIGHT_GRAY).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = BLOCKS.register("light_gray_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> CYAN_WOOL_STAIRS = BLOCKS.register("cyan_wool_stairs", () -> new StairsBlock(() -> Blocks.CYAN_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.CYAN).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> CYAN_WOOL_SLAB = BLOCKS.register("cyan_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> PURPLE_WOOL_STAIRS = BLOCKS.register("purple_wool_stairs", () -> new StairsBlock(() -> Blocks.PURPLE_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.PURPLE).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> PURPLE_WOOL_SLAB = BLOCKS.register("purple_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> BLUE_WOOL_STAIRS = BLOCKS.register("blue_wool_stairs", () -> new StairsBlock(() -> Blocks.BLUE_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.BLUE).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> BLUE_WOOL_SLAB = BLOCKS.register("blue_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> BROWN_WOOL_STAIRS = BLOCKS.register("brown_wool_stairs", () -> new StairsBlock(() -> Blocks.BROWN_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.BROWN).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> BROWN_WOOL_SLAB = BLOCKS.register("brown_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> GREEN_WOOL_STAIRS = BLOCKS.register("green_wool_stairs", () -> new StairsBlock(() -> Blocks.GREEN_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.GREEN).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> GREEN_WOOL_SLAB = BLOCKS.register("green_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> RED_WOOL_STAIRS = BLOCKS.register("red_wool_stairs", () -> new StairsBlock(() -> Blocks.RED_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.RED).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> RED_WOOL_SLAB = BLOCKS.register("red_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> BLACK_WOOL_STAIRS = BLOCKS.register("black_wool_stairs", () -> new StairsBlock(() -> Blocks.BLACK_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, DyeColor.BLACK).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> BLACK_WOOL_SLAB = BLOCKS.register("black_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F)));
	
	public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = BLOCKS.register("white_concrete_stairs", () -> new StairsBlock(() -> Blocks.WHITE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.WHITE).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = BLOCKS.register("white_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = BLOCKS.register("orange_concrete_stairs", () -> new StairsBlock(() -> Blocks.ORANGE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.ORANGE).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = BLOCKS.register("orange_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = BLOCKS.register("magenta_concrete_stairs", () -> new StairsBlock(() -> Blocks.MAGENTA_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.MAGENTA).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = BLOCKS.register("magenta_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = BLOCKS.register("light_blue_concrete_stairs", () -> new StairsBlock(() -> Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.LIGHT_BLUE).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = BLOCKS.register("light_blue_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = BLOCKS.register("yellow_concrete_stairs", () -> new StairsBlock(() -> Blocks.YELLOW_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.YELLOW).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = BLOCKS.register("yellow_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = BLOCKS.register("lime_concrete_stairs", () -> new StairsBlock(() -> Blocks.LIME_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.LIME).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> LIME_CONCRETE_SLAB = BLOCKS.register("lime_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = BLOCKS.register("pink_concrete_stairs", () -> new StairsBlock(() -> Blocks.PINK_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.PINK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> PINK_CONCRETE_SLAB = BLOCKS.register("pink_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = BLOCKS.register("gray_concrete_stairs", () -> new StairsBlock(() -> Blocks.GRAY_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.GRAY).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = BLOCKS.register("gray_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = BLOCKS.register("light_gray_concrete_stairs", () -> new StairsBlock(() -> Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.LIGHT_GRAY).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = BLOCKS.register("light_gray_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = BLOCKS.register("cyan_concrete_stairs", () -> new StairsBlock(() -> Blocks.CYAN_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.CYAN).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = BLOCKS.register("cyan_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = BLOCKS.register("purple_concrete_stairs", () -> new StairsBlock(() -> Blocks.PURPLE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.PURPLE).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = BLOCKS.register("purple_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = BLOCKS.register("blue_concrete_stairs", () -> new StairsBlock(() -> Blocks.BLUE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.BLUE).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = BLOCKS.register("blue_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = BLOCKS.register("brown_concrete_stairs", () -> new StairsBlock(() -> Blocks.BROWN_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.BROWN).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = BLOCKS.register("brown_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = BLOCKS.register("green_concrete_stairs", () -> new StairsBlock(() -> Blocks.GREEN_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.GREEN).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = BLOCKS.register("green_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> RED_CONCRETE_STAIRS = BLOCKS.register("red_concrete_stairs", () -> new StairsBlock(() -> Blocks.RED_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.RED).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> RED_CONCRETE_SLAB = BLOCKS.register("red_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = BLOCKS.register("black_concrete_stairs", () -> new StairsBlock(() -> Blocks.BLACK_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, DyeColor.BLACK).hardnessAndResistance(1.8F)));
	public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = BLOCKS.register("black_concrete_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F)));
	
	public static final RegistryObject<Block> GLASS_STAIRS = BLOCKS.register("glass_stairs",() -> new StairsBlock(() -> Blocks.GLASS.getDefaultState(), Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> GLASS_SLAB = BLOCKS.register("glass_slab",() -> new ModSlab(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> WHITE_STAINED_GLASS_STAIRS = BLOCKS.register("white_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.WHITE_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.WHITE).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> WHITE_STAINED_GLASS_SLAB = BLOCKS.register("white_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.WHITE).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> ORANGE_STAINED_GLASS_STAIRS = BLOCKS.register("orange_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.ORANGE_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.ORANGE).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> ORANGE_STAINED_GLASS_SLAB = BLOCKS.register("orange_stained_glass_slab", () -> new ModSlab(Block.Properties.create(Material.GLASS, DyeColor.ORANGE).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_STAIRS = BLOCKS.register("magenta_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.MAGENTA_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.MAGENTA).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_SLAB = BLOCKS.register("magenta_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.MAGENTA).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_STAIRS = BLOCKS.register("light_blue_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.LIGHT_BLUE).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_SLAB = BLOCKS.register("light_blue_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.LIGHT_BLUE).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> YELLOW_STAINED_GLASS_STAIRS = BLOCKS.register("yellow_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.YELLOW_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.YELLOW).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> YELLOW_STAINED_GLASS_SLAB = BLOCKS.register("yellow_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.YELLOW).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> LIME_STAINED_GLASS_STAIRS = BLOCKS.register("lime_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.LIME_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.LIME).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> LIME_STAINED_GLASS_SLAB = BLOCKS.register("lime_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.LIME).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> PINK_STAINED_GLASS_STAIRS = BLOCKS.register("pink_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.PINK_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.PINK).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> PINK_STAINED_GLASS_SLAB = BLOCKS.register("pink_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.PINK).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> GRAY_STAINED_GLASS_STAIRS = BLOCKS.register("gray_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.GRAY_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.GRAY).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> GRAY_STAINED_GLASS_SLAB = BLOCKS.register("gray_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.GRAY).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_STAIRS = BLOCKS.register("light_gray_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.LIGHT_GRAY).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_SLAB = BLOCKS.register("light_gray_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.LIGHT_GRAY).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> CYAN_STAINED_GLASS_STAIRS = BLOCKS.register("cyan_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.CYAN_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.CYAN).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> CYAN_STAINED_GLASS_SLAB = BLOCKS.register("cyan_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.CYAN).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> PURPLE_STAINED_GLASS_STAIRS = BLOCKS.register("purple_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.PURPLE_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.PURPLE).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> PURPLE_STAINED_GLASS_SLAB = BLOCKS.register("purple_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.PURPLE).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> BLUE_STAINED_GLASS_STAIRS = BLOCKS.register("blue_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.BLUE_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.BLUE).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> BLUE_STAINED_GLASS_SLAB = BLOCKS.register("blue_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.BLUE).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> BROWN_STAINED_GLASS_STAIRS = BLOCKS.register("brown_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.BROWN_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.BROWN).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> BROWN_STAINED_GLASS_SLAB = BLOCKS.register("brown_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.BROWN).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> GREEN_STAINED_GLASS_STAIRS = BLOCKS.register("green_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.GREEN_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.GREEN).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> GREEN_STAINED_GLASS_SLAB = BLOCKS.register("green_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.GREEN).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> RED_STAINED_GLASS_STAIRS = BLOCKS.register("red_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.RED_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.RED).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> RED_STAINED_GLASS_SLAB = BLOCKS.register("red_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.RED).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> BLACK_STAINED_GLASS_STAIRS = BLOCKS.register("black_stained_glass_stairs", () -> new StairsBlock(() -> Blocks.BLACK_STAINED_GLASS.getDefaultState(), Block.Properties.create(Material.GLASS, DyeColor.BLACK).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> BLACK_STAINED_GLASS_SLAB = BLOCKS.register("black_stained_glass_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, DyeColor.BLACK).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));

}
