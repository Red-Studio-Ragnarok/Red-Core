package io.redstudioragnarok.redcore.vectors;

import dev.redstudio.redcore.annotations.RedDeprecated;
import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec2f;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
@SuppressWarnings("unused")
public final class Vector2F {

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2F#x}
     */
    public float x;
    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2F#y}
     */
    public float y;

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2F#Vector2F()}
     */
    public Vector2F() {
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2F#Vector2F(float, float)}
     */
    public Vector2F(final float inputX, final float inputY) {
        x = inputX;
        y = inputY;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2F#Vector2F(Vec2f)}
     */
    public Vector2F(final Vec2f input) {
        x = input.x;
        y = input.y;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2F#zero()}
     */
    public void zero() {
        x = y = 0;
    }

    /*===================================== NETWORKING =====================================*/

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2F#write(ByteBuf)}
     */
    public void write(final ByteBuf byteBuf) {
        byteBuf.writeFloat(x);
        byteBuf.writeFloat(y);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2F#read(ByteBuf)}
     */
    public void read(final ByteBuf byteBuf) {
        x = byteBuf.readFloat();
        y = byteBuf.readFloat();
    }
}
