package com.github.winexp.largeoakfix.carpet;

import carpet.api.settings.Rule;

public class ModSettings {
    private static class Categories {
        public static final String LARGE_OAK_FIX = "largeoakfix";
        public static final String BUGFIX = "bugfix";
        public static final String EXPERIMENTAL = "experimental";
    }

    @Rule(categories = {Categories.LARGE_OAK_FIX, Categories.BUGFIX, Categories.EXPERIMENTAL})
    public static boolean largeOakGenerationFix = false;
}
