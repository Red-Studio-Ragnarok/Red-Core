package io.redstudioragnarok.redcore.ticking;

import dev.redstudio.redcore.annotations.RedDeprecated;
import net.minecraftforge.fml.common.eventhandler.Event;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
public class RedClientTickEvent extends Event {

    /**
     * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.BiTickEvent}
     */
    @Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    public static class BiTickEvent extends RedClientTickEvent {

        /**
         * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.BiTickEvent#BiTickEvent()}
         */
        @Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
        public BiTickEvent() {
        }
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.PentaTickEvent}
     */
    @Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    public static class PentaTickEvent extends RedClientTickEvent {

        /**
         * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.PentaTickEvent#PentaTickEvent()}
         */
        @Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
        public PentaTickEvent() {
        }
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.DecaTickEvent}
     */
    @Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    public static class DecaTickEvent extends RedClientTickEvent {

        /**
         * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.DecaTickEvent#DecaTickEvent()}
         */
        @Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
        public DecaTickEvent() {
        }
    }
}
