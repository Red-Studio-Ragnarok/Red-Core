package dev.redstudio.redcore.math;

import lombok.experimental.UtilityClass;

import static dev.redstudio.redcore.ProjectConstants.LOGGER;

/// A utility class that offers efficient clamping methods.
///
/// These functions are optimized for speed and provided for every primitive datatype.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.5
@SuppressWarnings({"unused", "ManualMinMaxCalculation", "DuplicatedCode"})
@UtilityClass
public final class ClampUtil {

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
    public static double clampMaxFirst(final double input, final double min, final double max) {
        return input > max ? max : input < min ? min : input;
    }
}
