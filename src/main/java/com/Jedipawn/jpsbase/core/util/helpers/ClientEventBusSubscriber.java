package com.Jedipawn.jpsbase.core.util.helpers;

import com.Jedipawn.jpsbase.JpsBase;
import com.Jedipawn.jpsbase.core.init.BlockInit;

import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid=JpsBase.MOD_ID, bus=Bus.MOD, value=Dist.CLIENT)

public class ClientEventBusSubscriber {
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(BlockInit.GLASS_STAIRS.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASS_SLAB.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.WHITE_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.WHITE_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.ORANGE_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.ORANGE_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.MAGENTA_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.MAGENTA_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_BLUE_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.YELLOW_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.YELLOW_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.LIME_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.LIME_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.PINK_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.PINK_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.GRAY_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.GRAY_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_GRAY_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.CYAN_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.CYAN_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.PURPLE_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.PURPLE_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.BLUE_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.BLUE_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.BROWN_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.BROWN_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.GREEN_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.GREEN_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.RED_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.RED_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.BLACK_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.BLACK_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
	}
	
}