package com.brodi.onehack.mixins;

import com.brodi.onehack.ui.Hud;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class inGameHudMixin {

    @Inject(method = "render", at = @At("RETURN"), cancellable = true)
    public void renderHud(DrawContext context, float tickDelta, CallbackInfo ci) {
        Hud.render(context, tickDelta);
    }
}
