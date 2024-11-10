package dev.redstudio.redcore.math.vectors;

import dev.redstudio.redcore.annotations.Experimental;

@Experimental
@SuppressWarnings("unused")
public class Vector2D implements VectorVector2Operations<Vector2D> {

    public double x;
    public double y;

    public Vector2D() {
        // No need to do anything
    }

    public Vector2D(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    // region Assignment
    /*================================ Assignment ================================*/

    @Override
    public Vector2D copy(final Vector2F vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2D copy(final Vector2D vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/

    @Override
    public Vector2D add(final Vector2F vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2D add(final Vector2D vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    // endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    @Override
    public Vector2D subtract(final Vector2F vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2D subtract(final Vector2D vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    // endregion

    // region Multiplication
    /*================================ Multiplication ================================*/

    @Override
    public Vector2D multiply(final byte scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2D multiply(final short scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2D multiply(final int scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2D multiply(final long scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2D multiply(final float scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2D multiply(final double scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    // endregion

    // region Division
    /*================================ Division ================================*/

    @Override
    public Vector2D divide(final byte scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2D divide(final short scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2D divide(final int scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2D divide(final long scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2D divide(final float scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2D divide(final double scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    // endregion

    // endregion
}
