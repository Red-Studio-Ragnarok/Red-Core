package dev.redstudio.redcore.utils;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static dev.redstudio.redcore.ProjectConstants.LOGGER;

/// A utility enum offering methods for checking, applying and enforcing naming conventions.
///
/// *Warning: This cannot account for the entire complexity and nuances of naming things, it is a tool and as with any tools should be used with caution.*
///
/// @author Luna Mira Lage (Desoroxxx)
/// @since 0.6
public enum Case {

    /// `camelCase`
    CAMEL_CASE("^[a-z0-9]++(?:[A-Z]++[a-z0-9]*+)*+$") {
        @Override
        public String apply(String input) {
            final AtomicBoolean isFirstWord = new AtomicBoolean(true); // Must use AtomicBoolean since used in a lambda it must be effectively final

            return prepare(input)
                    .map(part -> {
                        if (isFirstWord.getAndSet(false)) {
                            return part.toLowerCase();
                        } else {
                            return part.isEmpty() ? part : part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
                        }
                    })
                    .collect(Collectors.joining());
        }
    },
    /// `PascalCase`
    ///
    /// *Warning: This will consider full uppercase strings as valid, it is included for completeness but use at your own risk.*
    PASCAL_CASE("^[A-Z]([a-z0-9]*)([A-Z][a-z0-9]*)*$") {
        @Override
        public String apply(String input) {
            return prepare(input).map(part -> part.isEmpty() ? "" : part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase()).collect(Collectors.joining());
        }
    },
    /// `kebab-case``
    KEBAB_CASE("^[a-z0-9]++(?:-[a-z0-9]++)*+$") {
        @Override
        public String apply(String input) {
            return prepare(input).map(String::toLowerCase).collect(Collectors.joining("-"));
        }
    },
    /// `lower_snake_case``
    LOWER_SNAKE_CASE("^[a-z0-9]++(?:_[a-z0-9]++)*+$") {
        @Override
        public String apply(String input) {
            return prepare(input).map(String::toLowerCase).collect(Collectors.joining("_"));
        }
    },
    /// `UPPER_SNAKE_CASE``
    UPPER_SNAKE_CASE("^[A-Z0-9]++(?:_[A-Z0-9]++)*+$") {
        @Override
        public String apply(String input) {
            return prepare(input).map(String::toUpperCase).collect(Collectors.joining("_"));
        }
    };

    private static final Pattern PUNCTUATION_PATTERN = Pattern.compile("\\p{Punct}");
    private static final Pattern SPLIT_PATTERN = Pattern.compile("\\s+|(?<=[a-z0-9])(?=[A-Z0-9])");

    private final Pattern pattern;

    Case(final String regex) {
        pattern = Pattern.compile(regex);
    }

    public abstract String apply(String input);

    /// Checks if the input string is in the naming convention.
    ///
    /// @param input The input string to check
    ///
    /// @return True if the input string is in the naming convention, false otherwise
    public boolean check(final String input) {
        return pattern.matcher(input).matches();
    }

    /// Enforces the naming convention on the input.
    ///
    /// It first checks if the input string is in the naming convention.
    /// If the input is not in the naming convention, it applies the naming convention to the input and logs a warning.
    ///
    /// @param input The input string to enforce the naming convention on
    ///
    /// @return The input string with the naming convention applied or the unchanged input if the input is already in the convention
    public String enforce(final String input) {
        if (check(input))
            return input;

        final String result = apply(input);

        LOGGER.warn("{} is not in the correct format, converted to {}", input, result);

        return result;
    }

    /// Prepares an input string by removing punctuation and splitting it into words as best as it can.
    ///
    /// @param input The input string to prepare
    ///
    /// @return A stream of words in the input string with no punctuation
    private static Stream<String> prepare(final String input) {
        final String unpunctuatedInput = PUNCTUATION_PATTERN.matcher(input).replaceAll(" ");
        return Arrays.stream(SPLIT_PATTERN.split(unpunctuatedInput.trim()));
    }
}
