package dev.redstudio.redcore.math.vectors;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/// Represents a two-dimensional vector with `x` and `y` coordinates using `float`.
///
/// All operations are directly performed on the vector.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
@NoArgsConstructor
@AllArgsConstructor
public class Vector2F implements Vector2<Vector2F> {

    public float x;
    public float y;

    // region Assignment
    /*================================ Assignment ================================*/

    @Override
    public Vector2F copy(final Vector2B vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2F copy(final Vector2S vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2F copy(final Vector2I vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2F copy(final Vector2L vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2F copy(final Vector2F vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2F copy(final Vector2D vector) {
        x = (float) vector.x;
        y = (float) vector.y;

        return this;
    }

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/

    @Override
    public Vector2F add(final Vector2B vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2F add(final Vector2S vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2F add(final Vector2I vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2F add(final Vector2L vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2F add(final Vector2F vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2F add(final Vector2D vector) {
        x += (float) vector.x;
        y += (float) vector.y;

        return this;
    }

    // endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    @Override
    public Vector2F subtract(final Vector2B vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2F subtract(final Vector2S vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2F subtract(final Vector2I vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2F subtract(final Vector2L vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2F subtract(final Vector2F vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2F subtract(final Vector2D vector) {
        x -= (float) vector.x;
        y -= (float) vector.y;

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
        x = (float) (x * scalar);
        y = (float) (y * scalar);

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
        x = (float) (x / scalar);
        y = (float) (y / scalar);

        return this;
    }

    // endregion

    // endregion
}
