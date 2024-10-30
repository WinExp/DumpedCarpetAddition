package com.github.winexp.dumpedcarpetaddition.carpet;

import carpet.CarpetExtension;
import carpet.CarpetServer;
import carpet.api.settings.SettingsManager;
import carpet.utils.Translations;
import com.github.winexp.dumpedcarpetaddition.DumpedCarpetAddition;

import java.util.Map;

public class CarpetExtensionImpl implements CarpetExtension {
    private static final CarpetExtensionImpl INSTANCE = new CarpetExtensionImpl();
    private static final SettingsManager SETTINGS_MANAGER = new SettingsManager(
            DumpedCarpetAddition.VERSION,
            DumpedCarpetAddition.MOD_ID,
            DumpedCarpetAddition.MOD_NAME
    );

    public static void init() {
        CarpetServer.manageExtension(INSTANCE);
    }

    @Override
    public void onGameStarted() {
        SETTINGS_MANAGER.parseSettingsClass(ModSettings.class);
    }

    @Override
    public String version() {
        return DumpedCarpetAddition.VERSION;
    }

    @Override
    public SettingsManager extensionSettingsManager() {
        return SETTINGS_MANAGER;
    }

    @Override
    public Map<String, String> canHasTranslations(String lang) {
        return Translations.getTranslationFromResourcePath("assets/dca/lang/%s.json".formatted(lang));
    }
}
