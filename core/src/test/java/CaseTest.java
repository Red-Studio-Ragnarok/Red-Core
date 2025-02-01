import dev.redstudio.redcore.utils.Case;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
final class CaseTest {

    @ParameterizedTest
    @MethodSource("CaseTestSource#caseNullInputProvider")
    void testNull(final Case toTest) {
        assertThrows(NullPointerException.class, () -> toTest.check(null));
        assertThrows(NullPointerException.class, () -> toTest.apply(null));
        assertThrows(NullPointerException.class, () -> toTest.enforce(null));
    }

    @ParameterizedTest
    @MethodSource("CaseTestSource#caseEmptyInputProvider")
    void testEmpty(final Case toTest, final String input, final String expected) {
        assertFalse(toTest.check(input));
        assertEquals(expected, toTest.apply(input));
        assertEquals(expected, toTest.enforce(input));
    }

    @ParameterizedTest
    @MethodSource("CaseTestSource#caseSpecialInputProvider")
    void testSpecial(final Case toTest, final String input, final String expected) {
        assertFalse(toTest.check(input));
        assertEquals(expected, toTest.apply(input));
        assertEquals(expected, toTest.enforce(input));
    }

    @ParameterizedTest
    @MethodSource("CaseTestSource#checkInputProvider")
    void testCheck(final Case toTest, final String input, final boolean expected) {
        assertEquals(expected, toTest.check(input));
    }

    @ParameterizedTest
    @MethodSource("CaseTestSource#enforceInputProvider")
    void testEnforce(final Case toTest, final String input, final String expected) {
        assertEquals(expected, toTest.enforce(input));
    }
}
