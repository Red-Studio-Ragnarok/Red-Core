package dev.redstudio.redcore.math.vectors;

import dev.redstudio.redcore.annotations.Experimental;

@Experimental
@SuppressWarnings("unused")
public class Vector2F implements VectorVector2Operations<Vector2F> {

    public double x;
    public double y;

    public Vector2F() {
        // No need to do anything
    }

    public Vector2F(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    // region Assignment
    /*================================ Assignment ================================*/

    @Override
    public Vector2F copy(final Vector2F vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2F copy(final Vector2D vector) {
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
    public Vector2F add(final Vector2F vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2F add(final Vector2D vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    // endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    @Override
    public Vector2F subtract(final Vector2F vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2F subtract(final Vector2D vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    // endregion

    // region Multiplication
    /*================================ Multiplication ================================*/

    @Override
    public Vector2F multiply(final byte scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2F multiply(final short scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2F multiply(final int scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2F multiply(final long scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2F multiply(final float scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2F multiply(final double scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    // endregion

    // region Division
    /*================================ Division ================================*/

    @Override
    public Vector2F divide(final byte scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2F divide(final short scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2F divide(final int scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2F divide(final long scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2F divide(final float scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2F divide(final double scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    // endregion

    // endregion
}
