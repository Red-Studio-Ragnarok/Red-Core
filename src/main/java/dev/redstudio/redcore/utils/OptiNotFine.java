package dev.redstudio.redcore.utils;

import dev.redstudio.redcore.ticking.RedClientTicker;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.lang.reflect.Field;

import static dev.redstudio.redcore.utils.ProjectConstants.RED_LOGGER;

/**
 * This class provides methods to communicate with OptiNotFine (Can you see that I hate OptiFine?)
 *
 * @author Desoroxxx
 * @since 0.3
 */
@SideOnly(Side.CLIENT)
public class OptiNotFine {

    private static boolean checkedOptiFineInstalled = false;
    private static boolean isOptiFineInstalled = true;

    private static Field shaderPackLoadedField = null;
    private static Field fastRenderField = null;

    /**
     * Checks if OptiFine is installed.
     *
     * @return True if OptiFine is installed, false otherwise.
     */
    public static boolean isOptiFineInstalled() {
        if (!checkedOptiFineInstalled) {
            try {
                Class.forName("optifine.Installer");
            } catch (ClassNotFoundException ignored) {
                isOptiFineInstalled = false;
            }

            checkedOptiFineInstalled = true;
        }

        return isOptiFineInstalled;
    }

    /**
     * Checks if OptiFine shaders are enabled.
     *
     * @return True if shaders are enabled, false otherwise.
     */
    public static boolean shadersEnabled() {
        if (!isOptiFineInstalled())
            return false;

        try {
            if (shaderPackLoadedField == null)
                shaderPackLoadedField = Class.forName("net.optifine.shaders.Shaders").getDeclaredField("shaderPackLoaded");

            return (boolean) shaderPackLoadedField.get(null);
        } catch (IllegalAccessException | ClassNotFoundException | NoSuchFieldException exception) {
            RED_LOGGER.printFramedError("OptiNotFine", "Could not get OptiFine shaders status.", "If shaders are enabled things might break", exception.getMessage());
            return false;
        }
    }

    /**
     * Forces OptiFine fast render option to be disabled.
     * <p>
     * This method starts the client ticker and registers the OptiNotFine class as an event listener which will attempt to disable OptiFine's fast render each tick.
     */
    public static void forceOptiFineFastRenderOff() {
        RedClientTicker.startClientTicker();

        MinecraftForge.EVENT_BUS.register(OptiNotFine.class);
    }

    /**
     * Disable OptiFine fast renderer.
     */
    @SuppressWarnings("JavaReflectionMemberAccess")
    private static void disableFastRender() {
        if (!isOptiFineInstalled())
            return;

        try {
            if (fastRenderField == null)
                fastRenderField = Class.forName("net.minecraft.client.settings.GameSettings").getDeclaredField("ofFastRender");

            if (fastRenderField.getBoolean(Minecraft.getMinecraft().gameSettings))
                fastRenderField.set(Minecraft.getMinecraft().gameSettings, false);
        } catch (IllegalAccessException | ClassNotFoundException | NoSuchFieldException exception) {
            RED_LOGGER.printFramedError("OptiNotFine", "Could not disable OptiFine fast renderer", "Things will break", exception.getMessage());
        }
    }

    @SubscribeEvent
    public static void onClientQuarterTickEvent(TickEvent.ClientTickEvent clientTickEvent) {
        disableFastRender();
    }
}
