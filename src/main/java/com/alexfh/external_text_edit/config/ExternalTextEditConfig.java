package com.alexfh.external_text_edit.config;

import com.alexfh.external_text_edit.ExternalTextEdit;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

import java.util.List;

@Config(name = ExternalTextEdit.modID)
public class ExternalTextEditConfig implements ConfigData
{
    @ConfigEntry.Category(ExternalTextEdit.modID)
    @ConfigEntry.Gui.Tooltip()
    public List<String> editorCommand = List.of("gvim", "--nofork", "-c", "normal {line}G{column}|zz", "{file}");
}