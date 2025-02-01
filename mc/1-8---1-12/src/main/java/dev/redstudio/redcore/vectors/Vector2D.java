package dev.redstudio.redcore.vectors;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec2f;

/**
 * Represents a two-dimensional vector with `x` and `y` coordinates using double.
 * <p>
 * All operations are directly performed on the vector.
 *
 * @author Desoroxxx
 * @since 0.2
 * @deprecated Use {@link dev.redstudio.redcore.math.vectors.Vector2D} instead.
 */
@Deprecated // Todo: Remove in 0.8
public final class Vector2D {

    /** The x component of this vector. */
    public double x;
    /** The y component of this vector. */
    public double y;

    /**
     * Constructs a new "empty" vector.
     */
    public Vector2D() {
    }

    /**
     * Constructs a new vector with the given x and y coordinates.
     *
     * @param inputX The X coordinate
     * @param inputY The Y coordinate
     */
    public Vector2D(final double inputX, final double inputY) {
        x = inputX;
        y = inputY;
    }

    /**
     * Constructs a new vector with the same coordinates as the given `input` Vec2f.
     *
     * @param input The Vec2f to copy the coordinates from
     */
    public Vector2D(final Vec2f input) {
        x = input.x;
        y = input.y;
    }

    /**
     * Sets all coordinates of this vector to zero.
     */
    public void zero() {
        x = y = 0;
    }

    /**
     * Writes the x and y coordinates of this vector to the given `byteBuf`.
     *
     * @param byteBuf The ByteBuf to which the coordinates are written
     */
    public void write(final ByteBuf byteBuf) {
        byteBuf.writeDouble(x);
        byteBuf.writeDouble(y);
    }

    /**
     * Reads the x and y coordinates from the given `byteBuf` and assigns them to the coordinate of this vector.
     *
     * @param byteBuf The ByteBuf from which the coordinates are read
     */
    public void read(final ByteBuf byteBuf) {
        x = byteBuf.readDouble();
        y = byteBuf.readDouble();
    }
}
