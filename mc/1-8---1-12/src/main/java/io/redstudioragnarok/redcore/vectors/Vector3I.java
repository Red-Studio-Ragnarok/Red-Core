package io.redstudioragnarok.redcore.vectors;

import dev.redstudio.redcore.annotations.RedDeprecated;
import io.netty.buffer.ByteBuf;
import net.jafama.FastMath;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
@SuppressWarnings("unused")
public final class Vector3I {

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#x}
     */
    public int x;
    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#y}
     */
    public int y;
    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#z}
     */
    public int z;

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#Vector3I()}
     */
    public Vector3I() {
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#Vector3I(int, int, int)}
     */
    public Vector3I(final int inputX, final int inputY, final int inputZ) {
        x = inputX;
        y = inputY;
        z = inputZ;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#Vector3I(dev.redstudio.redcore.vectors.Vector3D)}
     */
    public Vector3I(final Vector3D input) {
        x = (int) input.x;
        y = (int) input.y;
        z = (int) input.z;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#Vector3I(dev.redstudio.redcore.vectors.Vector3F)}
     */
    public Vector3I(final Vector3F input) {
        x = (int) input.x;
        y = (int) input.y;
        z = (int) input.z;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#Vector3I(Vec3i)}
     */
    public Vector3I(final Vec3i input) {
        x = input.getX();
        y = input.getY();
        z = input.getZ();
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#toVec3d()}
     */
    public Vec3d toVec3d() {
        return new Vec3d(x, y, z);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#zero()}
     */
    public void zero() {
        x = y = z = 0;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#copy(dev.redstudio.redcore.vectors.Vector3I)}
     */
    public void copy(final Vector3I inputVector) {
        x = inputVector.x;
        y = inputVector.y;
        z = inputVector.z;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#copy(dev.redstudio.redcore.vectors.Vector3D)}
     */
    public void copy(final Vector3D inputVector) {
        x = (int) inputVector.x;
        y = (int) inputVector.y;
        z = (int) inputVector.z;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#copy(dev.redstudio.redcore.vectors.Vector3F)}
     */
    public void copy(final Vector3F inputVector) {
        x = (int) inputVector.x;
        y = (int) inputVector.y;
        z = (int) inputVector.z;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#set(int, int, int)}
     */
    public void set(final int inputX, final int inputY, final int inputZ) {
        x = inputX;
        y = inputY;
        z = inputZ;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#add(dev.redstudio.redcore.vectors.Vector3D)}
     */
    public void add(final Vector3D inputVector) {
        x += (int) inputVector.x;
        y += (int) inputVector.y;
        z += (int) inputVector.z;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#add(dev.redstudio.redcore.vectors.Vector3F)}
     */
    public void add(final Vector3F inputVector) {
        x += (int) inputVector.x;
        y += (int) inputVector.y;
        z += (int) inputVector.z;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#scale(int)}
     */
    public void scale(final int multiplier) {
        x *= multiplier;
        y *= multiplier;
        z *= multiplier;
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#lerp(dev.redstudio.redcore.vectors.Vector3I, float, dev.redstudio.redcore.vectors.Vector3I)}
     */
    public void lerp(final Vector3I input, final float partialTicks, final Vector3I target) {
        x = (int) (input.x + (target.x - input.x) * partialTicks);
        y = (int) (input.y + (target.y - input.y) * partialTicks);
        z = (int) (input.z + (target.z - input.z) * partialTicks);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#distanceTo(dev.redstudio.redcore.vectors.Vector3I)}
     */
    public int distanceTo(final Vector3I target) {
        final int xDelta = target.x - x;
        final int yDelta = target.y - y;
        final int zDelta = target.z - z;

        return (int) FastMath.sqrt(xDelta * xDelta + yDelta * yDelta + zDelta * zDelta);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#distanceTo(dev.redstudio.redcore.vectors.Vector3D)}
     */
    public int distanceTo(final Vector3D target) {
        final int xDelta = (int) (target.x - x);
        final int yDelta = (int) (target.y - y);
        final int zDelta = (int) (target.z - z);

        return (int) FastMath.sqrt(xDelta * xDelta + yDelta * yDelta + zDelta * zDelta);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#distanceTo(dev.redstudio.redcore.vectors.Vector3F)}
     */
    public int distanceTo(final Vector3F target) {
        final int xDelta = (int) (target.x - x);
        final int yDelta = (int) (target.y - y);
        final int zDelta = (int) (target.z - z);

        return (int) FastMath.sqrt(xDelta * xDelta + yDelta * yDelta + zDelta * zDelta);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#write(ByteBuf)}
     */
    public void write(final ByteBuf byteBuf) {
        byteBuf.writeInt(x);
        byteBuf.writeInt(y);
        byteBuf.writeInt(z);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.vectors.Vector3I#read(ByteBuf)}
     */
    public void read(final ByteBuf byteBuf) {
        x = byteBuf.readInt();
        y = byteBuf.readInt();
        z = byteBuf.readInt();
    }
}
