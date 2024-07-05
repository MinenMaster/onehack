package com.brodi.onehack.movement;
import org.lwjgl.glfw.GLFW;
import com.brodi.onehack.module.Mod;



public class Flash extends Mod {
    public Flash() {
        super("Flash", "Walk faster", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_K);
    }

    @Override
    public void onTick() {
        super.onTick();
    }

    @Override
    public void onEnable() {
        assert mc.player != null;
        mc.player.getAbilities().setWalkSpeed(0.2F);
        super.onEnable();
    }

    @Override
    public void onDisable() {
        assert mc.player != null;
        mc.player.getAbilities().setWalkSpeed(0.05F);
        super.onTick();

    }
}


