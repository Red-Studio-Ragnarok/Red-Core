package dev.redstudio.redcore.utils;

import lombok.NoArgsConstructor;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import static lombok.AccessLevel.PRIVATE;

/**
 * A utility class for handling network related tasks.
 * <p>
 * This class contains methods for dealing with network messages in a multithreaded environment. Its primary method,
 * {@link #processMessage(MessageContext, Runnable)}, allows processing of network messages in a thread-safe manner,
 * ensuring the operations are performed on the main thread.
 * <p>
 * This class is designed to be thread-safe and its methods can be invoked from any thread without external synchronization.
 *
 * @author Desoroxxx
 * @since 0.4
 */
@NoArgsConstructor(access = PRIVATE)
public final class NetworkUtil {

    /**
     * Processes a message from a given context using a provided runnable.
     * <p>
     * This method is thread-safe; it checks if the calling thread is the main thread.
     * If so, it immediately runs the runnable.
     * If not, it schedules the runnable to be run on the main thread.
     *
     * @param messageContext The context of the message to be processed.
     * @param runnable The task to be run on the Minecraft main thread.
     */
    public static void processMessage(final MessageContext messageContext, final Runnable runnable) {
        final IThreadListener thread = FMLCommonHandler.instance().getWorldThread(messageContext.netHandler);

        if (thread.isCallingFromMinecraftThread())
            runnable.run();
        else
            thread.addScheduledTask(runnable);
    }
}
