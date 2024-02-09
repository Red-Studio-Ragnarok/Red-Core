import dev.redstudio.redcore.utils.Case;
import org.junit.jupiter.params.provider.Arguments;

import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Luna Lage (Desoroxxx)
 * @since 0.6
 */
final class CaseTestSource {

    private static Stream<Case> caseNullInputProvider() {
        return Stream.of(Case.values());
    }

    private static Stream<Arguments> caseEmptyInputProvider() {
        return Stream.of(Case.values())
                .flatMap(caseType -> IntStream.rangeClosed(0, 4)
                        .mapToObj(numSpaces -> Arguments.of(caseType, String.join("", Collections.nCopies(numSpaces, " ")), "")));
    }

    private static Stream<Arguments> caseSpecialInputProvider() {
        return Stream.of(Case.values())
                .flatMap(caseType -> Stream.of(Arguments.of("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~", ""))
                        .map(args -> Arguments.of(caseType, args.get()[0], args.get()[1])));
    }

    private static Stream<Arguments> checkInputProvider() {
        return Stream.of(
                Arguments.of(Case.CAMEL_CASE, "helloWorld", true),
                Arguments.of(Case.CAMEL_CASE, "HelloWorld", false),
                Arguments.of(Case.CAMEL_CASE, "hello-world", false),
                Arguments.of(Case.CAMEL_CASE, "hello_world", false),
                Arguments.of(Case.CAMEL_CASE, "HELLO_WORLD", false),
                Arguments.of(Case.CAMEL_CASE, "helloWorld!", false),
                Arguments.of(Case.CAMEL_CASE, "TESTING", false),
                Arguments.of(Case.CAMEL_CASE, "testing", true),
                Arguments.of(Case.CAMEL_CASE, "h", true),
                Arguments.of(Case.CAMEL_CASE, "hH", true),
                Arguments.of(Case.CAMEL_CASE, "HH", false),

                Arguments.of(Case.PASCAL_CASE, "HelloWorld", true),
                Arguments.of(Case.PASCAL_CASE, "helloWorld", false),
                Arguments.of(Case.PASCAL_CASE, "hello-world", false),
                Arguments.of(Case.PASCAL_CASE, "hello_world", false),
                Arguments.of(Case.PASCAL_CASE, "HELLO_WORLD", false),
                Arguments.of(Case.PASCAL_CASE, "HelloWorld!", false),
                Arguments.of(Case.PASCAL_CASE, "TESTING", true),
                Arguments.of(Case.PASCAL_CASE, "testing", false),
                Arguments.of(Case.PASCAL_CASE, "H", true),
                Arguments.of(Case.PASCAL_CASE, "Hh", true),
                Arguments.of(Case.PASCAL_CASE, "HH", true),

                Arguments.of(Case.KEBAB_CASE, "hello-world", true),
                Arguments.of(Case.KEBAB_CASE, "Hello-World", false),
                Arguments.of(Case.KEBAB_CASE, "helloWorld", false),
                Arguments.of(Case.KEBAB_CASE, "HelloWorld", false),
                Arguments.of(Case.KEBAB_CASE, "hello_world", false),
                Arguments.of(Case.KEBAB_CASE, "HELLO_WORLD", false),
                Arguments.of(Case.KEBAB_CASE, "hello-world-!", false),
                Arguments.of(Case.KEBAB_CASE, "TESTING", false),
                Arguments.of(Case.KEBAB_CASE, "testing", true),
                Arguments.of(Case.KEBAB_CASE, "h", true),
                Arguments.of(Case.KEBAB_CASE, "hh", true),
                Arguments.of(Case.KEBAB_CASE, "HH", false),

                Arguments.of(Case.LOWER_SNAKE_CASE, "hello_world", true),
                Arguments.of(Case.LOWER_SNAKE_CASE, "Hello_World", false),
                Arguments.of(Case.LOWER_SNAKE_CASE, "helloWorld", false),
                Arguments.of(Case.LOWER_SNAKE_CASE, "HelloWorld", false),
                Arguments.of(Case.LOWER_SNAKE_CASE, "HELLO_WORLD", false),
                Arguments.of(Case.LOWER_SNAKE_CASE, "hello_world_!", false),
                Arguments.of(Case.LOWER_SNAKE_CASE, "TESTING", false),
                Arguments.of(Case.LOWER_SNAKE_CASE, "testing", true),
                Arguments.of(Case.LOWER_SNAKE_CASE, "h", true),
                Arguments.of(Case.LOWER_SNAKE_CASE, "hh", true),
                Arguments.of(Case.LOWER_SNAKE_CASE, "HH", false),

                Arguments.of(Case.UPPER_SNAKE_CASE, "HELLO_WORLD", true),
                Arguments.of(Case.UPPER_SNAKE_CASE, "hello_world", false),
                Arguments.of(Case.UPPER_SNAKE_CASE, "helloWorld", false),
                Arguments.of(Case.UPPER_SNAKE_CASE, "HelloWorld", false),
                Arguments.of(Case.UPPER_SNAKE_CASE, "hello-world", false),
                Arguments.of(Case.UPPER_SNAKE_CASE, "hello_world", false),
                Arguments.of(Case.UPPER_SNAKE_CASE, "HELLO_WORLD!", false),
                Arguments.of(Case.UPPER_SNAKE_CASE, "TESTING", true),
                Arguments.of(Case.UPPER_SNAKE_CASE, "testing", false),
                Arguments.of(Case.UPPER_SNAKE_CASE, "H", true),
                Arguments.of(Case.UPPER_SNAKE_CASE, "HH", true),
                Arguments.of(Case.UPPER_SNAKE_CASE, "hh", false)
        );
    }

    private static Stream<Arguments> enforceInputProvider() {
        return Stream.of(
                Arguments.of(Case.CAMEL_CASE, "Testing", "testing"),
                Arguments.of(Case.CAMEL_CASE, "testing", "testing"),
                Arguments.of(Case.CAMEL_CASE, "TESTING", "testing"),
                Arguments.of(Case.CAMEL_CASE, "helloWorld", "helloWorld"),
                Arguments.of(Case.CAMEL_CASE, "Hello world", "helloWorld"),
                Arguments.of(Case.CAMEL_CASE, "Hello world ", "helloWorld"),
                Arguments.of(Case.CAMEL_CASE, "Hello-world", "helloWorld"),
                Arguments.of(Case.CAMEL_CASE, "Hello---world", "helloWorld"),
                Arguments.of(Case.CAMEL_CASE, "!Hello world!", "helloWorld"),
                Arguments.of(Case.CAMEL_CASE, "what is that?", "whatIsThat"),
                Arguments.of(Case.CAMEL_CASE, "My cat Perle is a BEAUTIFUL and CUTE cat", "myCatPerleIsABeautifulAndCuteCat"),
                Arguments.of(Case.CAMEL_CASE, "My cat Perle, is a BEAUTIFUL and CUTE cat!", "myCatPerleIsABeautifulAndCuteCat"),
                Arguments.of(Case.CAMEL_CASE, "1 2 3 4 5", "12345"),
                Arguments.of(Case.CAMEL_CASE, "TEST_TEST", "testTest"),
                Arguments.of(Case.CAMEL_CASE, "H", "h"),
                Arguments.of(Case.CAMEL_CASE, "HH", "hh"),
                Arguments.of(Case.CAMEL_CASE, "Hh", "hh"),

                Arguments.of(Case.PASCAL_CASE, "Testing", "Testing"),
                Arguments.of(Case.PASCAL_CASE, "testing", "Testing"),
                Arguments.of(Case.PASCAL_CASE, "TESTING", "TESTING"),
                Arguments.of(Case.PASCAL_CASE, "HelloWorld", "HelloWorld"),
                Arguments.of(Case.PASCAL_CASE, "Hello world", "HelloWorld"),
                Arguments.of(Case.PASCAL_CASE, "Hello world ", "HelloWorld"),
                Arguments.of(Case.PASCAL_CASE, "Hello-world", "HelloWorld"),
                Arguments.of(Case.PASCAL_CASE, "Hello---world", "HelloWorld"),
                Arguments.of(Case.PASCAL_CASE, "!Hello world!", "HelloWorld"),
                Arguments.of(Case.PASCAL_CASE, "what is that?", "WhatIsThat"),
                Arguments.of(Case.PASCAL_CASE, "My cat Perle is a BEAUTIFUL and CUTE cat", "MyCatPerleIsABeautifulAndCuteCat"),
                Arguments.of(Case.PASCAL_CASE, "My cat Perle, is a BEAUTIFUL and CUTE cat!", "MyCatPerleIsABeautifulAndCuteCat"),
                Arguments.of(Case.PASCAL_CASE, "1 2 3 4 5", "12345"),
                Arguments.of(Case.PASCAL_CASE, "TEST_TEST", "TestTest"),
                Arguments.of(Case.PASCAL_CASE, "H", "H"),
                Arguments.of(Case.PASCAL_CASE, "HH", "HH"),
                Arguments.of(Case.PASCAL_CASE, "hH", "HH"),
                Arguments.of(Case.PASCAL_CASE, "hHh", "HHh"),

                Arguments.of(Case.KEBAB_CASE, "Testing", "testing"),
                Arguments.of(Case.KEBAB_CASE, "testing", "testing"),
                Arguments.of(Case.KEBAB_CASE, "TESTING", "testing"),
                Arguments.of(Case.KEBAB_CASE, "hello-world", "hello-world"),
                Arguments.of(Case.KEBAB_CASE, "Hello World", "hello-world"),
                Arguments.of(Case.KEBAB_CASE, "Hello World ", "hello-world"),
                Arguments.of(Case.KEBAB_CASE, "Hello-world", "hello-world"),
                Arguments.of(Case.KEBAB_CASE, "Hello---world", "hello-world"),
                Arguments.of(Case.KEBAB_CASE, "!Hello World!", "hello-world"),
                Arguments.of(Case.KEBAB_CASE, "what is that?", "what-is-that"),
                Arguments.of(Case.KEBAB_CASE, "My cat Perle is a BEAUTIFUL and CUTE cat", "my-cat-perle-is-a-beautiful-and-cute-cat"),
                Arguments.of(Case.KEBAB_CASE, "My cat Perle, is a BEAUTIFUL and CUTE cat!", "my-cat-perle-is-a-beautiful-and-cute-cat"),
                Arguments.of(Case.KEBAB_CASE, "1 2 3 4 5", "1-2-3-4-5"),
                Arguments.of(Case.KEBAB_CASE, "TEST_TEST", "test-test"),
                Arguments.of(Case.KEBAB_CASE, "H", "h"),
                Arguments.of(Case.KEBAB_CASE, "HH", "hh"),
                Arguments.of(Case.KEBAB_CASE, "Hh", "hh"),
                Arguments.of(Case.KEBAB_CASE, "HhH", "hh-h"),

                Arguments.of(Case.LOWER_SNAKE_CASE, "Testing", "testing"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "testing", "testing"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "TESTING", "testing"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "hello_world", "hello_world"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "Hello world", "hello_world"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "Hello world ", "hello_world"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "Hello-world", "hello_world"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "Hello---world", "hello_world"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "!Hello world!", "hello_world"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "what is that?", "what_is_that"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "My cat Perle is a BEAUTIFUL and CUTE cat", "my_cat_perle_is_a_beautiful_and_cute_cat"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "My cat Perle, is a BEAUTIFUL and CUTE cat!", "my_cat_perle_is_a_beautiful_and_cute_cat"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "1 2 3 4 5", "1_2_3_4_5"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "TEST_TEST", "test_test"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "H", "h"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "HH", "hh"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "Hh", "hh"),
                Arguments.of(Case.LOWER_SNAKE_CASE, "HhH", "hh_h"),

                Arguments.of(Case.UPPER_SNAKE_CASE, "Testing", "TESTING"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "testing", "TESTING"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "TESTING", "TESTING"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "HELLO_WORLD", "HELLO_WORLD"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "Hello world", "HELLO_WORLD"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "Hello world ", "HELLO_WORLD"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "Hello-world", "HELLO_WORLD"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "Hello---world", "HELLO_WORLD"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "!Hello world!", "HELLO_WORLD"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "what is that?", "WHAT_IS_THAT"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "My cat Perle is a BEAUTIFUL and CUTE cat", "MY_CAT_PERLE_IS_A_BEAUTIFUL_AND_CUTE_CAT"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "My cat Perle, is a BEAUTIFUL and CUTE cat!", "MY_CAT_PERLE_IS_A_BEAUTIFUL_AND_CUTE_CAT"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "1 2 3 4 5", "1_2_3_4_5"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "TEST_TEST", "TEST_TEST"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "h", "H"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "hh", "HH"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "hH", "H_H"),
                Arguments.of(Case.UPPER_SNAKE_CASE, "HhH", "HH_H")
        );
    }
}
