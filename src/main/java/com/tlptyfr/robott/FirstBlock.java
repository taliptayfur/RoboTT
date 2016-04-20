package com.tlptyfr.robott;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FirstBlock extends Block {
	 public FirstBlock() {
	        super(Material.rock);
	        setUnlocalizedName("firstblock");     // Used for localization (en_US.lang)
	        setRegistryName("firstblock");        // The unique name (within your mod) that identifies this block
	        GameRegistry.registerBlock(this);
	    }
}
