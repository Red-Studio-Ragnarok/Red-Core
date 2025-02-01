package dev.redstudio.redcore.utils;

import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

/// Utility class for handling decimal numbers, notably for display purposes.
///
/// This class provides methods to truncate decimal numbers to a specified number of decimal places.
/// The truncation is performed by removing excess decimal places without rounding.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
@NoArgsConstructor(access = PRIVATE)
public class DecimalUtils {

    /// Truncates the decimal places of a decimal number.
    ///
    /// This method converts the float input to a string and then truncates it.
    ///
    /// @param input The decimal number to truncate
    /// @param decimalPlaces The number of decimal places to truncate to
    ///
    /// @return A string representation of the truncated decimal number, or the original input if no truncation was needed
    ///
    /// @see #truncateDecimalPlaces(String, int)
    public static String truncateDecimalPlaces(final float input, final int decimalPlaces) {
        return truncateDecimalPlaces(String.valueOf(input), decimalPlaces);
    }

    /// Truncates the decimal places of a decimal number.
    ///
    /// This method converts the double input to a string and then truncates it.
    ///
    /// @param input The decimal number to truncate
    /// @param decimalPlaces The number of decimal places to truncate to
    ///
    /// @return A string representation of the truncated decimal number, or the original input if no truncation was needed
    ///
    /// @see #truncateDecimalPlaces(String, int)
    public static String truncateDecimalPlaces(final double input, final int decimalPlaces) {
        return truncateDecimalPlaces(String.valueOf(input), decimalPlaces);
    }

    /// Truncates the decimal places in a string representation of a decimal number.
    ///
    /// This method does not perform any rounding.
    /// It simply removes any digits beyond the specified number of decimal places.
    ///
    /// @param input The decimal number to truncate as a string representation (e.g., "123.456")
    /// @param decimalPlaces The number of decimal places to truncate to
    ///
    /// @return A string representation of the truncated decimal number, or the original input if no truncation is needed
    ///
    /// @throws IllegalArgumentException if decimalPlaces is negative
    public static String truncateDecimalPlaces(final String input, final int decimalPlaces) {
        if (decimalPlaces < 0)
            throw new IllegalArgumentException("Number of decimal places cannot be negative");

        final int decimalIndex = input.indexOf(".");

        if (decimalIndex == -1 || input.length() <= decimalIndex + decimalPlaces)
            return input;

        return input.substring(0, decimalIndex + decimalPlaces + 1);
    }
}
