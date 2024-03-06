package io.redstudioragnarok.redcore.utils;

import dev.redstudio.redcore.math.ClampUtil;

/**
 * @author Luna Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated // Todo: Remove in 0.8
@SuppressWarnings("unused")
public final class MathUtil {

    /**
     * @deprecated Use {@link ClampUtil#clampMinFirst}
     */
    @Deprecated
    public static float clampMinFirst(final float input, final float min, final float max) {
        return ClampUtil.clampMinFirst(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampMaxFirst}
     */
    @Deprecated
    public static float clampMaxFirst(final float input, final float min, final float max) {
        return ClampUtil.clampMaxFirst(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampTest}
     */
    @Deprecated
    public static float clampTest(final float input, final float min, final float max) {
        return ClampUtil.clampTest(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampMinFirst}
     */
    @Deprecated
    public static double clampMinFirst(final double input, final double min, final double max) {
        return ClampUtil.clampMinFirst(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampMaxFirst}
     */
    @Deprecated
    public static double clampMaxFirst(final double input, final double min, final double max) {
        return ClampUtil.clampMaxFirst(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampTest}
     */
    @Deprecated
    public static double clampTest(final double input, final double min, final double max) {
        return ClampUtil.clampTest(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampMinFirst}
     */
    @Deprecated
    public static byte clampMinFirst(final byte input, final byte min, final byte max) {
        return ClampUtil.clampMinFirst(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampMaxFirst}
     */
    @Deprecated
    public static byte clampMaxFirst(final byte input, final byte min, final byte max) {
        return ClampUtil.clampMaxFirst(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampTest}
     */
    @Deprecated
    public static byte clampTest(final byte input, final byte min, final byte max) {
        return ClampUtil.clampTest(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampMinFirst}
     */
    @Deprecated
    public static short clampMinFirst(final short input, final short min, final short max) {
        return ClampUtil.clampMinFirst(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampMaxFirst}
     */
    @Deprecated
    public static short clampMaxFirst(final short input, final short min, final short max) {
        return ClampUtil.clampMaxFirst(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampTest}
     */
    @Deprecated
    public static short clampTest(final short input, final short min, final short max) {
        return ClampUtil.clampTest(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampMinFirst}
     */
    @Deprecated
    public static int clampMinFirst(final int input, final int min, final int max) {
        return ClampUtil.clampMinFirst(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampMaxFirst}
     */
    @Deprecated
    public static int clampMaxFirst(final int input, final int min, final int max) {
        return ClampUtil.clampMaxFirst(input, min, max);
    }

    /**
     * @deprecated Use {@link ClampUtil#clampTest}
     */
    @Deprecated
    public static int clampTest(final int input, final int min, final int max) {
        return ClampUtil.clampTest(input, min, max);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.MathUtil#absolute}
     */
    @Deprecated
    public static float absolute(final float input) {
        return dev.redstudio.redcore.math.MathUtil.absolute(input);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.MathUtil#absolute}
     */
    @Deprecated
    public static double absolute(final double input) {
        return dev.redstudio.redcore.math.MathUtil.absolute(input);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.MathUtil#absoluteMax}
     */
    @Deprecated
    public static float absoluteMax(final float input1, final float input2) {
        return dev.redstudio.redcore.math.MathUtil.absoluteMax(input1, input2);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.MathUtil#absoluteMax}
     */
    @Deprecated
    public static double absoluteMax(final double input1, final double input2) {
        return dev.redstudio.redcore.math.MathUtil.absoluteMax(input1, input2);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.MathUtil#addOrSubtractBasedOnSign}
     */
    @Deprecated
    public static float addOrSubtractBasedOnSign(final float input, final float add) {
        return dev.redstudio.redcore.math.MathUtil.addOrSubtractBasedOnSign(input, add);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.MathUtil#addOrSubtractBasedOnSign}
     */
    @Deprecated
    public static double addOrSubtractBasedOnSign(final double input, final double add) {
        return dev.redstudio.redcore.math.MathUtil.addOrSubtractBasedOnSign(input, add);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.MathUtil#round}
     */
    @Deprecated
    public static float round(final float input, final int decimals) {
        return dev.redstudio.redcore.math.MathUtil.round(input, decimals);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.MathUtil#round}
     */
    @Deprecated
    public static double round(final double input, final int decimals) {
        return dev.redstudio.redcore.math.MathUtil.round(input, decimals);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.MathUtil#floorToInt}
     */
    @Deprecated
    public static int floorToInt(final float input) {
        return dev.redstudio.redcore.math.MathUtil.floorToInt(input);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.MathUtil#floorToInt}
     */
    @Deprecated
    public static int floorToInt(final double input) {
        return dev.redstudio.redcore.math.MathUtil.floorToInt(input);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.MathUtil#lerp}
     */
    @Deprecated
    public static float lerp(final float startValue, final float partialTicks, final float targetValue) {
        return dev.redstudio.redcore.math.MathUtil.lerp(startValue, partialTicks, targetValue);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.MathUtil#lerp}
     */
    @Deprecated
    public static double lerp(final double startValue, final double partialTicks, final double targetValue) {
        return dev.redstudio.redcore.math.MathUtil.lerp(startValue, partialTicks, targetValue);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.MathUtil#boolToInt}
     */
    @Deprecated
    public static int boolToInt(final boolean input) {
        return dev.redstudio.redcore.math.MathUtil.boolToInt(input);
    }
}
