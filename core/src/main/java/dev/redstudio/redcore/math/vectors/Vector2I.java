package dev.redstudio.redcore.math.vectors;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/// Represents a two-dimensional vector with `x` and `y` coordinates using `int`.
///
/// All operations are directly performed on the vector.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
@NoArgsConstructor
@AllArgsConstructor
public class Vector2I implements Vector2<Vector2I> {

    public int x;
    public int y;

    // region Assignment
    /*================================ Assignment ================================*/

    @Override
    public Vector2I copy(final Vector2B vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2I copy(final Vector2S vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2I copy(final Vector2I vector) {
        x = vector.x;
        y = vector.y;

        return this;
    }

    @Override
    public Vector2I copy(final Vector2L vector) {
        x = (int) vector.x;
        y = (int) vector.y;

        return this;
    }

    @Override
    public Vector2I copy(final Vector2F vector) {
        x = (int) vector.x;
        y = (int) vector.y;

        return this;
    }

    @Override
    public Vector2I copy(final Vector2D vector) {
        x = (int) vector.x;
        y = (int) vector.y;

        return this;
    }

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/

    @Override
    public Vector2I add(final Vector2B vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2I add(final Vector2S vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2I add(final Vector2I vector) {
        x += vector.x;
        y += vector.y;

        return this;
    }

    @Override
    public Vector2I add(final Vector2L vector) {
        x += (int) vector.x;
        y += (int) vector.y;

        return this;
    }

    @Override
    public Vector2I add(final Vector2F vector) {
        x += (int) vector.x;
        y += (int) vector.y;

        return this;
    }

    @Override
    public Vector2I add(final Vector2D vector) {
        x += (int) vector.x;
        y += (int) vector.y;

        return this;
    }

    // endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    @Override
    public Vector2I subtract(final Vector2B vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2I subtract(final Vector2S vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2I subtract(final Vector2I vector) {
        x -= vector.x;
        y -= vector.y;

        return this;
    }

    @Override
    public Vector2I subtract(final Vector2L vector) {
        x -= (int) vector.x;
        y -= (int) vector.y;

        return this;
    }

    @Override
    public Vector2I subtract(final Vector2F vector) {
        x -= (int) vector.x;
        y -= (int) vector.y;

        return this;
    }

    @Override
    public Vector2I subtract(final Vector2D vector) {
        x -= (int) vector.x;
        y -= (int) vector.y;

        return this;
    }

    // endregion

    // region Multiplication
    /*================================ Multiplication ================================*/

    @Override
    public Vector2I multiply(final byte scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2I multiply(final short scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2I multiply(final int scalar) {
        x = (x * scalar);
        y = (y * scalar);

        return this;
    }

    @Override
    public Vector2I multiply(final long scalar) {
        x = (int) (x * scalar);
        y = (int) (y * scalar);

        return this;
    }

    @Override
    public Vector2I multiply(final float scalar) {
        x = (int) (x * scalar);
        y = (int) (y * scalar);

        return this;
    }

    @Override
    public Vector2I multiply(final double scalar) {
        x = (int) (x * scalar);
        y = (int) (y * scalar);

        return this;
    }

    // endregion

    // region Division
    /*================================ Division ================================*/

    @Override
    public Vector2I divide(final byte scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2I divide(final short scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2I divide(final int scalar) {
        x = (x / scalar);
        y = (y / scalar);

        return this;
    }

    @Override
    public Vector2I divide(final long scalar) {
        x = (int) (x / scalar);
        y = (int) (y / scalar);

        return this;
    }

    @Override
    public Vector2I divide(final float scalar) {
        x = (int) (x / scalar);
        y = (int) (y / scalar);

        return this;
    }

    @Override
    public Vector2I divide(final double scalar) {
        x = (int) (x / scalar);
        y = (int) (y / scalar);

        return this;
    }

    // endregion

    // endregion
}
