package amod.common;

import net.minecraft.src.Block;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid="Jake-Amod", name="Amod", version="Pre-Alpha b1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_amod {
	//Int Stuff
	public static Block LightStoneOre;
	public static Block DarkStoneOre;
	public static Block DarkBlueMatter;
	public static Item DarkStoneSword;
	public static Item DarkStoneAxe;
	public static Item DarkStoneSpade;
	public static Item DarkStonePick;
	public static Item LightStoneBall;
	public static Item DarkStoneBall;
	public static Item DarkBlueMatterDust;
	
	
	int LightStoneID, DarkStoneID, DarkStoneSwordID, DarkStoneAxeID, DarkStoneSpadeID, DarkStonePickID, LightStoneBallID,
	DarkBlueMatterID, DarkBlueMatterDustID, DarkStoneBallID;
	
	//Proxy
	
	@SidedProxy(clientSide="amod.Client.ClientProxy", serverSide= "amod.common.CommonProxy")
	public static CommonProxy proxy;
	
	//ToolMaterial
	
	static EnumToolMaterial EnumAmodMat= EnumHelper.addToolMaterial("Amod", 2, 400, 6.0F, 6, 15);
	
	@PreInit
	public void PreLoad(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		LightStoneID= config.getOrCreateIntProperty("LightStone Ore ID", Configuration.CATEGORY_BLOCK, 1551).getInt();
		DarkStoneID= config.getOrCreateIntProperty("DarkStone Ore ID", Configuration.CATEGORY_BLOCK, 1552).getInt();
		DarkBlueMatterID= config.getOrCreateIntProperty("Dark Blue Matter ID", Configuration.CATEGORY_BLOCK, 1553).getInt();
		DarkStoneSwordID= config.getOrCreateIntProperty("DarkStone Sword ID", Configuration.CATEGORY_ITEM, 4745).getInt();
		DarkStoneAxeID= config.getOrCreateIntProperty("DarkStone Axe ID", Configuration.CATEGORY_ITEM, 4746).getInt();
		DarkStoneSpadeID= config.getOrCreateIntProperty("DarkStone Spade ID", Configuration.CATEGORY_ITEM, 4747).getInt();
		DarkStonePickID= config.getOrCreateIntProperty("DarkStone Pick ID", Configuration.CATEGORY_ITEM, 4748).getInt();
		LightStoneBallID= config.getOrCreateIntProperty("LightStone Ball ID", Configuration.CATEGORY_ITEM, 4749).getInt();
		DarkBlueMatterDustID= config.getOrCreateIntProperty("Dark Blue Matter ID", Configuration.CATEGORY_ITEM, 4750).getInt();
		DarkStoneBallID= config.getOrCreateIntProperty("DarkStone Ball ID", Configuration.CATEGORY_ITEM, 4751).getInt();
		config.save();
		
	}
	
	
	@Init
	public void load(FMLInitializationEvent event){
		//Declare Stuff
		LightStoneOre=(new LightStoneOre(LightStoneID, 0)).setBlockName("LightStoneOre").setLightValue(1.0F).setHardness(1F).setResistance(5F);
		DarkStoneOre=(new DarkStoneOre(DarkStoneID, 1)).setBlockName("DarkStoneOre").setHardness(1F).setResistance(5F);
		DarkBlueMatter=(new DarkBlueMatter(DarkBlueMatterID, 2)).setBlockName("DarkBlueMatter").setHardness(1F).setResistance(5F);
		DarkStoneSword=new DarkStoneSword(DarkStoneSwordID, EnumAmodMat).setItemName("DarkStoneSword").setIconIndex(6);
		DarkStoneAxe=new DarkStoneAxe(DarkStoneAxeID, EnumAmodMat).setItemName("DarkStoneAxe").setIconIndex(1);
		DarkStoneSpade=new DarkStoneSpade(DarkStoneSpadeID, EnumAmodMat).setItemName("DarkStoneSpade").setIconIndex(3);
		DarkStonePick=new DarkStonePick(DarkStonePickID, EnumAmodMat).setItemName("DarkStonePick").setIconIndex(2);
		LightStoneBall=new LightStoneBall(LightStoneBallID).setItemName("LightStoneBall").setIconIndex(0);
		DarkStoneBall=new DarkStoneBall(DarkStoneBallID).setItemName("DarkStoneBall").setIconIndex(16);
		DarkBlueMatterDust=new DarkBlueMatterDust(DarkBlueMatterDustID).setItemName("DarkBlueMatterDust").setIconIndex(32);
		
		//Register Name
		GameRegistry.registerBlock(LightStoneOre);
		GameRegistry.registerBlock(DarkStoneOre);
		GameRegistry.registerBlock(DarkBlueMatter);
		GameRegistry.registerWorldGenerator(new AModWorldGen());
		
		//Register Block/Items
		LanguageRegistry.addName(LightStoneOre, "LightStone Ore");
		LanguageRegistry.addName(DarkStoneOre, "DarkStone Ore");
		LanguageRegistry.addName(DarkStoneSword, "DarkStone Sword");
		LanguageRegistry.addName(DarkStoneAxe, "DarkStone Axe");
		LanguageRegistry.addName(DarkStoneSpade, "DarkStone Spade");
		LanguageRegistry.addName(DarkStonePick, "DarkStone Pick");
		LanguageRegistry.addName(LightStoneBall, "LightStone Ball");
		LanguageRegistry.addName(DarkStoneBall, "DarkStone Ball");
		LanguageRegistry.addName(DarkBlueMatterDust, "Dark Blue Matter Dust");
		LanguageRegistry.addName(DarkBlueMatter, "Dark Blue Matter");
		
		//Crafting Recipes
		
		//Smeltiing Recipe
		
		//Texture Register
		proxy.registerRenderThings();
		
	}

}
