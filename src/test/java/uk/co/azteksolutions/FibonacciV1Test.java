package uk.co.azteksolutions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Asif Akhtar
 * 09/05/2020 14:12
 */
class FibonacciV1Test {

    static Stream<Arguments> shouldFindPositionInArray() {
        return Stream.of(
                findFibonacciSequence(1, 1),
                findFibonacciSequence(2, 1),
                findFibonacciSequence(3, 2),
                findFibonacciSequence(4, 3)
        );
    }

    private static Arguments findFibonacciSequence(int position, int expected) {
        return Arguments.of("find item in position " + position, position, expected);
    }

    @DisplayName("should find the nth fibonacci value")
    @MethodSource
    @ParameterizedTest(name = "{0}")
    void shouldFindPositionInArray(String description, int nthPosition, int expectedValue) {
        int position = new FibonacciV1().nthFibonacciTerm(nthPosition);
        assertEquals(expectedValue, position);
    }
}