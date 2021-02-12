package com.Jedipawn.jpsbase.core.event;

import com.Jedipawn.jpsbase.JpsBase;
import com.Jedipawn.jpsbase.core.init.BlockInit;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = JpsBase.MOD_ID, bus = Bus.FORGE)
public class ModEventBusSubscriber {
/*	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
	    final IForgeRegistry<Item> registry = event.getRegistry();
	    BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)
            .forEach(block -> {
                final Item.Properties properties = new Item.Properties().group(JpsBase.MOD_TAB);
                final BlockItem blockItem = new BlockItem(block, properties);
                blockItem.setRegistryName(block.getRegistryName());
                registry.register(blockItem);
            });
	}*/
}