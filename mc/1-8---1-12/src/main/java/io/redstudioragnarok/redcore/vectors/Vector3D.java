package io.redstudioragnarok.redcore.vectors;

import dev.redstudio.redcore.annotations.RedDeprecated;
import io.netty.buffer.ByteBuf;
import net.jafama.FastMath;
import net.minecraft.util.math.Vec3d;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
@SuppressWarnings("unused")
public final class Vector3D {

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#x}
     */
	public double x;
	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#y}
     */
	public double y;
	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#z}
     */
	public double z;

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#Vector3D()}
     */
	public Vector3D() {
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#Vector3D(double, double, double)}
     */
	public Vector3D(final double inputX, final double inputY, final double inputZ) {
		x = inputX;
		y = inputY;
		z = inputZ;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#Vector3D(dev.redstudio.redcore.vectors.Vector3D)}
     */
	public Vector3D(final Vector3D input) {
		x = input.x;
		y = input.y;
		z = input.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#Vector3D(dev.redstudio.redcore.vectors.Vector3F)}
     */
	public Vector3D(final Vector3F input) {
		x = input.x;
		y = input.y;
		z = input.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#Vector3D(Vec3d)}
     */
	public Vector3D(final Vec3d input) {
		x = input.x;
		y = input.y;
		z = input.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#toVec3d()}
     */
	public Vec3d toVec3d() {
		return new Vec3d(x, y, z);
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#zero()}
     */
	public void zero() {
		x = y = z = 0;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#copy(dev.redstudio.redcore.vectors.Vector3D)}
     */
	public void copy(final Vector3D inputVector) {
		x = inputVector.x;
		y = inputVector.y;
		z = inputVector.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#copy(dev.redstudio.redcore.vectors.Vector3F)}
     */
	public void copy(final Vector3F inputVector) {
		x = inputVector.x;
		y = inputVector.y;
		z = inputVector.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#set(double, double, double)}
     */
	public void set(final double inputX, final double inputY, final double inputZ) {
		x = inputX;
		y = inputY;
		z = inputZ;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#add(dev.redstudio.redcore.vectors.Vector3D)}
     */
	public void add(final Vector3D inputVector) {
		x += inputVector.x;
		y += inputVector.y;
		z += inputVector.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#add(dev.redstudio.redcore.vectors.Vector3F)}
     */
	public void add(final Vector3F inputVector) {
		x += inputVector.x;
		y += inputVector.y;
		z += inputVector.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#scale(double)}
     */
	public void scale(final double multiplier) {
		x *= multiplier;
		y *= multiplier;
		z *= multiplier;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#lerp(dev.redstudio.redcore.vectors.Vector3D, float, dev.redstudio.redcore.vectors.Vector3D)}
     */
	public void lerp(final Vector3D input, final float partialTicks, final Vector3D target) {
		x = input.x + (target.x - input.x) * partialTicks;
		y = input.y + (target.y - input.y) * partialTicks;
		z = input.z + (target.z - input.z) * partialTicks;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#distanceTo(dev.redstudio.redcore.vectors.Vector3D)}
     */
	public double distanceTo(final Vector3D target) {
		final double xDelta = target.x - x;
		final double yDelta = target.y - y;
		final double zDelta = target.z - z;

		return FastMath.sqrt(xDelta * xDelta + yDelta * yDelta + zDelta * zDelta);
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#distanceTo(dev.redstudio.redcore.vectors.Vector3F)}
     */
	public double distanceTo(final Vector3F target) {
		final double xDelta = target.x - x;
		final double yDelta = target.y - y;
		final double zDelta = target.z - z;

		return FastMath.sqrt(xDelta * xDelta + yDelta * yDelta + zDelta * zDelta);
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#write(ByteBuf)}
     */
	public void write(final ByteBuf byteBuf) {
		byteBuf.writeDouble(x);
		byteBuf.writeDouble(y);
		byteBuf.writeDouble(z);
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3D#read(ByteBuf)}
     */
	public void read(final ByteBuf byteBuf) {
		x = byteBuf.readDouble();
		y = byteBuf.readDouble();
		z = byteBuf.readDouble();
	}
}
