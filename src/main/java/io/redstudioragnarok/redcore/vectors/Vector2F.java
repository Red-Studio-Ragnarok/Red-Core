package io.redstudioragnarok.redcore.vectors;

import io.netty.buffer.ByteBuf;

/**
 * Represents a two-dimensional vector with `x` and `y` coordinates using float.
 *
 * @author Desoroxxx
 * @since 0.2
 */
public class Vector2F {

    /** The x component of this vector. */
    public float x;
    /** The y component of this vector. */
    public float y;

    /**
     * Constructs a new "empty" vector.
     */
    public Vector2F() {
    }

    /**
     * Constructs a new vector with the given x and y coordinates.
     *
     * @param inputX The X coordinate
     * @param inputY The Y coordinate
     */
    public Vector2F(final float inputX, final float inputY) {
        x = inputX;
        y = inputY;
    }

    /**
     * Writes the x and y coordinates of this vector to the given `byteBuf`.
     *
     * @param byteBuf The ByteBuf to which the coordinates are written
     */
    public void write(ByteBuf byteBuf) {
        byteBuf.writeFloat(x);
        byteBuf.writeFloat(y);
    }

    /**
     * Reads the x and y coordinates from the given `byteBuf` and assigns them to the coordinate of this vector.
     *
     * @param byteBuf The ByteBuf from which the coordinates are read
     */
    public void read(ByteBuf byteBuf) {
        x = byteBuf.readFloat();
        y = byteBuf.readFloat();
    }
}
