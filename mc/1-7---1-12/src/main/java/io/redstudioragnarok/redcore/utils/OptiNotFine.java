package io.redstudioragnarok.redcore.utils;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Luna Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated // Todo: Remove in 0.8
@SideOnly(Side.CLIENT)
@SuppressWarnings("unused")
public final class OptiNotFine {

    /**
     * @deprecated Use {@link dev.redstudio.redcore.utils.OptiNotFine#isOptiFineInstalled()}
     */
    @Deprecated
    public static boolean isOptiFineInstalled() {
        return dev.redstudio.redcore.utils.OptiNotFine.isOptiFineInstalled();
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.utils.OptiNotFine#shadersEnabled}
     */
    @Deprecated
    public static boolean shadersEnabled() {
        return dev.redstudio.redcore.utils.OptiNotFine.shadersEnabled();
    }
}
