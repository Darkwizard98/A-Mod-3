package amod.common;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSword;

public class DarkStoneSword extends ItemSword{
	public DarkStoneSword(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
	}
	public String getTextureFile(){
		return "/Items.png";
	}

}
