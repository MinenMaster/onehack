package com.brodi.onehack.ui;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public class Hud {

    private static MinecraftClient mc = MinecraftClient.getInstance();

     public static void render(DrawContext context, float tickDelta) {
        context.drawText(mc.textRenderer, "OneHack" , 10, 10, -1, true);
        renderArrayList(context);
    }
}
