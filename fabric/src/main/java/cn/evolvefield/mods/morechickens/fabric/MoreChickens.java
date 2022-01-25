package cn.evolvefield.mods.morechickens.fabric;

import cn.evolvefield.mods.morechickens.MoreChickensCommon;
import net.fabricmc.api.ModInitializer;

public class MoreChickens implements ModInitializer {
    @Override
    public void onInitialize() {
        MoreChickensCommon.init();
    }
}
