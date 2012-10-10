package amod.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class DarkStoneBall extends Item{
	public DarkStoneBall(int ItemID){
		super(ItemID);
		maxStackSize=64;
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	public String getTextureFile(){
		return "/AmodTextures/Items.png";
	}

}
