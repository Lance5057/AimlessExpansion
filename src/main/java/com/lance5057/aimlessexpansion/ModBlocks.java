package com.lance5057.aimlessexpansion;

import com.lance5057.aimlessexpansion.blocks.ObsidianSand;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ModBlocks {
	public static ObsidianSand obsidianSand;
	
	public void PreInit(FMLPreInitializationEvent event) {
		obsidianSand = new ObsidianSand();
	}

	public void Init(FMLInitializationEvent event) {

	}

	public void PostInit(FMLPostInitializationEvent event) {

	}

	public void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new ItemBlock(obsidianSand).setRegistryName(new ResourceLocation(AimlessExpansion.MODID, "itemobsidiansand")).setUnlocalizedName("itemobsidiansand"));
	}

	public void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().register(obsidianSand);
	}
}
