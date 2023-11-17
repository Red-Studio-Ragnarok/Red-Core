package io.redstudioragnarok.redcore;

import dev.redstudio.redcore.utils.OptiNotFine;
import io.redstudioragnarok.redcore.ticking.RedClientTicker;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Luna Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated // Todo: Remove in 0.8
public final class RedCore {

    /**
     * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTicker#startClientTicker}
     */
    @Deprecated
    @SideOnly(Side.CLIENT)
    public static void startClientTicker() {
        MinecraftForge.EVENT_BUS.register(RedClientTicker.class);
    }

    /**
     * @deprecated Use {@link OptiNotFine#forceOptiFineFastRenderOff}
     */
    @Deprecated
    @SideOnly(Side.CLIENT)
    public static void forceOptiFineFastRenderOff() {
        OptiNotFine.forceOptiFineFastRenderOff();
    }
}
