package dev.redstudio.redcore.math.vectors;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/// Represents a two-dimensional vector with `x`,`y`, and `z` coordinates using `int`.
///
/// All operations are directly performed on the vector.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
@NoArgsConstructor
@AllArgsConstructor
public class Vector3I implements Vector3<Vector3I> {

    public int x;
    public int y;
    public int z;

    // region Assignment
    /*================================ Assignment ================================*/

    @Override
    public Vector3I copy(final Vector3B vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    @Override
    public Vector3I copy(final Vector3S vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    @Override
    public Vector3I copy(final Vector3I vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    @Override
    public Vector3I copy(final Vector3L vector) {
        x = (int) vector.x;
        y = (int) vector.y;
        z = (int) vector.z;

        return this;
    }

    @Override
    public Vector3I copy(final Vector3F vector) {
        x = (int) vector.x;
        y = (int) vector.y;
        z = (int) vector.z;

        return this;
    }

    @Override
    public Vector3I copy(final Vector3D vector) {
        x = (int) vector.x;
        y = (int) vector.y;
        z = (int) vector.z;

        return this;
    }

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/


    @Override
    public Vector3I add(final Vector3B vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    @Override
    public Vector3I add(final Vector3S vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    @Override
    public Vector3I add(final Vector3I vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    @Override
    public Vector3I add(final Vector3L vector) {
        x += (int) vector.x;
        y += (int) vector.y;
        z += (int) vector.z;

        return this;
    }

    @Override
    public Vector3I add(final Vector3F vector) {
        x += (int) vector.x;
        y += (int) vector.y;
        z += (int) vector.z;

        return this;
    }

    @Override
    public Vector3I add(final Vector3D vector) {
        x += (int) vector.x;
        y += (int) vector.y;
        z += (int) vector.z;

        return this;
    }

    //endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    @Override
    public Vector3I subtract(final Vector3B vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    @Override
    public Vector3I subtract(final Vector3S vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    @Override
    public Vector3I subtract(final Vector3I vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    @Override
    public Vector3I subtract(final Vector3L vector) {
        x -= (int) vector.x;
        y -= (int) vector.y;
        z -= (int) vector.z;

        return this;
    }

    @Override
    public Vector3I subtract(final Vector3F vector) {
        x -= (int) vector.x;
        y -= (int) vector.y;
        z -= (int) vector.z;

        return this;
    }

    @Override
    public Vector3I subtract(final Vector3D vector) {
        x -= (int) vector.x;
        y -= (int) vector.y;
        z -= (int) vector.z;

        return this;
    }

    // endregion

    // region Multiplication
    /*================================ Multiplication ================================*/

    @Override
    public Vector3I multiply(final byte scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    @Override
    public Vector3I multiply(final short scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    @Override
    public Vector3I multiply(final int scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    @Override
    public Vector3I multiply(final long scalar) {
        x = (int) (x * scalar);
        y = (int) (y * scalar);
        z = (int) (z * scalar);

        return this;
    }

    @Override
    public Vector3I multiply(final float scalar) {
        x = (int) (x * scalar);
        y = (int) (y * scalar);
        z = (int) (z * scalar);

        return this;
    }

    @Override
    public Vector3I multiply(final double scalar) {
        x = (int) (x * scalar);
        y = (int) (y * scalar);
        z = (int) (z * scalar);

        return this;
    }

    // endregion

    // region Division
    /*================================ Division ================================*/

    @Override
    public Vector3I divide(final byte scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    @Override
    public Vector3I divide(final short scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    @Override
    public Vector3I divide(final int scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    @Override
    public Vector3I divide(final long scalar) {
        x = (int) (x / scalar);
        y = (int) (y / scalar);
        z = (int) (z / scalar);

        return this;
    }

    @Override
    public Vector3I divide(final float scalar) {
        x = (int) (x / scalar);
        y = (int) (y / scalar);
        z = (int) (z / scalar);

        return this;
    }

    @Override
    public Vector3I divide(final double scalar) {
        x = (int) (x / scalar);
        y = (int) (y / scalar);
        z = (int) (z / scalar);

        return this;
    }

    // endregion

    // endregion
}
