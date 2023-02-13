package pro.sky.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplParameterizedTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldSumCorrectly(int a, int b) {
        String result = out.showPlusOperation(a, b);
        assertEquals(PLUS_VALUE_FIRST_CASE, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldMinusCorrectly(int a, int b) {
        String result = out.showMinusOperation(a, b);
        assertEquals(MINUS_VALUE_FIRST_CASE, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldMultiplyCorrectly(int a, int b) {
        String result = out.showMultiplyOperation(a, b);
        assertEquals(MULTIPLY_VALUE_FIRST_CASE, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldDivideCorrectly(int a, int b) {
        String result = out.showDivisionOperation(a, b);
        assertEquals(DIVISION_VALUE_FIRST_CASE, result);
    }


    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(FIRST_VALUE, SECOND_VALUE)
                );
    }
}