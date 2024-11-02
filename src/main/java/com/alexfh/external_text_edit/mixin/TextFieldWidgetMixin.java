package com.alexfh.external_text_edit.mixin;

import com.alexfh.external_text_edit.ExternalTextEdit;
import net.minecraft.client.gui.widget.TextFieldWidget;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TextFieldWidget.class)
public class TextFieldWidgetMixin
{
    @Inject(at = @At("HEAD"), method = "keyPressed(III)Z", cancellable = true)
    private void keyPressed(int keyCode, int scanCode, int modifiers, CallbackInfoReturnable<Boolean> cir)
    {
        boolean isControlE = keyCode == net.minecraft.client.util.InputUtil.GLFW_KEY_E &&
                             modifiers == GLFW.GLFW_MOD_CONTROL;
        if (!isControlE)
        {
            return;
        }
        ExternalTextEdit.editFieldWithExternalEditor((TextFieldWidget) (Object) this);
        cir.setReturnValue(true);
    }
}