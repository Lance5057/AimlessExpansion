package com.lance5057.aimlessexpansion.biomes;

import com.lance5057.aimlessexpansion.AimlessExpansion;
import com.lance5057.aimlessexpansion.ModBlocks;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;

public class ObsidianSandBeach extends Biome
{
    public ObsidianSandBeach(Biome.BiomeProperties properties)
    {
        super(properties);
        this.spawnableCreatureList.clear();
        this.topBlock = ModBlocks.obsidianSand.getDefaultState();
        this.fillerBlock = ModBlocks.obsidianSand.getDefaultState();
        this.decorator.treesPerChunk = -999;
        this.decorator.deadBushPerChunk = 0;
        this.decorator.reedsPerChunk = 0;
        this.decorator.cactiPerChunk = 0;
        this.setRegistryName(new ResourceLocation(AimlessExpansion.MODID, "biomeobsidiansandbeach"));
    }
}