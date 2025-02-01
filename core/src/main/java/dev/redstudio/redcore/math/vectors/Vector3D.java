package dev.redstudio.redcore.math.vectors;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/// Represents a two-dimensional vector with `x`,`y`, and `z` coordinates using `double`.
///
/// All operations are directly performed on the vector.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
@NoArgsConstructor
@AllArgsConstructor
public class Vector3D implements Vector3<Vector3D> {

    public double x;
    public double y;
    public double z;

    // region Assignment
    /*================================ Assignment ================================*/

    @Override
    public Vector3D copy(final Vector3B vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    @Override
    public Vector3D copy(final Vector3S vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    @Override
    public Vector3D copy(final Vector3I vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    @Override
    public Vector3D copy(final Vector3L vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    @Override
    public Vector3D copy(final Vector3F vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    @Override
    public Vector3D copy(final Vector3D vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/


    @Override
    public Vector3D add(final Vector3B vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    @Override
    public Vector3D add(final Vector3S vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    @Override
    public Vector3D add(final Vector3I vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    @Override
    public Vector3D add(final Vector3L vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    @Override
    public Vector3D add(final Vector3F vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    @Override
    public Vector3D add(final Vector3D vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    //endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    @Override
    public Vector3D subtract(final Vector3B vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    @Override
    public Vector3D subtract(final Vector3S vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    @Override
    public Vector3D subtract(final Vector3I vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    @Override
    public Vector3D subtract(final Vector3L vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    @Override
    public Vector3D subtract(final Vector3F vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    @Override
    public Vector3D subtract(final Vector3D vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    // endregion

    // region Multiplication
    /*================================ Multiplication ================================*/

    @Override
    public Vector3D multiply(final byte scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    @Override
    public Vector3D multiply(final short scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    @Override
    public Vector3D multiply(final int scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    @Override
    public Vector3D multiply(final long scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    @Override
    public Vector3D multiply(final float scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    @Override
    public Vector3D multiply(final double scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    // endregion

    // region Division
    /*================================ Division ================================*/

    @Override
    public Vector3D divide(final byte scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    @Override
    public Vector3D divide(final short scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    @Override
    public Vector3D divide(final int scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    @Override
    public Vector3D divide(final long scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    @Override
    public Vector3D divide(final float scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    @Override
    public Vector3D divide(final double scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    // endregion

    // endregion
}
