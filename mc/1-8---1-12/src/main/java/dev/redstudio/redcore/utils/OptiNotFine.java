package dev.redstudio.redcore.utils;

import dev.redstudio.redcore.ticking.RedClientTicker;
import lombok.NoArgsConstructor;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;

import static dev.redstudio.redcore.ProjectConstants.RED_LOGGER;
import static lombok.AccessLevel.PRIVATE;

/// This class provides methods to communicate with OptiNotFine (Can you see that I hate OptiFine?)
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.3
@SideOnly(Side.CLIENT)
@NoArgsConstructor(access = PRIVATE)
public final class OptiNotFine {

    // Todo: Instead of periodically forcing fast render off, force it once and then disable the slider.
    // Todo: Allow forcing any OptiFine option to be disabled.

    private static final String OPTIFINE_CLASS = "optifine.Installer";
    private static final String SHADERS_CLASS = "net.optifine.shaders.Shaders";
    private static final String SHADER_PACK_LOADED_FIELD = "shaderPackLoaded";
    private static final String GAME_SETTINGS_CLASS = "net.minecraft.client.settings.GameSettings";
    private static final String FAST_RENDER_FIELD = "ofFastRender";

    private static boolean checkedOptiFineInstalled = false;
    private static boolean isOptiFineInstalled = true;

    private static MethodHandle shaderPackLoadedHandle = null;
    private static MethodHandle fastRenderGetterHandle = null;
    private static MethodHandle fastRenderSetterHandle = null;

    /// Checks if OptiFine is installed.
    ///
    /// @return True if OptiFine is installed, false otherwise.
    public static boolean isOptiFineInstalled() {
        if (!checkedOptiFineInstalled) {
            try {
                Class.forName(OPTIFINE_CLASS);
            } catch (ClassNotFoundException ignored) {
                isOptiFineInstalled = false;
            }

            checkedOptiFineInstalled = true;
        }

        return isOptiFineInstalled;
    }

    /// Checks if OptiFine shaders are enabled.
    ///
    /// @return True if shaders are enabled, false otherwise.
    public static boolean shadersEnabled() {
        if (!isOptiFineInstalled())
            return false;

        try {
            if (shaderPackLoadedHandle == null) {
                final Field shaderPackLoadedField = Class.forName(SHADERS_CLASS).getDeclaredField(SHADER_PACK_LOADED_FIELD);
                shaderPackLoadedHandle = MethodHandles.lookup().unreflectGetter(shaderPackLoadedField);
            }

            return (boolean) shaderPackLoadedHandle.invoke();
        } catch (Throwable exception) {
            RED_LOGGER.framedError("OptiNotFine", "Could not get OptiFine shaders status.", "If shaders are enabled things might break", exception.getMessage());
            return false;
        }
    }

    /// Forces OptiFine fast render option to be disabled.
    ///
    /// This method starts the client ticker and registers the OptiNotFine class as an event listener which will attempt to disable OptiFine's fast render each tick.
    public static void forceOptiFineFastRenderOff() {
        RedClientTicker.startClientTicker();

        MinecraftForge.EVENT_BUS.register(OptiNotFine.class);
    }

    /// Disable OptiFine fast renderer.
    @SuppressWarnings("JavaReflectionMemberAccess")
    private static void disableFastRender() {
        if (!isOptiFineInstalled())
            return;

        try {
            if (fastRenderGetterHandle == null || fastRenderSetterHandle == null) {
                final Field fastRenderField = Class.forName(GAME_SETTINGS_CLASS).getDeclaredField(FAST_RENDER_FIELD);
                fastRenderGetterHandle = MethodHandles.lookup().unreflectGetter(fastRenderField);
                fastRenderSetterHandle = MethodHandles.lookup().unreflectSetter(fastRenderField);
            }

            final Minecraft mc = Minecraft.getMinecraft();

            if ((boolean) fastRenderGetterHandle.invoke(mc.gameSettings))
                fastRenderSetterHandle.invoke(mc.gameSettings, false);
        } catch (Throwable exception) {
            RED_LOGGER.framedError("OptiNotFine", "Could not disable OptiFine fast renderer", "Things will break", exception.getMessage());
        }
    }

    @SubscribeEvent
    public static void onClientQuarterTickEvent(TickEvent.ClientTickEvent clientTickEvent) {
        disableFastRender();
    }
}
