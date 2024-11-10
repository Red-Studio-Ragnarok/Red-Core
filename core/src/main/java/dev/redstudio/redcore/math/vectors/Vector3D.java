package dev.redstudio.redcore.math.vectors;

import dev.redstudio.redcore.annotations.Experimental;

@Experimental
@SuppressWarnings("unused")
public class Vector3D implements VectorVector3Operations<Vector3D> {

    public double x;
    public double y;
    public double z;

    public Vector3D() {
        // No need to do anything
    }

    public Vector3D(final double x, final double y, final double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public Vector3D copy(final Vector3D vector) {
        x = vector.x;
        y = vector.y;
        z = vector.z;

        return this;
    }

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/

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
