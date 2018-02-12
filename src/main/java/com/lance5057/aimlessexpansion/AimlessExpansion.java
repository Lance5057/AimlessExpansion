package com.lance5057.aimlessexpansion;

import org.apache.logging.log4j.Logger;

import com.lance5057.aimlessexpansion.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AimlessExpansion.MODID, name = AimlessExpansion.NAME, version = AimlessExpansion.VERSION)
public class AimlessExpansion
{
    public static final String MODID = "aimlessexpansion";
    public static final String NAME = "Aimless Expansion";
    public static final String VERSION = "0.1";
    
    @Mod.Instance(MODID)
	public static AimlessExpansion instance = new AimlessExpansion();

    private static Logger logger;
    
    public static CreativeTabs tab = new CreativeTabs("aimlessexpansion"){
    	@Override
    	public ItemStack getTabIconItem(){
    		return new ItemStack(Items.APPLE);
    	}
    };
    
    @SidedProxy(clientSide = "com.lance5057.aimlessexpansion.proxy.ClientProxy", serverSide = "com.lance5057.aimlessexpansion.proxy.CommonProxy")
	public static CommonProxy proxy;

    public ModBlocks blocks = new ModBlocks();
    public ModBiomes biomes = new ModBiomes();
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        
        blocks.PreInit(event);
        biomes.PreInit(event);
        
        proxy.PreInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	biomes.Init(event);
    }
}
