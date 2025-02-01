package dev.redstudio.redcore.math.vectors;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/// Represents a two-dimensional vector with `x`,`y`, and `z` coordinates using `byte`.
///
/// All operations are directly performed on the vector.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
@NoArgsConstructor
@AllArgsConstructor
public class Vector3B implements Vector3<Vector3B> {

    public byte x;
    public byte y;
    public byte z;

    // region Assignment
    /*================================ Assignment ================================*/

    @Override
    public Vector3B copy(final Vector3B vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    @Override
    public Vector3B copy(final Vector3S vector) {
        x = (byte) vector.x;
        y = (byte) vector.y;
        z = (byte) vector.z;

        return this;
    }

    @Override
    public Vector3B copy(final Vector3I vector) {
        x = (byte) vector.x;
        y = (byte) vector.y;
        z = (byte) vector.z;

        return this;
    }

    @Override
    public Vector3B copy(final Vector3L vector) {
        x = (byte) vector.x;
        y = (byte) vector.y;
        z = (byte) vector.z;

        return this;
    }

    @Override
    public Vector3B copy(final Vector3F vector) {
        x = (byte) vector.x;
        y = (byte) vector.y;
        z = (byte) vector.z;

        return this;
    }

    @Override
    public Vector3B copy(final Vector3D vector) {
        x = (byte) vector.x;
        y = (byte) vector.y;
        z = (byte) vector.z;

        return this;
    }

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/


    @Override
    public Vector3B add(final Vector3B vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    @Override
    public Vector3B add(final Vector3S vector) {
        x += (byte) vector.x;
        y += (byte) vector.y;
        z += (byte) vector.z;

        return this;
    }

    @Override
    public Vector3B add(final Vector3I vector) {
        x += (byte) vector.x;
        y += (byte) vector.y;
        z += (byte) vector.z;

        return this;
    }

    @Override
    public Vector3B add(final Vector3L vector) {
        x += (byte) vector.x;
        y += (byte) vector.y;
        z += (byte) vector.z;

        return this;
    }

    @Override
    public Vector3B add(final Vector3F vector) {
        x += (byte) vector.x;
        y += (byte) vector.y;
        z += (byte) vector.z;

        return this;
    }

    @Override
    public Vector3B add(final Vector3D vector) {
        x += (byte) vector.x;
        y += (byte) vector.y;
        z += (byte) vector.z;

        return this;
    }

    //endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    @Override
    public Vector3B subtract(final Vector3B vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    @Override
    public Vector3B subtract(final Vector3S vector) {
        x -= (byte) vector.x;
        y -= (byte) vector.y;
        z -= (byte) vector.z;

        return this;
    }

    @Override
    public Vector3B subtract(final Vector3I vector) {
        x -= (byte) vector.x;
        y -= (byte) vector.y;
        z -= (byte) vector.z;

        return this;
    }

    @Override
    public Vector3B subtract(final Vector3L vector) {
        x -= (byte) vector.x;
        y -= (byte) vector.y;
        z -= (byte) vector.z;

        return this;
    }

    @Override
    public Vector3B subtract(final Vector3F vector) {
        x -= (byte) vector.x;
        y -= (byte) vector.y;
        z -= (byte) vector.z;

        return this;
    }

    @Override
    public Vector3B subtract(final Vector3D vector) {
        x -= (byte) vector.x;
        y -= (byte) vector.y;
        z -= (byte) vector.z;

        return this;
    }

    // endregion

    // region Multiplication
    /*================================ Multiplication ================================*/

    @Override
    public Vector3B multiply(final byte scalar) {
        x = (byte) (x * scalar);
        y = (byte) (y * scalar);
        z = (byte) (z * scalar);

        return this;
    }

    @Override
    public Vector3B multiply(final short scalar) {
        x = (byte) (x * scalar);
        y = (byte) (y * scalar);
        z = (byte) (z * scalar);

        return this;
    }

    @Override
    public Vector3B multiply(final int scalar) {
        x = (byte) (x * scalar);
        y = (byte) (y * scalar);
        z = (byte) (z * scalar);

        return this;
    }

    @Override
    public Vector3B multiply(final long scalar) {
        x = (byte) (x * scalar);
        y = (byte) (y * scalar);
        z = (byte) (z * scalar);

        return this;
    }

    @Override
    public Vector3B multiply(final float scalar) {
        x = (byte) (x * scalar);
        y = (byte) (y * scalar);
        z = (byte) (z * scalar);

        return this;
    }

    @Override
    public Vector3B multiply(final double scalar) {
        x = (byte) (x * scalar);
        y = (byte) (y * scalar);
        z = (byte) (z * scalar);

        return this;
    }

    // endregion

    // region Division
    /*================================ Division ================================*/

    @Override
    public Vector3B divide(final byte scalar) {
        x = (byte) (x / scalar);
        y = (byte) (y / scalar);
        z = (byte) (z / scalar);

        return this;
    }

    @Override
    public Vector3B divide(final short scalar) {
        x = (byte) (x / scalar);
        y = (byte) (y / scalar);
        z = (byte) (z / scalar);

        return this;
    }

    @Override
    public Vector3B divide(final int scalar) {
        x = (byte) (x / scalar);
        y = (byte) (y / scalar);
        z = (byte) (z / scalar);

        return this;
    }

    @Override
    public Vector3B divide(final long scalar) {
        x = (byte) (x / scalar);
        y = (byte) (y / scalar);
        z = (byte) (z / scalar);

        return this;
    }

    @Override
    public Vector3B divide(final float scalar) {
        x = (byte) (x / scalar);
        y = (byte) (y / scalar);
        z = (byte) (z / scalar);

        return this;
    }

    @Override
    public Vector3B divide(final double scalar) {
        x = (byte) (x / scalar);
        y = (byte) (y / scalar);
        z = (byte) (z / scalar);

        return this;
    }

    // endregion

    // endregion
}
