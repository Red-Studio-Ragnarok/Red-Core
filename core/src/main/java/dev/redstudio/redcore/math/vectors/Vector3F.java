package dev.redstudio.redcore.math.vectors;

import dev.redstudio.redcore.annotations.Experimental;

@Experimental
@SuppressWarnings("unused")
public class Vector3F implements VectorVector3Operations<Vector3F> {

    public float x;
    public float y;
    public float z;

    public Vector3F() {
        // No need to do anything
    }

    public Vector3F(final float x, final float y, final float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // region Assignment
    /*================================ Assignment ================================*/

    @Override
    public Vector3F copy(final Vector3F vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    @Override
    public Vector3F copy(final Vector3D vector) {
        x = (float) vector.x;
        y = (float) vector.y;
        z = (float) vector.z;

        return this;
    }

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/

    @Override
    public Vector3F add(final Vector3F vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    @Override
    public Vector3F add(final Vector3D vector) {
        x += (float) vector.x;
        y += (float) vector.y;
        z += (float) vector.z;

        return this;
    }

    //endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    @Override
    public Vector3F subtract(final Vector3F vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    @Override
    public Vector3F subtract(final Vector3D vector) {
        x -= (float) vector.x;
        y -= (float) vector.y;
        z -= (float) vector.z;

        return this;
    }

    // endregion

    // region Multiplication
    /*================================ Multiplication ================================*/

    @Override
    public Vector3F multiply(final byte scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    @Override
    public Vector3F multiply(final short scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    @Override
    public Vector3F multiply(final int scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    @Override
    public Vector3F multiply(final long scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    @Override
    public Vector3F multiply(final float scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    @Override
    public Vector3F multiply(final double scalar) {
        x = (x * (float) scalar);
        y = (y * (float) scalar);
        z = (z * (float) scalar);

        return this;
    }

    // endregion

    // region Division
    /*================================ Division ================================*/

    @Override
    public Vector3F divide(final byte scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    @Override
    public Vector3F divide(final short scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    @Override
    public Vector3F divide(final int scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    @Override
    public Vector3F divide(final long scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    @Override
    public Vector3F divide(final float scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    @Override
    public Vector3F divide(final double scalar) {
        x = (x / (float) scalar);
        y = (y / (float) scalar);
        z = (z / (float) scalar);

        return this;
    }

    // endregion

    // endregion
}
