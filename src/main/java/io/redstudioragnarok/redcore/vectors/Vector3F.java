package io.redstudioragnarok.redcore.vectors;

/**
 * Represents a three-dimensional vector with `x`, `y`, and `z` coordinates using float.
 *
 * @author Desoroxxx
 */
public class Vector3F {

	/** The X coordinate */
	public float x;
	/** The Y coordinate */
	public float y;
	/** The Z coordinate */
	public float z;

	/**
	 * Constructs a new empty vector.
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
	 * Constructs a new vector with the same coordinates as the given `inputVector` vector.
	 *
	 * @param inputVector The vector to copy the coordinates from
	 */
	public Vector3F(final Vector3F inputVector) {
		x = inputVector.x;
		y = inputVector.y;
		z = inputVector.z;
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
	 * Calculates a new vector by interpolating between the coordinates of the current vector and another given vector using linear interpolation.
	 * <p>
	 * The interpolation is based on a given partial ticks value, which represents a fraction of the elapsed time between
	 * two frames in a frame-based animation. The method sets the coordinates of the new vector to the interpolated values,
	 * allowing the caller to smoothly animate an object from one position to another.
	 *
	 * @param previousVector The previous vector to interpolate from
	 * @param partialTicks The fraction of elapsed time between two frames in a frame-based animation
	 * @param newVector The new vector to store the interpolated coordinates in
	 */
	public void partialVector(final Vector3F previousVector, final float partialTicks, final Vector3F newVector) {
		newVector.x = previousVector.x + (x - previousVector.x) * partialTicks;
		newVector.y = previousVector.y + (y - previousVector.y) * partialTicks;
		newVector.z = previousVector.z + (z - previousVector.z) * partialTicks;
	}
}
