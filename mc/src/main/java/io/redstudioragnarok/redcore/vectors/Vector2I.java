package io.redstudioragnarok.redcore.vectors;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec2f;

/**
 * @author Luna Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated
@SuppressWarnings("unused")
public final class Vector2I {

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2I#x}
     */
    public int x;
    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2I#y}
     */
    public int y;

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2I#Vector2I()}
     */
    public Vector2I() {
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2I#Vector2I(int, int)}
     */
    public Vector2I(final int inputX, final int inputY) {
        x = inputX;
        y = inputY;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2I#Vector2I(Vec2f)}
     */
    public Vector2I(final Vec2f input) {
        x = (int) input.x;
        y = (int) input.y;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2I#zero()}
     */
    public void zero() {
        x = y = 0;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2I#write(ByteBuf)}
     */
    public void write(final ByteBuf byteBuf) {
        byteBuf.writeInt(x);
        byteBuf.writeInt(y);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector2I#read(ByteBuf)}
     */
    public void read(final ByteBuf byteBuf) {
        x = byteBuf.readInt();
        y = byteBuf.readInt();
    }
}
