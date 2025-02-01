package dev.redstudio.redcore.math.vectors;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/// Represents a two-dimensional vector with `x` and `y` coordinates using `long`.
///
/// All operations are directly performed on the vector.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
@NoArgsConstructor
@AllArgsConstructor
public class Vector2L implements Vector2<Vector2L> {

    public long x;
    public long y;

    // region Assignment
    /*================================ Assignment ================================*/

    @Override
    public Vector2L copy(final Vector2B vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2L copy(final Vector2S vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2L copy(final Vector2I vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2L copy(final Vector2L vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2L copy(final Vector2F vector) {
        x = (long) vector.x;
        y = (long) vector.y;

        return this;
    }

    @Override
    public Vector2L copy(final Vector2D vector) {
        x = (long) vector.x;
        y = (long) vector.y;

        return this;
    }

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/

    @Override
    public Vector2L add(final Vector2B vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2L add(final Vector2S vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2L add(final Vector2I vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2L add(final Vector2L vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2L add(final Vector2F vector) {
        x += (long) vector.x;
        y += (long) vector.y;

        return this;
    }

    @Override
    public Vector2L add(final Vector2D vector) {
        x += (long) vector.x;
        y += (long) vector.y;

        return this;
    }

    // endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    @Override
    public Vector2L subtract(final Vector2B vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2L subtract(final Vector2S vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2L subtract(final Vector2I vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2L subtract(final Vector2L vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2L subtract(final Vector2F vector) {
        x -= (long) vector.x;
        y -= (long) vector.y;

        return this;
    }

    @Override
    public Vector2L subtract(final Vector2D vector) {
        x -= (long) vector.x;
        y -= (long) vector.y;

        return this;
    }

    // endregion

    // region Multiplication
    /*================================ Multiplication ================================*/

    @Override
    public Vector2L multiply(final byte scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2L multiply(final short scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2L multiply(final int scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2L multiply(final long scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2L multiply(final float scalar) {
        x = (long) (x * scalar);
        y = (long) (y * scalar);

        return this;
    }

    @Override
    public Vector2L multiply(final double scalar) {
        x = (long) (x * scalar);
        y = (long) (y * scalar);

        return this;
    }

    // endregion

    // region Division
    /*================================ Division ================================*/

    @Override
    public Vector2L divide(final byte scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2L divide(final short scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2L divide(final int scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2L divide(final long scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2L divide(final float scalar) {
        x = (long) (x / scalar);
        y = (long) (y / scalar);

        return this;
    }

    @Override
    public Vector2L divide(final double scalar) {
        x = (long) (x / scalar);
        y = (long) (y / scalar);

        return this;
    }

    // endregion

    // endregion
}
