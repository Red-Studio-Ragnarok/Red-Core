package dev.redstudio.redcore.math;

import lombok.NoArgsConstructor;
import net.jafama.FastMath;

import static lombok.AccessLevel.PRIVATE;

/**
 * A utility class that offers efficient mathematical operations such as absolute value calculation, linear interpolation, and rounding operations.
 *
 * @author Desoroxxx
 * @since 0.2
 */
@SuppressWarnings("unused")
@NoArgsConstructor(access = PRIVATE)
public final class MathUtil {

    /**
     * Returns the absolute value of a number.
     * <p>
     * The absolute value of a number is the number without its sign, so it is always a positive number.
     *
     * @param input The number to get the absolute value of
     * @return The absolute value of the input
     */
    public static float absolute(final float input) {
        return input >= 0 ? input : -input;
    }

    /**
     * Returns the absolute value of a number.
     * <p>
     * The absolute value of a number is the number without its sign, so it is always a positive number.
     *
     * @param input The number to get the absolute value of
     * @return The absolute value of the input
     */
    public static double absolute(final double input) {
        return input >= 0 ? input : -input;
    }

    /**
     * Returns the maximum of the absolute values of two numbers.
     * <p>
     * The absolute value of a number is the number without its sign, so it is always a positive number.
     *
     * @param input1 The first input
     * @param input2 The second input
     * @return The absolute maximum of the two inputs
     */
    public static float absoluteMax(final float input1, final float input2) {
        return Math.max(input1 >= 0 ? input1 : -input1, input2 >= 0 ? input2 : -input2);
    }

    /**
     * Returns the maximum of the absolute values of two numbers.
     * <p>
     * The absolute value of a number is the number without its sign, so it is always a positive number.
     *
     * @param input1 The first input
     * @param input2 The second input
     * @return The absolute maximum of the two inputs
     */
    public static double absoluteMax(final double input1, final double input2) {
        return Math.max(input1 >= 0 ? input1 : -input1, input2 >= 0 ? input2 : -input2);
    }

    /**
     * Adds or subtracts a value from the input based on the sign of the input.
     * <p>
     * If the input is negative, the 'add' value is subtracted from the input.
     * If the input is positive or zero, the 'add' value is added to the input.
     *
     * @param input The input value
     * @param add The value to add or subtract based on the sign of the input
     * @return The result of the operation
     */
    public static float addOrSubtractBasedOnSign(final float input, final float add) {
        return input < 0 ? input - add : input + add;
    }

    /**
     * Adds or subtracts a value from the input based on the sign of the input.
     * <p>
     * If the input is negative, the 'add' value is subtracted from the input.
     * If the input is positive or zero, the 'add' value is added to the input.
     *
     * @param input The input value
     * @param add The value to add or subtract based on the sign of the input
     * @return The result of the operation
     */
    public static double addOrSubtractBasedOnSign(final double input, final double add) {
        return input < 0 ? input - add : input + add;
    }

    /**
     * Rounds a number to a specified number of decimal places.
     * <p>
     * This is accomplished by multiplying the input by 10 raised to the power of 'decimals',
     * rounding the result to the nearest integer,
     * and then dividing by 10 raised to the power of 'decimals' again.
     *
     * @param input The number to round
     * @param decimals The number of decimal places to round to
     * @return The rounded number
     */
    public static float round(final float input, final int decimals) {
        final float multiplier = (float) FastMath.pow(10, decimals);

        // Convert input to an integer by multiplying it by 10^decimals and rounding it
        final int rounded = FastMath.round(input * multiplier);

        // Divide the rounded number by 10^decimals to get the rounded result
        return (rounded) / multiplier;
    }

    /**
     * Rounds a number to a specified number of decimal places.
     * <p>
     * This is accomplished by multiplying the input by 10 raised to the power of 'decimals',
     * rounding the result to the nearest integer,
     * and then dividing by 10 raised to the power of 'decimals' again.
     *
     * @param input The number to round
     * @param decimals The number of decimal places to round to
     * @return The rounded number
     */
    public static double round(final double input, final int decimals) {
        final double multiplier = FastMath.pow(10, decimals);

        // Convert input to an integer by multiplying it by 10^decimals and rounding it
        final long rounded = FastMath.round(input * multiplier);

        // Divide the rounded number by 10^decimals to get the rounded result
        return (rounded) / multiplier;
    }

    /**
     * Converts a number to an integer by flooring it.
     * <p>
     * If the input is less than the floored value, it returns one less than the floored value.
     * Otherwise, it returns the floored value.
     *
     * @param input The number to floor and convert to an integer
     * @return The floored integer value
     */
    public static int floorToInt(final float input) {
        final int floored = (int) input;

        return input < floored ? floored - 1 : floored;
    }

    /**
     * Converts a number to an integer by flooring it.
     * <p>
     * If the input is less than the floored value, it returns one less than the floored value.
     * Otherwise, it returns the floored value.
     *
     * @param input The number to floor and convert to an integer
     * @return The floored integer value
     */
    public static int floorToInt(final double input) {
        final int floored = (int) input;

        return input < floored ? floored - 1 : floored;
    }

    /**
     * Performs a linear interpolation between two values.
     *
     * @param startValue The starting value.
     * @param partialTicks The fraction of the tick that has passed.
     * @param targetValue The target value.
     * @return The interpolated value.
     */
    public static float lerp(final float startValue, final float partialTicks, final float targetValue) {
        return startValue + (targetValue - startValue) * partialTicks;
    }

    /**
     * Performs a linear interpolation between two values.
     *
     * @param startValue The starting value.
     * @param partialTicks The fraction of the tick that has passed.
     * @param targetValue The target value.
     * @return The interpolated value.
     */
    public static double lerp(final double startValue,  final double partialTicks, final double targetValue) {
        return startValue + (targetValue - startValue) * partialTicks;
    }

    /**
     * Converts a boolean value to an integer.
     *
     * @param input The boolean value to convert
     * @return 1 if the input is true, 0 if it's false
     */
    public static int boolToInt(final boolean input) {
        return input ? 1 : 0;
    }
}
