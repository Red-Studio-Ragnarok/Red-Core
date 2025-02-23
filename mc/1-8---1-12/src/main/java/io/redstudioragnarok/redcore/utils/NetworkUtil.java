package io.redstudioragnarok.redcore.utils;

import dev.redstudio.redcore.annotations.RedDeprecated;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
public final class NetworkUtil {

    /**
     * @deprecated Use {@link dev.redstudio.redcore.utils.NetworkUtil#processMessage}
     */
    @RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    public static void processMessage(final MessageContext messageContext, final Runnable runnable) {
        dev.redstudio.redcore.utils.NetworkUtil.processMessage(messageContext, runnable);
    }
}
