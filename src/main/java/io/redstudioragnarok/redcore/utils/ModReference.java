package io.redstudioragnarok.redcore.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class defines constants for Red Core.
 * <p>
 * They are automatically updated by Gradle on compile time, except for the name as Gradle would remove spaces.
 */
public class ModReference {

    public static final String id = "@ID@";
    public static final String name = "Red Core";
    public static final String version = "@VERSION@";
    public static final Logger log = LogManager.getLogger(id);
}
