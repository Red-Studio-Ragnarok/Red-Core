package io.redstudioragnarok.redcore.vectors;

import io.netty.buffer.ByteBuf;

/**
 * Represents a two-dimensional vector with `x` and `y` coordinates using double.
 *
 * @author Desoroxxx
 * @since 0.2
 */
public class Vector2D {

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
     * Writes the x and y coordinates of this vector to the given `byteBuf`.
     *
     * @param byteBuf The ByteBuf to which the coordinates are written
     */
    public void write(ByteBuf byteBuf) {
        byteBuf.writeDouble(x);
        byteBuf.writeDouble(y);
    }

    /**
     * Reads the x and y coordinates from the given `byteBuf` and assigns them to the coordinate of this vector.
     *
     * @param byteBuf The ByteBuf from which the coordinates are read
     */
    public void read(ByteBuf byteBuf) {
        x = byteBuf.readDouble();
        y = byteBuf.readDouble();
    }
}
