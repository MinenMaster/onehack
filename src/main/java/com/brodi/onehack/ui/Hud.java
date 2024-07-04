package com.brodi.onehack.ui;
import com.brodi.onehack.module.Mod;
import com.brodi.onehack.module.ModuleManager;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import org.apache.logging.log4j.util.PropertySource;

import java.util.Comparator;
import java.util.List;

public class Hud {
    private static MinecraftClient mc = MinecraftClient.getInstance();
    public static void render(DrawContext context, float tickDelta) {
        context.drawText(mc.textRenderer, "OneHack" , 10, 10, -1, true);
        renderArrayList(context);
    }

    public static void renderArrayList(DrawContext context) {
        int index = 0;
        int sWidth = mc.getWindow().getScaledWidth();

        List<Mod> enabledModules = ModuleManager.INSTANCE.getEnabledModules();

        enabledModules.sort(Comparator.comparingInt(m -> mc.textRenderer.getWidth(((Mod)m).getDisplayName())).reversed());

        for (Mod mod : enabledModules) {
            context.drawText(mc.textRenderer, mod.getDisplayName(), (sWidth - 4) - mc.textRenderer.getWidth(mod.getDisplayName()), 10 + (index * mc.textRenderer.fontHeight), -1, true);
            index++;
        }
    }
}
