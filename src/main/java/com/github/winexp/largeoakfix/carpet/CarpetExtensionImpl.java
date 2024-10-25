package com.github.winexp.largeoakfix.carpet;

import carpet.CarpetExtension;
import carpet.CarpetServer;
import carpet.utils.Translations;
import com.github.winexp.largeoakfix.LargeOakFix;

import java.util.Map;

public class CarpetExtensionImpl implements CarpetExtension {
    private static final CarpetExtensionImpl INSTANCE = new CarpetExtensionImpl();

    public static void init() {
        CarpetServer.manageExtension(INSTANCE);
    }

    @Override
    public void onGameStarted() {
        CarpetServer.settingsManager.parseSettingsClass(ModSettings.class);
    }

    @Override
    public String version() {
        return LargeOakFix.VERSION;
    }

    @Override
    public Map<String, String> canHasTranslations(String lang) {
        return Translations.getTranslationFromResourcePath("assets/largeoakfix/lang/%s.json".formatted(lang));
    }
}
