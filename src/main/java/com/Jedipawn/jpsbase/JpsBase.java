package com.Jedipawn.jpsbase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Jedipawn.jpsbase.core.init.BlockInit;
import com.Jedipawn.jpsbase.core.init.ItemInit;

import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JpsBase.MOD_ID)
public class JpsBase
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "jpsbase";
    public static final ItemGroup MOD_TAB = new ModGroup(MOD_ID);

    public JpsBase() {
        // Register the setup method for modloading
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    
    public static class ModGroup extends ItemGroup {

		public ModGroup(String label) {
			super(label);
		}
    	
		@Override
		public ItemStack createIcon() {
			return ItemInit.EXAMPLE_ITEM.get().getDefaultInstance();
		}
    }
    
    /*@SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
    	final IForgeRegistry<Item> registry = event.getRegistry();
    	
    	BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
    		final Item.Properties properties = new Item.Properties().group(MOD_TAB);
    		final BlockItem blockItem = new BlockItem(block, properties);
    		blockItem.setRegistryName(block.getRegistryName());
    		registry.register(blockItem);
    	});
    	
    	//Block block = BlockInitNew.DEF_ITEM.get();
    	// Item item = ItemInitNew.DEF_ITEM.get();
    	
    	LOGGER.debug("Registered BlockItems");
    }*/
}








