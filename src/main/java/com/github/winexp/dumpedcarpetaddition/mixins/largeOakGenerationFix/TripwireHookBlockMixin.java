package com.github.winexp.dumpedcarpetaddition.mixins.largeOakGenerationFix;

import com.github.winexp.dumpedcarpetaddition.carpet.ModSettings;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.level.block.TripWireHookBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(TripWireHookBlock.class)
public abstract class TripwireHookBlockMixin {
    @WrapOperation(
            method = "calculateState",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Ljava/lang/Object;)Z"),
            slice = @Slice(
                    from = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", ordinal = 1)
            )
    )
    private static boolean reintroduceStringDuper(BlockState instance, Object block, Operation<Boolean> original) {
        return ModSettings.stringDuperReintroduced || original.call(instance, block);
    }
}
