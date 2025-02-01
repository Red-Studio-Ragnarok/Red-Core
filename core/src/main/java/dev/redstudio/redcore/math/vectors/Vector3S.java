package dev.redstudio.redcore.math.vectors;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/// Represents a two-dimensional vector with `x`,`y`, and `z` coordinates using `short`.
///
/// All operations are directly performed on the vector.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
@NoArgsConstructor
@AllArgsConstructor
public class Vector3S implements Vector3<Vector3S> {

    public short x;
    public short y;
    public short z;

    // region Assignment
    /*================================ Assignment ================================*/

    @Override
    public Vector3S copy(final Vector3B vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    @Override
    public Vector3S copy(final Vector3S vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    @Override
    public Vector3S copy(final Vector3I vector) {
        x = (short) vector.x;
        y = (short) vector.y;
        z = (short) vector.z;

        return this;
    }

    @Override
    public Vector3S copy(final Vector3L vector) {
        x = (short) vector.x;
        y = (short) vector.y;
        z = (short) vector.z;

        return this;
    }

    @Override
    public Vector3S copy(final Vector3F vector) {
        x = (short) vector.x;
        y = (short) vector.y;
        z = (short) vector.z;

        return this;
    }

    @Override
    public Vector3S copy(final Vector3D vector) {
        x = (short) vector.x;
        y = (short) vector.y;
        z = (short) vector.z;

        return this;
    }

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/


    @Override
    public Vector3S add(final Vector3B vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    @Override
    public Vector3S add(final Vector3S vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    @Override
    public Vector3S add(final Vector3I vector) {
        x += (short) vector.x;
        y += (short) vector.y;
        z += (short) vector.z;

        return this;
    }

    @Override
    public Vector3S add(final Vector3L vector) {
        x += (short) vector.x;
        y += (short) vector.y;
        z += (short) vector.z;

        return this;
    }

    @Override
    public Vector3S add(final Vector3F vector) {
        x += (short) vector.x;
        y += (short) vector.y;
        z += (short) vector.z;

        return this;
    }

    @Override
    public Vector3S add(final Vector3D vector) {
        x += (short) vector.x;
        y += (short) vector.y;
        z += (short) vector.z;

        return this;
    }

    //endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    @Override
    public Vector3S subtract(final Vector3B vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    @Override
    public Vector3S subtract(final Vector3S vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    @Override
    public Vector3S subtract(final Vector3I vector) {
        x -= (short) vector.x;
        y -= (short) vector.y;
        z -= (short) vector.z;

        return this;
    }

    @Override
    public Vector3S subtract(final Vector3L vector) {
        x -= (short) vector.x;
        y -= (short) vector.y;
        z -= (short) vector.z;

        return this;
    }

    @Override
    public Vector3S subtract(final Vector3F vector) {
        x -= (short) vector.x;
        y -= (short) vector.y;
        z -= (short) vector.z;

        return this;
    }

    @Override
    public Vector3S subtract(final Vector3D vector) {
        x -= (short) vector.x;
        y -= (short) vector.y;
        z -= (short) vector.z;

        return this;
    }

    // endregion

    // region Multiplication
    /*================================ Multiplication ================================*/

    @Override
    public Vector3S multiply(final byte scalar) {
        x = (short) (x * scalar);
        y = (short) (y * scalar);
        z = (short) (z * scalar);

        return this;
    }

    @Override
    public Vector3S multiply(final short scalar) {
        x = (short) (x * scalar);
        y = (short) (y * scalar);
        z = (short) (z * scalar);

        return this;
    }

    @Override
    public Vector3S multiply(final int scalar) {
        x = (short) (x * scalar);
        y = (short) (y * scalar);
        z = (short) (z * scalar);

        return this;
    }

    @Override
    public Vector3S multiply(final long scalar) {
        x = (short) (x * scalar);
        y = (short) (y * scalar);
        z = (short) (z * scalar);

        return this;
    }

    @Override
    public Vector3S multiply(final float scalar) {
        x = (short) (x * scalar);
        y = (short) (y * scalar);
        z = (short) (z * scalar);

        return this;
    }

    @Override
    public Vector3S multiply(final double scalar) {
        x = (short) (x * scalar);
        y = (short) (y * scalar);
        z = (short) (z * scalar);

        return this;
    }

    // endregion

    // region Division
    /*================================ Division ================================*/

    @Override
    public Vector3S divide(final byte scalar) {
        x = (short) (x / scalar);
        y = (short) (y / scalar);
        z = (short) (z / scalar);

        return this;
    }

    @Override
    public Vector3S divide(final short scalar) {
        x = (short) (x / scalar);
        y = (short) (y / scalar);
        z = (short) (z / scalar);

        return this;
    }

    @Override
    public Vector3S divide(final int scalar) {
        x = (short) (x / scalar);
        y = (short) (y / scalar);
        z = (short) (z / scalar);

        return this;
    }

    @Override
    public Vector3S divide(final long scalar) {
        x = (short) (x / scalar);
        y = (short) (y / scalar);
        z = (short) (z / scalar);

        return this;
    }

    @Override
    public Vector3S divide(final float scalar) {
        x = (short) (x / scalar);
        y = (short) (y / scalar);
        z = (short) (z / scalar);

        return this;
    }

    @Override
    public Vector3S divide(final double scalar) {
        x = (short) (x / scalar);
        y = (short) (y / scalar);
        z = (short) (z / scalar);

        return this;
    }

    // endregion

    // endregion
}
