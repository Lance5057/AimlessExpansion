package com.lance5057.aimlessexpansion;

import com.lance5057.aimlessexpansion.biomes.ObsidianSandBeach;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ModBiomes {

	Biome BiomeObsidianSandBeach;
	BiomeEntry BE_ObsidianSandBeach;

	public void PreInit(FMLPreInitializationEvent event) {
		BE_ObsidianSandBeach = new BiomeEntry(
				BiomeObsidianSandBeach = new ObsidianSandBeach(new Biome.BiomeProperties("Obsidian Sand Beach").setBaseHeight(0.0F)
						.setHeightVariation(0.025F).setTemperature(0.8F).setRainfall(0.4F).setWaterColor(65517)),
				5);
	}

	public void Init(FMLInitializationEvent event) {

		BiomeDictionary.addTypes(BiomeObsidianSandBeach, Type.BEACH, Type.JUNGLE);

		BiomeManager.addBiome(BiomeType.WARM, BE_ObsidianSandBeach);
		BiomeManager.addSpawnBiome(BiomeObsidianSandBeach);
	}

	public void PostInit(FMLPostInitializationEvent event) {

	}

	public void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().register(BiomeObsidianSandBeach);
	}
}
