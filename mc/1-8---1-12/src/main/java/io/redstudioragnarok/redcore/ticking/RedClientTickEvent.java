package io.redstudioragnarok.redcore.ticking;

import dev.redstudio.redcore.annotations.RedDeprecated;
import net.minecraftforge.fml.common.eventhandler.Event;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
public class RedClientTickEvent extends Event {

    /**
     * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.BiTickEvent}
     */
    @RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    public static class BiTickEvent extends RedClientTickEvent {

        /**
         * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.BiTickEvent#BiTickEvent()}
         */
        @RedDeprecated(since = "0.5", forRemovalIn = "0.8")
        public BiTickEvent() {
        }
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.PentaTickEvent}
     */
    @RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    public static class PentaTickEvent extends RedClientTickEvent {

        /**
         * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.PentaTickEvent#PentaTickEvent()}
         */
        @RedDeprecated(since = "0.5", forRemovalIn = "0.8")
        public PentaTickEvent() {
        }
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.DecaTickEvent}
     */
    @RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    public static class DecaTickEvent extends RedClientTickEvent {

        /**
         * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.DecaTickEvent#DecaTickEvent()}
         */
        @RedDeprecated(since = "0.5", forRemovalIn = "0.8")
        public DecaTickEvent() {
        }
    }
}
