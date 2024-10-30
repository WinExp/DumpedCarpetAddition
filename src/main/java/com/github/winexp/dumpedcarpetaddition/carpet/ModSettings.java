package com.github.winexp.dumpedcarpetaddition.carpet;

import carpet.api.settings.Rule;

public class ModSettings {
    private static class Categories {
        public static final String EXPERIMENTAL = "experimental";
        public static final String BUGFIX = "bugfix";
        public static final String FEATURE = "feature";
    }

    @Rule(categories = {Categories.EXPERIMENTAL, Categories.BUGFIX})
    public static boolean largeOakGenerationFix = false;

    @Rule(categories = {Categories.EXPERIMENTAL, Categories.FEATURE})
    public static boolean stringDuperReintroduced = false;
}
