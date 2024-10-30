package com.github.winexp.dumpedcarpetaddition;

import com.github.winexp.dumpedcarpetaddition.carpet.CarpetExtensionImpl;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class DumpedCarpetAddition implements ModInitializer {
    public static final String MOD_ID = "dca";
    public static final String MOD_NAME = "Dumped Carpet Addition";
    public static String VERSION;

    @Override
    public void onInitialize() {
        VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(RuntimeException::new).getMetadata().getVersion().getFriendlyString();
        CarpetExtensionImpl.init();
    }
}
