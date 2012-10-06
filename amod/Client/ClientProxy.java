package amod.Client;

import net.minecraftforge.client.MinecraftForgeClient;
import amod.common.CommonProxy;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderThings(){
		MinecraftForgeClient.preloadTexture("/Blocks.png");
		MinecraftForgeClient.preloadTexture("/Items.png");
	}

}
