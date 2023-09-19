package dev.redstudio.redcore.ticking;

import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * This class has different client tick events, that fire less often than the client ticks.
 *
 * @author Desoroxxx
 * @since 0.3
 */
@SideOnly(Side.CLIENT)
public class RedClientTickEvent extends Event {

    /**
     * This event is fired each 2 ticks.
     * <p>
     * In a client that is not lagging, it would be fired 10 times a second.
     */
    public static class BiTickEvent extends RedClientTickEvent {
        public BiTickEvent() {
        }
    }

    /**
     * This event is fired each 5 ticks.
     * <p>
     * In a client that is not lagging, it would be fired 4 times a second.
     */
    public static class PentaTickEvent extends RedClientTickEvent {
        public PentaTickEvent() {
        }
    }

    /**
     * This event is fired each 10 ticks.
     * <p>
     * In a client that is not lagging, it would be fired 2 times a second.
     */
    public static class DecaTickEvent extends RedClientTickEvent {
        public DecaTickEvent() {
        }
    }
}
