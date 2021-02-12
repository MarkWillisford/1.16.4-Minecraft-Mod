package com.Jedipawn.jpsbase.core.init;

import com.Jedipawn.jpsbase.JpsBase;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JpsBase.MOD_ID);
	
	public static final RegistryObject<Block> MARBLE = BLOCKS.register("marble", 
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE)	// .from
					.hardnessAndResistance(1.25f, 7.25f).harvestTool(ToolType.PICKAXE)
					// -1 any, 0 wood, 1 stone & gold, 2 iron, 3 diamond, 4 netherite, 5 modded; 
					// This needs to be explored more, I don't think it is working, perhaps the material above is conflicting?
					.harvestLevel(3)));
	public static final RegistryObject<Block> MARBLE_SLAB = BLOCKS.register("marble_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25f, 7.25f)));
	public static final RegistryObject<Block> MARBLE_STAIRS = BLOCKS.register("marble_stairs", () -> new StairsBlock(() -> Blocks.STONE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.25f, 7.25f)));
	
}
