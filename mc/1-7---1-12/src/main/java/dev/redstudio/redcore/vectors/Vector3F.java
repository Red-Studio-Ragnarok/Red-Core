package dev.redstudio.redcore.vectors;

import io.netty.buffer.ByteBuf;
import net.jafama.FastMath;
import net.minecraft.util.math.Vec3d;

/**
 * Represents a three-dimensional vector with `x`, `y`, and `z` coordinates using float.
 * <p>
 * All operations are directly performed on the vector.
 *
 * @author Desoroxxx
 * @since 0.2
 * @deprecated Will be replaced in 0.6 by the new vector suite {@link dev.redstudio.redcore.math.vectors}.
 */
@Deprecated
public final class Vector3F {

	/** The X coordinate */
	public float x;
	/** The Y coordinate */
	public float y;
	/** The Z coordinate */
	public float z;

	/**
	 * Constructs a new "empty" vector.
	 */
	public Vector3F() {
	}

	/**
	 * Constructs a new vector with the given `x`, `y`, and `z` coordinates.
	 *
	 * @param inputX The X coordinate
	 * @param inputY The Y coordinate
	 * @param inputZ The Z coordinate
	 */
	public Vector3F(final float inputX, final float inputY, final float inputZ) {
		x = inputX;
		y = inputY;
		z = inputZ;
	}

	/**
	 * Constructs a new vector with the same coordinates as the given `input` Vector3F.
	 *
	 * @param input The Vector3F to copy the coordinates from
	 */
	public Vector3F(final Vector3F input) {
		x = input.x;
		y = input.y;
		z = input.z;
	}

	/**
	 * Constructs a new vector with the same coordinates as the given `input` Vector3D.
	 *
	 * @param input The Vector3D to copy the coordinates from
	 */
	public Vector3F(final Vector3D input) {
		x = (float) input.x;
		y = (float) input.y;
		z = (float) input.z;
	}

	/**
	 * Constructs a new vector with the same coordinates as the given `input` Vec3d.
	 *
	 * @param input The Vec3d to copy the coordinates from
	 */
	public Vector3F(final Vec3d input) {
		x = (float) input.x;
		y = (float) input.y;
		z = (float) input.z;
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
	public void copy(final Vector3F inputVector) {
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
		x = (float) inputVector.x;
		y = (float) inputVector.y;
		z = (float) inputVector.z;
	}

	/**
	 * Sets the coordinates of this vector to the given `x`, `y`, and `z` values.
	 *
	 * @param inputX The X coordinate
	 * @param inputY The Y coordinate
	 * @param inputZ The Z coordinate
	 */
	public void set(final float inputX, final float inputY, final float inputZ) {
		x = inputX;
		y = inputY;
		z = inputZ;
	}

	/**
	 * Adds the given vector to this vector.
	 *
	 * @param inputVector The vector to add
	 */
	public void add(final Vector3F inputVector) {
		x += inputVector.x;
		y += inputVector.y;
		z += inputVector.z;
	}

	/**
	 * Adds the given vector to this vector.
	 *
	 * @param inputVector The vector to add
	 */
	public void add(final Vector3D inputVector) {
		x += (float) inputVector.x;
		y += (float) inputVector.y;
		z += (float) inputVector.z;
	}

	/**
	 * Scales the coordinates of this vector by the given multiplier.
	 *
	 * @param multiplier The value to multiply the coordinates by
	 */
	public void scale(final float multiplier) {
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
	public void lerp(final Vector3F input, final float partialTicks, final Vector3F target) {
		x = input.x + (target.x - input.x) * partialTicks;
		y = input.y + (target.y - input.y) * partialTicks;
		z = input.z + (target.z - input.z) * partialTicks;
	}

	/**
	 * Computes the Euclidean distance from this target to the provided `target`.
	 *
	 * @param target A vector to which the distance is calculated
	 * @return The distance between this target and `target`
	 */
	public float distanceTo(final Vector3F target) {
		final float xDelta = target.x - x;
		final float yDelta = target.y - y;
		final float zDelta = target.z - z;

		return (float) FastMath.sqrt(xDelta * xDelta + yDelta * yDelta + zDelta * zDelta);
	}

	/**
	 * Computes the Euclidean distance from this target to the provided `target`.
	 *
	 * @param target A vector to which the distance is calculated
	 * @return The distance between this target and `target`
	 */
	public float distanceTo(final Vector3D target) {
		final float xDelta = (float) (target.x - x);
		final float yDelta = (float) (target.y - y);
		final float zDelta = (float) (target.z - z);

		return (float) FastMath.sqrt(xDelta * xDelta + yDelta * yDelta + zDelta * zDelta);
	}

	/**
	 * Writes the x, y, and z coordinates of this vector to the given `byteBuf`.
	 *
	 * @param byteBuf The ByteBuf to which the coordinates are written
	 */
	public void write(final ByteBuf byteBuf) {
		byteBuf.writeFloat(x);
		byteBuf.writeFloat(y);
		byteBuf.writeFloat(z);
	}

	/**
	 * Reads the x, y, and z coordinates from the given `byteBuf` and assigns them to the coordinate of this vector.
	 *
	 * @param byteBuf The ByteBuf from which the coordinates are read
	 */
	public void read(final ByteBuf byteBuf) {
        x = byteBuf.readFloat();
        y = byteBuf.readFloat();
        z = byteBuf.readFloat();
    }
}
