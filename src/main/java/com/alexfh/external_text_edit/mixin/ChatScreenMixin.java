package com.alexfh.external_text_edit.mixin;

import com.alexfh.external_text_edit.ExternalTextEdit;
import net.minecraft.client.gui.screen.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChatScreen.class)
public class ChatScreenMixin
{
    @Inject(at = @At("HEAD"), method = "keyPressed(III)Z")
    private void keyPressedStart(int keyCode, int scanCode, int modifiers, CallbackInfoReturnable<Boolean> cir)
    {
        ExternalTextEdit.processingChatScreenKeyPress = true;
    }

    @Inject(at = @At("RETURN"), method = "keyPressed(III)Z")
    private void keyPressedEnd(int keyCode, int scanCode, int modifiers, CallbackInfoReturnable<Boolean> cir)
    {
        ExternalTextEdit.processingChatScreenKeyPress = false;
    }
}