package io.redstudioragnarok.redcore.vectors;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec2f;

/**
 * @author Luna Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated // Todo: Remove in 0.8
@SuppressWarnings("unused")
public final class Vector2D {

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2D#x}
     */
    public double x;
    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2D#y}
     */
    public double y;

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2D#Vector2D()}
     */
    public Vector2D() {
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2D#Vector2D(double, double)}
     */
    public Vector2D(final double inputX, final double inputY) {
        x = inputX;
        y = inputY;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2D#Vector2D(Vec2f)}
     */
    public Vector2D(final Vec2f input) {
        x = input.x;
        y = input.y;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2D#zero()}
     */
    public void zero() {
        x = y = 0;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2D#write(ByteBuf)}
     */
    public void write(final ByteBuf byteBuf) {
        byteBuf.writeDouble(x);
        byteBuf.writeDouble(y);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2D#read(ByteBuf)}
     */
    public void read(final ByteBuf byteBuf) {
        x = byteBuf.readDouble();
        y = byteBuf.readDouble();
    }
}
