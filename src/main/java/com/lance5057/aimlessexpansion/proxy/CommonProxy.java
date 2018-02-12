package com.lance5057.aimlessexpansion.proxy;

import com.lance5057.aimlessexpansion.AimlessExpansion;
import com.lance5057.aimlessexpansion.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = AimlessExpansion.MODID)
public class CommonProxy {
	public void PreInit(FMLPreInitializationEvent event) {

	}

	public void Init(FMLInitializationEvent event) {

	}

	public void PostInit(FMLPostInitializationEvent event) {

	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		AimlessExpansion.instance.blocks.registerItems(event);
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		AimlessExpansion.instance.blocks.registerBlocks(event);
	}
	
	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		AimlessExpansion.instance.biomes.registerBiomes(event);
	}
}
