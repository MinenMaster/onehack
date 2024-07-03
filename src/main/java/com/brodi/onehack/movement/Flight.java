package com.brodi.onehack.movement;
import org.lwjgl.glfw.GLFW;
import net.minecraft.client.MinecraftClient;
import com.brodi.onehack.module.Mod;

public class Flight extends Mod {

    public Flight() {
        super("Flight", "Allows you to fly", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_L);

    }

    @Override
    public void onTick() {
        mc.player.getAbilities().flying = true;

        super.onTick();
    }

    @Override
    public void onEnable() {
        mc.player.getAbilities().setFlySpeed(0.1F);
        super.onEnable();
    }

    @Override
    public void onDisable() {
        mc.player.getAbilities().setFlySpeed(0.05F);
        mc.player.getAbilities().flying = false;
        super.onTick();

    }
}
