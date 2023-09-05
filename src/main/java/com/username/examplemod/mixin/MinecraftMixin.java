package com.username.examplemod.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Minecraft.class)
public class MinecraftMixin
{
    /**
     * Overwrite window title update functionality
     * @author kww
     * @reason For example
     */
    @Overwrite
    public void func_230150_b_()
    {
        Minecraft.getInstance().getMainWindow().func_230148_b_("Any custom title?");
    }
}
