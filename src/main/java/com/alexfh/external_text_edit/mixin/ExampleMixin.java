package com.alexfh.external_text_edit.mixin;

import com.alexfh.external_text_edit.ExternalTextEdit;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public
class ExampleMixin
{
    @Inject(at = @At("HEAD"), method = "run")
    private
    void run(CallbackInfo info)
    {
        ExternalTextEdit.LOGGER.info("Hello from mixin");
    }
}