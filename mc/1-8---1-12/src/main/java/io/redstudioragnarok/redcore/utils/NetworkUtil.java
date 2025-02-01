package io.redstudioragnarok.redcore.utils;

import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated // Todo: Remove in 0.8
public final class NetworkUtil {

    /**
     * @deprecated Use {@link dev.redstudio.redcore.utils.NetworkUtil#processMessage}
     */
    @Deprecated
    public static void processMessage(final MessageContext messageContext, final Runnable runnable) {
        dev.redstudio.redcore.utils.NetworkUtil.processMessage(messageContext, runnable);
    }
}
