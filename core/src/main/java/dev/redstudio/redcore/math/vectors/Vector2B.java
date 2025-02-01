package dev.redstudio.redcore.math.vectors;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/// Represents a two-dimensional vector with `x` and `y` coordinates using `byte`.
///
/// All operations are directly performed on the vector.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
@NoArgsConstructor
@AllArgsConstructor
public class Vector2B implements Vector2<Vector2B> {

    public byte x;
    public byte y;

    // region Assignment
    /*================================ Assignment ================================*/

    @Override
    public Vector2B copy(final Vector2B vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2B copy(final Vector2S vector) {
        x = (byte) vector.x;
        y = (byte) vector.y;

        return this;
    }

    @Override
    public Vector2B copy(final Vector2I vector) {
        x = (byte) vector.x;
        y = (byte) vector.y;

        return this;
    }

    @Override
    public Vector2B copy(final Vector2L vector) {
        x = (byte) vector.x;
        y = (byte) vector.y;

        return this;
    }

    @Override
    public Vector2B copy(final Vector2F vector) {
        x = (byte) vector.x;
        y = (byte) vector.y;

        return this;
    }

    @Override
    public Vector2B copy(final Vector2D vector) {
        x = (byte) vector.x;
        y = (byte) vector.y;

        return this;
    }

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/

    @Override
    public Vector2B add(final Vector2B vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2B add(final Vector2S vector) {
        x += (byte) vector.x;
        y += (byte) vector.y;

        return this;
    }

    @Override
    public Vector2B add(final Vector2I vector) {
        x += (byte) vector.x;
        y += (byte) vector.y;

        return this;
    }

    @Override
    public Vector2B add(final Vector2L vector) {
        x += (byte) vector.x;
        y += (byte) vector.y;

        return this;
    }

    @Override
    public Vector2B add(final Vector2F vector) {
        x += (byte) vector.x;
        y += (byte) vector.y;

        return this;
    }

    @Override
    public Vector2B add(final Vector2D vector) {
        x += (byte) vector.x;
        y += (byte) vector.y;

        return this;
    }

    // endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    @Override
    public Vector2B subtract(final Vector2B vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2B subtract(final Vector2S vector) {
        x -= (byte) vector.x;
        y -= (byte) vector.y;

        return this;
    }

    @Override
    public Vector2B subtract(final Vector2I vector) {
        x -= (byte) vector.x;
        y -= (byte) vector.y;

        return this;
    }

    @Override
    public Vector2B subtract(final Vector2L vector) {
        x -= (byte) vector.x;
        y -= (byte) vector.y;

        return this;
    }

    @Override
    public Vector2B subtract(final Vector2F vector) {
        x -= (byte) vector.x;
        y -= (byte) vector.y;

        return this;
    }

    @Override
    public Vector2B subtract(final Vector2D vector) {
        x -= (byte) vector.x;
        y -= (byte) vector.y;

        return this;
    }

    // endregion

    // region Multiplication
    /*================================ Multiplication ================================*/

    @Override
    public Vector2B multiply(final byte scalar) {
        x = (byte) (x * scalar);
        y = (byte) (y * scalar);

        return this;
    }

    @Override
    public Vector2B multiply(final short scalar) {
        x = (byte) (x * scalar);
        y = (byte) (y * scalar);

        return this;
    }

    @Override
    public Vector2B multiply(final int scalar) {
        x = (byte) (x * scalar);
        y = (byte) (y * scalar);

        return this;
    }

    @Override
    public Vector2B multiply(final long scalar) {
        x = (byte) (x * scalar);
        y = (byte) (y * scalar);

        return this;
    }

    @Override
    public Vector2B multiply(final float scalar) {
        x = (byte) (x * scalar);
        y = (byte) (y * scalar);

        return this;
    }

    @Override
    public Vector2B multiply(final double scalar) {
        x = (byte) (x * scalar);
        y = (byte) (y * scalar);

        return this;
    }

    // endregion

    // region Division
    /*================================ Division ================================*/

    @Override
    public Vector2B divide(final byte scalar) {
        x = (byte) (x / scalar);
        y = (byte) (y / scalar);

        return this;
    }

    @Override
    public Vector2B divide(final short scalar) {
        x = (byte) (x / scalar);
        y = (byte) (y / scalar);

        return this;
    }

    @Override
    public Vector2B divide(final int scalar) {
        x = (byte) (x / scalar);
        y = (byte) (y / scalar);

        return this;
    }

    @Override
    public Vector2B divide(final long scalar) {
        x = (byte) (x / scalar);
        y = (byte) (y / scalar);

        return this;
    }

    @Override
    public Vector2B divide(final float scalar) {
        x = (byte) (x / scalar);
        y = (byte) (y / scalar);

        return this;
    }

    @Override
    public Vector2B divide(final double scalar) {
        x = (byte) (x / scalar);
        y = (byte) (y / scalar);

        return this;
    }

    // endregion

    // endregion
}
