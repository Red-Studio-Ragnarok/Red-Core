package io.redstudioragnarok.redcore.ticking;

import net.minecraftforge.fml.common.eventhandler.Event;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated  // Todo: Remove in 0.8
public class RedClientTickEvent extends Event {

    /**
     * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.BiTickEvent}
     */
    @Deprecated
    public static class BiTickEvent extends RedClientTickEvent {

        /**
         * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.BiTickEvent#BiTickEvent()}
         */
        @Deprecated
        public BiTickEvent() {
        }
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.PentaTickEvent}
     */
    @Deprecated
    public static class PentaTickEvent extends RedClientTickEvent {

        /**
         * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.PentaTickEvent#PentaTickEvent()}
         */
        @Deprecated
        public PentaTickEvent() {
        }
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.DecaTickEvent}
     */
    @Deprecated
    public static class DecaTickEvent extends RedClientTickEvent {

        /**
         * @deprecated Use {@link dev.redstudio.redcore.ticking.RedClientTickEvent.DecaTickEvent#DecaTickEvent()}
         */
        @Deprecated
        public DecaTickEvent() {
        }
    }
}
