package dev.redstudio.redcore.math.vectors;

import dev.redstudio.redcore.annotations.Experimental;

@Experimental
@SuppressWarnings("unused")
public class Vector2D {

    public double x;
    public double y;

    public Vector2D() {
        // No need to do anything
    }

    public Vector2D(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    /*================================ Addition ================================*/

    public Vector2D add(final Vector2D vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    /*================================ Subtraction ================================*/

    public Vector2D subtract(final Vector2D vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    /*================================ Multiplication ================================*/

    public Vector2D multiply(final byte scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    public Vector2D multiply(final short scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    public Vector2D multiply(final int scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    public Vector2D multiply(final long scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    public Vector2D multiply(final float scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    public Vector2D multiply(final double scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    /*================================ Division ================================*/

    public Vector2D divide(final byte scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    public Vector2D divide(final short scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    public Vector2D divide(final int scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    public Vector2D divide(final long scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    public Vector2D divide(final float scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    public Vector2D divide(final double scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }
}
