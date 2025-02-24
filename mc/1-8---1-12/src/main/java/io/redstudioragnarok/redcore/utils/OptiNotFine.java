package io.redstudioragnarok.redcore.utils;

import dev.redstudio.redcore.annotations.RedDeprecated;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
@SideOnly(Side.CLIENT)
@SuppressWarnings("unused")
public final class OptiNotFine {

    /**
     * @deprecated Use {@link dev.redstudio.redcore.utils.OptiNotFine#isOptiFineInstalled()}
     */
    @Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    public static boolean isOptiFineInstalled() {
        return dev.redstudio.redcore.utils.OptiNotFine.isOptiFineInstalled();
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.utils.OptiNotFine#shadersEnabled}
     */
    @Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    public static boolean shadersEnabled() {
        return dev.redstudio.redcore.utils.OptiNotFine.shadersEnabled();
    }
}
