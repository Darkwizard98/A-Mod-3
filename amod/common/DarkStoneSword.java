package amod.common;

import net.minecraft.src.EnumRarity;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ItemSword;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class DarkStoneSword extends ItemSword{
	public DarkStoneSword(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
	}
	public String getTextureFile(){
		return "/AmodTextures/Items.png";
	}
	
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.epic;
	}

}
