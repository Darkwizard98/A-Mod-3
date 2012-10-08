package amod.common;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class LightStoneOre extends Block {
	public LightStoneOre(int par1, int par2){
		super(par1, par2, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public String getTextureFile(){
		return "/AmodTextures/Blocks.png";
	}
	public int idDropped(int par1, Random par2Random, int par3){
		return mod_amod.LightStoneBall.shiftedIndex;
	}
	public int quantityDropped(Random par1Random){
		return par1Random.nextInt(6)+1;
	}

}
