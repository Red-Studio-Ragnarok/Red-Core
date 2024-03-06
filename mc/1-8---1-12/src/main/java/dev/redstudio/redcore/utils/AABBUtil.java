package dev.redstudio.redcore.utils;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;

/**
 * A utility class for handling axis aligned bounding boxes.
 *
 * @author Luna Lage (Desoroxxx)
 * @since 0.6
 */
@SuppressWarnings("unused")
public final class AABBUtil {

    /**
     * Orient the given north aligned AxisAlignedBB to face the given facing.
     * <p>
     * This utility method allows you to only make your AABB once and orient it to face the needed facing.
     *
     * @param facing The EnumFacing to which the AxisAlignedBB should be oriented.
     * @param northAABB The AxisAlignedBB aligned to the north which will be oriented.
     *
     * @return A new AxisAlignedBB object that represents the oriented bounding box.
     * <p>
     * If the facing is NORTH, it returns the original bounding box without changes.
     */
    public static AxisAlignedBB orientAABB(final EnumFacing facing, final AxisAlignedBB northAABB) {
        switch (facing) {
            case WEST:
                return new AxisAlignedBB(northAABB.minZ, northAABB.minY, 1 - northAABB.maxX, northAABB.maxZ, northAABB.maxY, 1 - northAABB.minX);
            case EAST:
                return new AxisAlignedBB(1 - northAABB.maxZ, northAABB.minY, northAABB.minX, 1 - northAABB.minZ, northAABB.maxY, northAABB.maxX);
            case SOUTH:
                return new AxisAlignedBB(1 - northAABB.maxX, northAABB.minY, 1 - northAABB.maxZ, 1 - northAABB.minX, northAABB.maxY, 1 - northAABB.minZ);
            case NORTH:
            default:
                return northAABB;
        }
    }
}
