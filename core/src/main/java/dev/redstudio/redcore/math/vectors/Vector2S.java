package dev.redstudio.redcore.math.vectors;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/// Represents a two-dimensional vector with `x` and `y` coordinates using `short`.
///
/// All operations are directly performed on the vector.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
@NoArgsConstructor
@AllArgsConstructor
public class Vector2S implements Vector2<Vector2S> {

    public short x;
    public short y;

    // region Assignment
    /*================================ Assignment ================================*/

    @Override
    public Vector2S copy(final Vector2B vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2S copy(final Vector2S vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2S copy(final Vector2I vector) {
        x = (short) vector.x;
        y = (short) vector.y;

        return this;
    }

    @Override
    public Vector2S copy(final Vector2L vector) {
        x = (short) vector.x;
        y = (short) vector.y;

        return this;
    }

    @Override
    public Vector2S copy(final Vector2F vector) {
        x = (short) vector.x;
        y = (short) vector.y;

        return this;
    }

    @Override
    public Vector2S copy(final Vector2D vector) {
        x = (short) vector.x;
        y = (short) vector.y;

        return this;
    }

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/

    @Override
    public Vector2S add(final Vector2B vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2S add(final Vector2S vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2S add(final Vector2I vector) {
        x += (short) vector.x;
        y += (short) vector.y;

        return this;
    }

    @Override
    public Vector2S add(final Vector2L vector) {
        x += (short) vector.x;
        y += (short) vector.y;

        return this;
    }

    @Override
    public Vector2S add(final Vector2F vector) {
        x += (short) vector.x;
        y += (short) vector.y;

        return this;
    }

    @Override
    public Vector2S add(final Vector2D vector) {
        x += (short) vector.x;
        y += (short) vector.y;

        return this;
    }

    // endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    @Override
    public Vector2S subtract(final Vector2B vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2S subtract(final Vector2S vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2S subtract(final Vector2I vector) {
        x -= (short) vector.x;
        y -= (short) vector.y;

        return this;
    }

    @Override
    public Vector2S subtract(final Vector2L vector) {
        x -= (short) vector.x;
        y -= (short) vector.y;

        return this;
    }

    @Override
    public Vector2S subtract(final Vector2F vector) {
        x -= (short) vector.x;
        y -= (short) vector.y;

        return this;
    }

    @Override
    public Vector2S subtract(final Vector2D vector) {
        x -= (short) vector.x;
        y -= (short) vector.y;

        return this;
    }

    // endregion

    // region Multiplication
    /*================================ Multiplication ================================*/

    @Override
    public Vector2S multiply(final byte scalar) {
        x = (short) (x * scalar);
        y = (short) (y * scalar);

        return this;
    }

    @Override
    public Vector2S multiply(final short scalar) {
        x = (short) (x * scalar);
        y = (short) (y * scalar);

        return this;
    }

    @Override
    public Vector2S multiply(final int scalar) {
        x = (short) (x * scalar);
        y = (short) (y * scalar);

        return this;
    }

    @Override
    public Vector2S multiply(final long scalar) {
        x = (short) (x * scalar);
        y = (short) (y * scalar);

        return this;
    }

    @Override
    public Vector2S multiply(final float scalar) {
        x = (short) (x * scalar);
        y = (short) (y * scalar);

        return this;
    }

    @Override
    public Vector2S multiply(final double scalar) {
        x = (short) (x * scalar);
        y = (short) (y * scalar);

        return this;
    }

    // endregion

    // region Division
    /*================================ Division ================================*/

    @Override
    public Vector2S divide(final byte scalar) {
        x = (short) (x / scalar);
        y = (short) (y / scalar);

        return this;
    }

    @Override
    public Vector2S divide(final short scalar) {
        x = (short) (x / scalar);
        y = (short) (y / scalar);

        return this;
    }

    @Override
    public Vector2S divide(final int scalar) {
        x = (short) (x / scalar);
        y = (short) (y / scalar);

        return this;
    }

    @Override
    public Vector2S divide(final long scalar) {
        x = (short) (x / scalar);
        y = (short) (y / scalar);

        return this;
    }

    @Override
    public Vector2S divide(final float scalar) {
        x = (short) (x / scalar);
        y = (short) (y / scalar);

        return this;
    }

    @Override
    public Vector2S divide(final double scalar) {
        x = (short) (x / scalar);
        y = (short) (y / scalar);

        return this;
    }

    // endregion

    // endregion
}
