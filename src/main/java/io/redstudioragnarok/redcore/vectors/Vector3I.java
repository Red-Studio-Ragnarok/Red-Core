package io.redstudioragnarok.redcore.vectors;

import io.netty.buffer.ByteBuf;
import net.jafama.FastMath;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

/**
 * Represents a three-dimensional vector with `x`, `y`, and `z` coordinates using int.
 * <p>
 * All operations are directly performed on the vector.
 *
 * @author Desoroxxx
 * @since 0.4
 */
public final class Vector3I {

    /** The X coordinate */
    public int x;
    /** The Y coordinate */
    public int y;
    /** The Z coordinate */
    public int z;

    /**
     * Constructs a new "empty" vector.
     */
    public Vector3I() {
    }

    /**
     * Constructs a new vector with the given `x`, `y`, and `z` coordinates.
     *
     * @param inputX The X coordinate
     * @param inputY The Y coordinate
     * @param inputZ The Z coordinate
     */
    public Vector3I(final int inputX, final int inputY, final int inputZ) {
        x = inputX;
        y = inputY;
        z = inputZ;
    }

    /**
     * Constructs a new vector with the same coordinates as the given `input` Vector3D.
     *
     * @param input The Vector3D to copy the coordinates from
     */
    public Vector3I(final Vector3D input) {
        x = (int) input.x;
        y = (int) input.y;
        z = (int) input.z;
    }

    /**
     * Constructs a new vector with the same coordinates as the given `input` Vector3F.
     *
     * @param input The Vector3F to copy the coordinates from
     */
    public Vector3I(final Vector3F input) {
        x = (int) input.x;
        y = (int) input.y;
        z = (int) input.z;
    }

    /**
     * Constructs a new vector with the same coordinates as the given `input` Vec3d.
     *
     * @param input The Vec3d to copy the coordinates from
     */
    public Vector3I(final Vec3i input) {
        x = input.getX();
        y = input.getY();
        z = input.getZ();
    }

    /**
     * Create a Vec3d copy of this vector.
     *
     * @return The Vec3d copy of this vector
     */
    public Vec3d toVec3d() {
        return new Vec3d(x, y, z);
    }

    /**
     * Sets all coordinates of this vector to zero.
     */
    public void zero() {
        x = y = z = 0;
    }

    /**
     * Copies the coordinates of the given vector to this vector.
     *
     * @param inputVector The vector to copy from
     */
    public void copy(final Vector3I inputVector) {
        x = inputVector.x;
        y = inputVector.y;
        z = inputVector.z;
    }

    /**
     * Copies the coordinates of the given vector to this vector.
     *
     * @param inputVector The vector to copy from
     */
    public void copy(final Vector3D inputVector) {
        x = (int) inputVector.x;
        y = (int) inputVector.y;
        z = (int) inputVector.z;
    }

    /**
     * Copies the coordinates of the given vector to this vector.
     *
     * @param inputVector The vector to copy from
     */
    public void copy(final Vector3F inputVector) {
        x = (int) inputVector.x;
        y = (int) inputVector.y;
        z = (int) inputVector.z;
    }

    /**
     * Sets the coordinates of this vector to the given `x`, `y`, and `z` values.
     *
     * @param inputX The X coordinate
     * @param inputY The Y coordinate
     * @param inputZ The Z coordinate
     */
    public void set(final int inputX, final int inputY, final int inputZ) {
        x = inputX;
        y = inputY;
        z = inputZ;
    }

    /**
     * Adds the given vector to this vector.
     *
     * @param inputVector The vector to add
     */
    public void add(final Vector3D inputVector) {
        x += (int) inputVector.x;
        y += (int) inputVector.y;
        z += (int) inputVector.z;
    }

    /**
     * Adds the given vector to this vector.
     *
     * @param inputVector The vector to add
     */
    public void add(final Vector3F inputVector) {
        x += (int) inputVector.x;
        y += (int) inputVector.y;
        z += (int) inputVector.z;
    }

    /**
     * Scales the coordinates of this vector by the given multiplier.
     *
     * @param multiplier The value to multiply the coordinates by
     */
    public void scale(final int multiplier) {
        x *= multiplier;
        y *= multiplier;
        z *= multiplier;
    }

    /**
     * Performs a linear interpolation between two vectors.
     *
     * @param input The starting vector.
     * @param partialTicks The fraction of the tick that has passed.
     * @param target The target vector.
     */
    public void lerp(final Vector3I input, final float partialTicks, final Vector3I target) {
        x = (int) (input.x + (target.x - input.x) * partialTicks);
        y = (int) (input.y + (target.y - input.y) * partialTicks);
        z = (int) (input.z + (target.z - input.z) * partialTicks);
    }

    /**
     * Computes the Euclidean distance from this target to the provided `target`.
     *
     * @param target A vector to which the distance is calculated
     * @return The distance between this target and `target`
     */
    public int distanceTo(final Vector3I target) {
        final int xDelta = target.x - x;
        final int yDelta = target.y - y;
        final int zDelta = target.z - z;

        return (int) FastMath.sqrt(xDelta * xDelta + yDelta * yDelta + zDelta * zDelta);
    }

    /**
     * Computes the Euclidean distance from this target to the provided `target`.
     *
     * @param target A vector to which the distance is calculated
     * @return The distance between this target and `target`
     */
    public int distanceTo(final Vector3D target) {
        final int xDelta = (int) (target.x - x);
        final int yDelta = (int) (target.y - y);
        final int zDelta = (int) (target.z - z);

        return (int) FastMath.sqrt(xDelta * xDelta + yDelta * yDelta + zDelta * zDelta);
    }

    /**
     * Computes the Euclidean distance from this target to the provided `target`.
     *
     * @param target A vector to which the distance is calculated
     * @return The distance between this target and `target`
     */
    public int distanceTo(final Vector3F target) {
        final int xDelta = (int) (target.x - x);
        final int yDelta = (int) (target.y - y);
        final int zDelta = (int) (target.z - z);

        return (int) FastMath.sqrt(xDelta * xDelta + yDelta * yDelta + zDelta * zDelta);
    }

    /**
     * Writes the x, y, and z coordinates of this vector to the given `byteBuf`.
     *
     * @param byteBuf The ByteBuf to which the coordinates are written
     */
    public void write(final ByteBuf byteBuf) {
        byteBuf.writeInt(x);
        byteBuf.writeInt(y);
        byteBuf.writeInt(z);
    }

    /**
     * Reads the x, y, and z coordinates from the given `byteBuf` and assigns them to the coordinate of this vector.
     *
     * @param byteBuf The ByteBuf from which the coordinates are read
     */
    public void read(final ByteBuf byteBuf) {
        x = byteBuf.readInt();
        y = byteBuf.readInt();
        z = byteBuf.readInt();
    }
}
