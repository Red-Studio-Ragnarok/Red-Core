package dev.redstudio.redcore.ticking;

import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static lombok.AccessLevel.PRIVATE;

/// This class has different client tick events, that fire less often than the client ticks.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.3
@SideOnly(Side.CLIENT)
@NoArgsConstructor(access = PRIVATE)
public class RedClientTickEvent extends Event {

    /// This event is fired each 2 ticks.
    ///
    /// In a client that is not lagging, it would be fired 10 times a second.
    @NoArgsConstructor
    public static class BiTickEvent extends RedClientTickEvent {
    }

    /// This event is fired each 5 ticks.
    ///
    /// In a client that is not lagging, it would be fired 4 times a second.
    @NoArgsConstructor
    public static class PentaTickEvent extends RedClientTickEvent {
    }

    /// This event is fired each 10 ticks.
    ///
    /// In a client that is not lagging, it would be fired 2 times a second.
    @NoArgsConstructor
    public static class DecaTickEvent extends RedClientTickEvent {
    }
}
