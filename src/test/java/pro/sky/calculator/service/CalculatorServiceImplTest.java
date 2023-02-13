package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.exception.DivisionByZeroException;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnTheExpectedStringForPlusOperationFirstCase() {
        String result = out.showPlusOperation(FIRST_VALUE, SECOND_VALUE);
        assertEquals(PLUS_VALUE_FIRST_CASE,result);
    }

    @Test
    public void shouldReturnTheExpectedStringForPlusOperationSecondCase() {
        String result = out.showPlusOperation(THIRD_VALUE, FOURTH_VALUE);
        assertEquals(PLUS_VALUE_SECOND_CASE,result);
    }

    @Test
    public void shouldReturnTheExpectedStringForMinusOperationFirstCase() {
        String result = out.showMinusOperation(FIRST_VALUE, SECOND_VALUE);
        assertEquals(MINUS_VALUE_FIRST_CASE,result);
    }

    @Test
    public void shouldReturnTheExpectedStringForMinusOperationSecondCase() {
        String result = out.showMinusOperation(THIRD_VALUE, FOURTH_VALUE);
        assertEquals(MINUS_VALUE_SECOND_CASE,result);
    }

    @Test
    public void shouldReturnTheExpectedStringForMultiplyOperationFirstCase() {
        String result = out.showMultiplyOperation(FIRST_VALUE, SECOND_VALUE);
        assertEquals(MULTIPLY_VALUE_FIRST_CASE,result);
    }

    @Test
    public void shouldReturnTheExpectedStringForMultiplyOperationSecondCase() {
        String result = out.showMultiplyOperation(THIRD_VALUE, FOURTH_VALUE);
        assertEquals(MULTIPLY_VALUE_SECOND_CASE,result);
    }

    @Test
    public void shouldReturnTheExpectedStringForDivisionOperationFirstCase() {
        String result = out.showDivisionOperation(FIRST_VALUE, SECOND_VALUE);
        assertEquals(DIVISION_VALUE_FIRST_CASE,result);
    }

    @Test
    public void shouldReturnTheExpectedStringForDivisionOperationSecondCase() {
        String result = out.showDivisionOperation(THIRD_VALUE, FOURTH_VALUE);
        assertEquals(DIVISION_VALUE_SECOND_CASE,result);
    }

    @Test
    public void shouldThrowDivisionByZeroException() {
        assertThrows(DivisionByZeroException.class, () -> out.showDivisionOperation(FIRST_VALUE, THIRD_VALUE));
    }


}