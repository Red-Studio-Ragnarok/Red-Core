package io.redstudioragnarok.redcore.utils;

import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * @author Luna Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated
public final class NetworkUtil {

    /**
     * @deprecated Use {@link dev.redstudio.redcore.utils.NetworkUtil#processMessage}
     */
    @Deprecated
    public static void processMessage(final MessageContext messageContext, final Runnable runnable) {
        dev.redstudio.redcore.utils.NetworkUtil.processMessage(messageContext, runnable);
    }
}
