package amod.common;

import net.minecraft.src.Block;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid="Jake-Amod", name="Amod", version="1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_amod {
	//Int Stuff
	public static Block LightStoneOre;
	public static Block DarkStoneOre;
	public static Item DarkStoneSword;
	
	//Proxy
	
	@SidedProxy(clientSide="amod.Client.ClientProxy", serverSide= "amod.Common.CommonProxy")
	public static CommonProxy proxy;
	
	//ToolMaterial
	
	static EnumToolMaterial EnumAmodMat= EnumHelper.addToolMaterial("Amod", 2, 400, 6.0F, 6, 15);
	
	@Init
	public void load(FMLInitializationEvent even){
		//Declare Stuff
		LightStoneOre=(new LightStoneOre(255, 0)).setBlockName("LightStoneOre").setHardness(1F).setResistance(5F);
		DarkStoneOre=(new DarkStoneOre(254, 1)).setBlockName("DarkStoneOre").setHardness(1F).setResistance(5F);
		DarkStoneSword=new DarkStoneSword(500, EnumAmodMat).setItemName("DarkStoneSword").setIconIndex(2);
		
		//Register Name
		GameRegistry.registerBlock(LightStoneOre);
		GameRegistry.registerBlock(DarkStoneOre);
		
		//Register Block/Items
		LanguageRegistry.addName(LightStoneOre, "LightStone Ore");
		LanguageRegistry.addName(DarkStoneOre, "DarkStone Ore");
		
		//Crafting Recipes
		
		//Smeltiing Recipe
		
		//Texture Register
		proxy.registerRenderThings();
		
	}

}
