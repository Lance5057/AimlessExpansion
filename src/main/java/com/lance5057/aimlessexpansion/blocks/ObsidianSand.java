package com.lance5057.aimlessexpansion.blocks;

import com.lance5057.aimlessexpansion.AimlessExpansion;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ObsidianSand extends BlockFalling
{
	public ObsidianSand()
	{
		this.setHarvestLevel("shovel", 3);
		this.setCreativeTab(AimlessExpansion.tab);
		this.setUnlocalizedName("obsidiansand");
		this.setRegistryName(new ResourceLocation(AimlessExpansion.MODID, "obsidiansand"));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public int getDustColor(IBlockState state)
    {
        return 5183597;
    }
	
	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return MapColor.OBSIDIAN;
    }
}
