package io.redstudioragnarok.redcore.ticking;

import dev.redstudio.redcore.annotations.RedDeprecated;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
public class RedClientTicker {

    private static int biTickCount, pentaTickCount, decaTickCount;

    /**
     * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTicker#onClientTickEvent}
     */
    @Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onClientTickEvent(TickEvent.ClientTickEvent clientTickEvent) {
        if (clientTickEvent.phase == TickEvent.Phase.START) {

            biTickCount++;
            if (biTickCount == 2) {
                MinecraftForge.EVENT_BUS.post(new RedClientTickEvent.BiTickEvent());
                biTickCount = 0;
            }

            pentaTickCount++;
            if (pentaTickCount == 5) {
                MinecraftForge.EVENT_BUS.post(new RedClientTickEvent.PentaTickEvent());
                pentaTickCount = 0;
            }

            decaTickCount++;
            if (decaTickCount == 10) {
                MinecraftForge.EVENT_BUS.post(new RedClientTickEvent.DecaTickEvent());
                decaTickCount = 0;
            }
        }
    }
}
