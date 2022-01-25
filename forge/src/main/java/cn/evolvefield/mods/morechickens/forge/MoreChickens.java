package cn.evolvefield.mods.morechickens.forge;

import dev.architectury.platform.forge.EventBuses;
import cn.evolvefield.mods.morechickens.MoreChickensCommon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoreChickensCommon.MOD_ID)
public class MoreChickens {
    public MoreChickens() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(MoreChickensCommon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        MoreChickensCommon.init();
    }
}
