package io.redstudioragnarok.redcore.vectors;

import io.netty.buffer.ByteBuf;
import net.jafama.FastMath;
import net.minecraft.util.math.Vec3d;

/**
 * @author Luna Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated // Todo: Remove in 0.8
@SuppressWarnings("unused")
public final class Vector3F {

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#x}
     */
	public float x;
	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#y}
     */
	public float y;
	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#z}
     */
	public float z;

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#Vector3F()}
     */
	public Vector3F() {
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#Vector3F(float, float, float)}
     */
	public Vector3F(final float inputX, final float inputY, final float inputZ) {
		x = inputX;
		y = inputY;
		z = inputZ;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#Vector3F(dev.redstudio.redcore.vectors.Vector3F)}
     */
	public Vector3F(final Vector3F input) {
		x = input.x;
		y = input.y;
		z = input.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#Vector3F(dev.redstudio.redcore.vectors.Vector3D)}
     */
	public Vector3F(final Vector3D input) {
		x = (float) input.x;
		y = (float) input.y;
		z = (float) input.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#Vector3F(Vec3d)}
     */
	public Vector3F(final Vec3d input) {
		x = (float) input.x;
		y = (float) input.y;
		z = (float) input.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#toVec3d()}
     */
	public Vec3d toVec3d() {
		return new Vec3d(x, y, z);
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#zero()}
     */
	public void zero() {
		x = y = z = 0;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#copy(dev.redstudio.redcore.vectors.Vector3F)}
     */
	public void copy(final Vector3F inputVector) {
		x = inputVector.x;
		y = inputVector.y;
		z = inputVector.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#copy(dev.redstudio.redcore.vectors.Vector3D)}
     */
	public void copy(final Vector3D inputVector) {
		x = (float) inputVector.x;
		y = (float) inputVector.y;
		z = (float) inputVector.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#set(float, float, float)}
     */
	public void set(final float inputX, final float inputY, final float inputZ) {
		x = inputX;
		y = inputY;
		z = inputZ;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#add(dev.redstudio.redcore.vectors.Vector3F)}
     */
	public void add(final Vector3F inputVector) {
		x += inputVector.x;
		y += inputVector.y;
		z += inputVector.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#add(dev.redstudio.redcore.vectors.Vector3D)}
     */
	public void add(final Vector3D inputVector) {
		x += (float) inputVector.x;
		y += (float) inputVector.y;
		z += (float) inputVector.z;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#scale(float)}
     */
	public void scale(final float multiplier) {
		x *= multiplier;
		y *= multiplier;
		z *= multiplier;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#lerp(dev.redstudio.redcore.vectors.Vector3F, float, dev.redstudio.redcore.vectors.Vector3F)}
     */
	public void lerp(final Vector3F input, final float partialTicks, final Vector3F target) {
		x = input.x + (target.x - input.x) * partialTicks;
		y = input.y + (target.y - input.y) * partialTicks;
		z = input.z + (target.z - input.z) * partialTicks;
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#distanceTo(dev.redstudio.redcore.vectors.Vector3F)}
     */
	public float distanceTo(final Vector3F target) {
		final float xDelta = target.x - x;
		final float yDelta = target.y - y;
		final float zDelta = target.z - z;

		return (float) FastMath.sqrt(xDelta * xDelta + yDelta * yDelta + zDelta * zDelta);
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#distanceTo(dev.redstudio.redcore.vectors.Vector3D)}
     */
	public float distanceTo(final Vector3D target) {
		final float xDelta = (float) (target.x - x);
		final float yDelta = (float) (target.y - y);
		final float zDelta = (float) (target.z - z);

		return (float) FastMath.sqrt(xDelta * xDelta + yDelta * yDelta + zDelta * zDelta);
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#write(ByteBuf)}
     */
	public void write(final ByteBuf byteBuf) {
		byteBuf.writeFloat(x);
		byteBuf.writeFloat(y);
		byteBuf.writeFloat(z);
	}

	/**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3F#read(ByteBuf)}
     */
	public void read(final ByteBuf byteBuf) {
        x = byteBuf.readFloat();
        y = byteBuf.readFloat();
        z = byteBuf.readFloat();
    }
}
