package com.github.winexp.largeoakfix;

import com.github.winexp.largeoakfix.carpet.CarpetExtensionImpl;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class LargeOakFix implements ModInitializer {
    public static final String MOD_ID = "largeoakfix";
    public static String VERSION;

    @Override
    public void onInitialize() {
        VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(RuntimeException::new).getMetadata().getVersion().getFriendlyString();
        CarpetExtensionImpl.init();
    }
}
