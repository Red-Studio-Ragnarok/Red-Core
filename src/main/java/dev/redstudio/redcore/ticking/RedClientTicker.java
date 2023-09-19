package dev.redstudio.redcore.ticking;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * This class is responsible for ticking the different click tick events
 *
 * @author Desoroxxx
 * @since 0.3
 */
@SideOnly(Side.CLIENT)
public class RedClientTicker {

    private static int biTickCount, pentaTickCount, decaTickCount;

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onClientTickEvent(final TickEvent.ClientTickEvent clientTickEvent) {
        if (clientTickEvent.phase != TickEvent.Phase.START)
            return;

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

    /**
     * Starts the client ticker.
     * <p>
     * This method registers {@link RedClientTicker} in the {@link MinecraftForge} event bus if the client ticker has not already been started.
     * <p>
     * The client ticker is responsible for ticking and thus sending the {@link RedClientTickEvent}.
     * <p>
     * For performance reasons, this should be called on any of the init methods in your mod.
     *
     * @author Desoroxxx
     * @since 0.3
     */
    @SideOnly(Side.CLIENT)
    public static void startClientTicker() {
        MinecraftForge.EVENT_BUS.register(RedClientTicker.class);
    }
}
