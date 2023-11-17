package dev.redstudio.redcore.math.vectors;

import dev.redstudio.redcore.annotations.Experimental;

@Experimental
@SuppressWarnings("unused")
public class Vector3D {

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

    /*================================ Addition ================================*/

    public Vector3D add(final Vector3D vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;

        return this;
    }

    /*================================ Subtraction ================================*/

    public Vector3D subtract(final Vector3D vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;

        return this;
    }

    /*================================ Multiplication ================================*/

    public Vector3D multiply(final byte scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    public Vector3D multiply(final short scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    public Vector3D multiply(final int scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    public Vector3D multiply(final long scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    public Vector3D multiply(final float scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    public Vector3D multiply(final double scalar) {
        x = (x * scalar);
        y = (y * scalar);
        z = (z * scalar);

        return this;
    }

    /*================================ Division ================================*/

    public Vector3D divide(final byte scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    public Vector3D divide(final short scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    public Vector3D divide(final int scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    public Vector3D divide(final long scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    public Vector3D divide(final float scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }

    public Vector3D divide(final double scalar) {
        x = (x / scalar);
        y = (y / scalar);
        z = (z / scalar);

        return this;
    }
}
