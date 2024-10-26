package com.alexfh.external_text_edit;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class ExternalTextEdit implements ClientModInitializer
{
    public static final Logger LOGGER = LoggerFactory.getLogger("external-text-edit");

    @Override
    public
    void onInitializeClient()
    {
        ExternalTextEdit.LOGGER.info("Hello Fabric world!");
    }
}