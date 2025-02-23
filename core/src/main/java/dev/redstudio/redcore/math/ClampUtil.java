package dev.redstudio.redcore.math;

import dev.redstudio.redcore.annotations.RedDeprecated;
import lombok.experimental.UtilityClass;

import static dev.redstudio.redcore.ProjectConstants.LOGGER;

/// A utility class that offers primitive clamping methods.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-23
/// @since 0.5
@SuppressWarnings({"unused", "ManualMinMaxCalculation", "DuplicatedCode"})
@UtilityClass
public final class ClampUtil {

    /// Clamps a byte within a specified range `min`, `max`.
    ///
    /// If the input is less than `min`, it returns `min`.
    /// If the input is greater than `max`, it returns `max`.
    /// Otherwise, it returns `input`.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    public static byte clamp(final byte input, final byte min, final byte max) {
        return input < min ? min : input > max ? max : input;
    }

    /// Clamps a short within a specified range `min`, `max`.
    ///
    /// If the input is less than `min`, it returns `min`.
    /// If the input is greater than `max`, it returns `max`.
    /// Otherwise, it returns `input`.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    public static short clamp(final short input, final short min, final short max) {
        return input < min ? min : input > max ? max : input;
    }

    /// Clamps an int within a specified range `min`, `max`.
    ///
    /// If the input is less than `min`, it returns `min`.
    /// If the input is greater than `max`, it returns `max`.
    /// Otherwise, it returns `input`.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    public static int clamp(final int input, final int min, final int max) {
        return input < min ? min : input > max ? max : input;
    }

    /// Clamps a long within a specified range `min`, `max`.
    ///
    /// If the input is less than `min`, it returns `min`.
    /// If the input is greater than `max`, it returns `max`.
    /// Otherwise, it returns `input`.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    public static long clamp(final long input, final long min, final long max) {
        return input < min ? min : input > max ? max : input;
    }

    /// Clamps a float within a specified range `min`, `max`.
    ///
    /// If the input is less than `min`, it returns `min`.
    /// If the input is greater than `max`, it returns `max`.
    /// Otherwise, it returns `input`.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    public static float clamp(final float input, final float min, final float max) {
        return input < min ? min : input > max ? max : input;
    }

    /// Clamps a double within a specified range `min`, `max`.
    ///
    /// If the input is less than `min`, it returns `min`.
    /// If the input is greater than `max`, it returns `max`.
    /// Otherwise, it returns `input`.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    public static double clamp(final double input, final double min, final double max) {
        return input < min ? min : input > max ? max : input;
    }

    // region Deprecated

    /// Clamps a value within a specified range `min, max`, checking for the maximum value first.
    ///
    /// If the input is greater than max, it returns max. If the input is less than min, it returns min.
    /// Otherwise, it returns the input.
    ///
    /// This will log the result to check if clampMinFirst or clampMaxFirst should be used.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(byte, byte, byte)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static byte clampTest(final byte input, final byte min, final byte max) {
        if (input < min) {
            LOGGER.info("Clamped to minimum");
            return min;
        } else if (input > max) {
            LOGGER.info("Clamped to maximum");
            return max;
        } else {
            LOGGER.info("Did not clamp");
            return input;
        }
    }

    /// Clamps a value within a specified range `min, max`, checking for the maximum value first.
    ///
    /// If the input is greater than max, it returns max. If the input is less than min, it returns min.
    /// Otherwise, it returns the input.
    ///
    /// This will log the result to check if clampMinFirst or clampMaxFirst should be used.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(short, short, short)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static short clampTest(final short input, final short min, final short max) {
        if (input < min) {
            LOGGER.info("Clamped to minimum");
            return min;
        } else if (input > max) {
            LOGGER.info("Clamped to maximum");
            return max;
        } else {
            LOGGER.info("Did not clamp");
            return input;
        }
    }

    /// Clamps a value within a specified range `min, max`, checking for the maximum value first.
    ///
    /// If the input is greater than max, it returns max. If the input is less than min, it returns min.
    /// Otherwise, it returns the input.
    ///
    /// This will log the result to check if clampMinFirst or clampMaxFirst should be used.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(int, int, int)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static int clampTest(final int input, final int min, final int max) {
        if (input < min) {
            LOGGER.info("Clamped to minimum");
            return min;
        } else if (input > max) {
            LOGGER.info("Clamped to maximum");
            return max;
        } else {
            LOGGER.info("Did not clamp");
            return input;
        }
    }

    /// Clamps a value within a specified range `min, max`, checking for the maximum value first.
    ///
    /// If the input is greater than max, it returns max. If the input is less than min, it returns min.
    /// Otherwise, it returns the input.
    ///
    /// This will log the result to check if clampMinFirst or clampMaxFirst should be used.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(long, long, long)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static long clampTest(final long input, final long min, final long max) {
        if (input < min) {
            LOGGER.info("Clamped to minimum");
            return min;
        } else if (input > max) {
            LOGGER.info("Clamped to maximum");
            return max;
        } else {
            LOGGER.info("Did not clamp");
            return input;
        }
    }

    /// Clamps a value within a specified range `min, max`, checking for the maximum value first.
    ///
    /// If the input is greater than max, it returns max. If the input is less than min, it returns min.
    /// Otherwise, it returns the input.
    ///
    /// This will log the result to check if clampMinFirst or clampMaxFirst should be used.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(float, float, float)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static float clampTest(final float input, final float min, final float max) {
        if (input < min) {
            LOGGER.info("Clamped to minimum");
            return min;
        } else if (input > max) {
            LOGGER.info("Clamped to maximum");
            return max;
        } else {
            LOGGER.info("Did not clamp");
            return input;
        }
    }

    /// Clamps a value within a specified range `min, max`, checking for the maximum value first.
    ///
    /// If the input is greater than max, it returns max. If the input is less than min, it returns min.
    /// Otherwise, it returns the input.
    ///
    /// This will log the result to check if clampMinFirst or clampMaxFirst should be used.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(double, double, double)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static double clampTest(final double input, final double min, final double max) {
        if (input < min) {
            LOGGER.info("Clamped to minimum");
            return min;
        } else if (input > max) {
            LOGGER.info("Clamped to maximum");
            return max;
        } else {
            LOGGER.info("Did not clamp");
            return input;
        }
    }

    /// Clamps a value within a specified range `min, max`, checking for the minimum value first.
    ///
    /// If the input is less than min, it returns min. If the input is greater than max, it returns max.
    /// Otherwise, it returns the input.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(byte, byte, byte)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static byte clampMinFirst(final byte input, final byte min, final byte max) {
        return input < min ? min : input > max ? max : input;
    }

    /// Clamps a value within a specified range `min, max`, checking for the minimum value first.
    ///
    /// If the input is less than min, it returns min. If the input is greater than max, it returns max.
    /// Otherwise, it returns the input.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(short, short, short)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static short clampMinFirst(final short input, final short min, final short max) {
        return input < min ? min : input > max ? max : input;
    }

    /// Clamps a value within a specified range `min, max`, checking for the minimum value first.
    ///
    /// If the input is less than min, it returns min. If the input is greater than max, it returns max.
    /// Otherwise, it returns the input.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(int, int, int)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static int clampMinFirst(final int input, final int min, final int max) {
        return input < min ? min : input > max ? max : input;
    }

    /// Clamps a value within a specified range `min, max`, checking for the minimum value first.
    ///
    /// If the input is less than min, it returns min. If the input is greater than max, it returns max.
    /// Otherwise, it returns the input.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(long, long, long)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static long clampMinFirst(final long input, final long min, final long max) {
        return input < min ? min : input > max ? max : input;
    }

    /// Clamps a value within a specified range `min, max`, checking for the minimum value first.
    ///
    /// If the input is less than min, it returns min. If the input is greater than max, it returns max.
    /// Otherwise, it returns the input.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(float, float, float)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static float clampMinFirst(final float input, final float min, final float max) {
        return input < min ? min : input > max ? max : input;
    }

    /// Clamps a value within a specified range `min, max`, checking for the minimum value first.
    ///
    /// If the input is less than min, it returns min. If the input is greater than max, it returns max.
    /// Otherwise, it returns the input.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(double, double, double)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static double clampMinFirst(final double input, final double min, final double max) {
        return input < min ? min : input > max ? max : input;
    }

    /// Clamps a value within a specified range `min, max`, checking for the maximum value first.
    ///
    /// If the input is greater than max, it returns max. If the input is less than min, it returns min.
    /// Otherwise, it returns the input.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(byte, byte, byte)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static byte clampMaxFirst(final byte input, final byte min, final byte max) {
        return input > max ? max : input < min ? min : input;
    }

    /// Clamps a value within a specified range `min, max`, checking for the maximum value first.
    ///
    /// If the input is greater than max, it returns max. If the input is less than min, it returns min.
    /// Otherwise, it returns the input.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(short, short, short)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static short clampMaxFirst(final short input, final short min, final short max) {
        return input > max ? max : input < min ? min : input;
    }

    /// Clamps a value within a specified range `min, max`, checking for the maximum value first.
    ///
    /// If the input is greater than max, it returns max. If the input is less than min, it returns min.
    /// Otherwise, it returns the input.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(int, int, int)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static int clampMaxFirst(final int input, final int min, final int max) {
        return input > max ? max : input < min ? min : input;
    }

    /// Clamps a value within a specified range `min, max`, checking for the maximum value first.
    ///
    /// If the input is greater than max, it returns max. If the input is less than min, it returns min.
    /// Otherwise, it returns the input.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(long, long, long)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static long clampMaxFirst(final long input, final long min, final long max) {
        return input > max ? max : input < min ? min : input;
    }

    /// Clamps a value within a specified range `min, max`, checking for the maximum value first.
    ///
    /// If the input is greater than max, it returns max. If the input is less than min, it returns min.
    /// Otherwise, it returns the input.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(float, float, float)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static float clampMaxFirst(final float input, final float min, final float max) {
        return input > max ? max : input < min ? min : input;
    }

    /// Clamps a value within a specified range `min, max`, checking for the maximum value first.
    ///
    /// If the input is greater than max, it returns max. If the input is less than min, it returns min.
    /// Otherwise, it returns the input.
    ///
    /// @param input The input value to clamp
    /// @param min The minimum value to clamp to
    /// @param max The maximum value to clamp to
    ///
    /// @return The clamped value
    ///
    /// @deprecated Use [ClampUtil#clamp(double, double, double)]
    @RedDeprecated(since = "0.7", forRemovalIn = "0.9")
    public static double clampMaxFirst(final double input, final double min, final double max) {
        return input > max ? max : input < min ? min : input;
    }

    // endregion
}
