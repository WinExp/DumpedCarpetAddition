package com.github.winexp.dumpedcarpetaddition.mixins.largeOakGenerationFix;

import com.github.winexp.dumpedcarpetaddition.carpet.ModSettings;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.util.Mth;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(FancyTrunkPlacer.class)
public abstract class LargeOakTrunkPlacerMixin {
    @ModifyArg(method = "placeTrunk", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/BlockPos;<init>(III)V"), index = 1)
    private int modifyBranchStartY(int y, @Local(name = "branchHeight") double branchHeight, @Local(name = "trunkTop") int trunkTop) {
        if (ModSettings.largeOakGenerationFix)
            return branchHeight > (double) trunkTop ? trunkTop : Mth.floor(branchHeight);
        else return y;
    }
}
