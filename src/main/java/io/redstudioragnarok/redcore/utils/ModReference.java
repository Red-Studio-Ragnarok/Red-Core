package io.redstudioragnarok.redcore.utils;

import io.redstudioragnarok.redcore.Tags;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class defines constants for Red Core.
 * <p>
 * ID and VERSION are automatically updated by RFG.
 */
public class ModReference {

    public static final String ID = Tags.ID;
    public static final String NAME = "Red Core";
    public static final String VERSION = Tags.VERSION;
    public static final Logger LOG = LogManager.getLogger(ID);
}
