package com.github.winexp.dumpedcarpetaddition.carpet;

import carpet.api.settings.Rule;

public class ModSettings {
    private static class Categories {
        public static final String EXPERIMENTAL = "experimental";
        public static final String BUGFIX = "bugfix";
    }

    @Rule(categories = {Categories.EXPERIMENTAL, Categories.BUGFIX})
    public static boolean largeOakGenerationFix = false;
}
