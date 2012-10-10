package amod.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class DarkBlueMatterDust extends Item{
	public DarkBlueMatterDust(int ItemID){
		super(ItemID);
		maxStackSize=64;
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	public String getTextureFile(){
		return "/AmodTextures/Items.png";
	}

}
