package io.redstudioragnarok.redcore.vectors;

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
}
