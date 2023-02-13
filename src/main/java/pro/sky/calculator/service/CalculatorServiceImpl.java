package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exception.DivisionByZeroException;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String showPlusOperation(int number1, int number2) {
        int result = number1 + number2;
        return number1 + " + " + number2 + " = " + result;
    }

    @Override
    public String showMinusOperation(int number1, int number2) {
        int result = number1 - number2;
        return number1 + " - " + number2 + " = " + result;
    }

    @Override
    public String showMultiplyOperation(int number1, int number2) {
        int result = number1 * number2;
        return number1 + " * " + number2 + " = " + result;
    }

    @Override
    public String showDivisionOperation(int number1, int number2) {
        if(number2 == 0) {
            throw new DivisionByZeroException("The wrong number. Please, enter another second number, zero is illegal argument");
        }
        int result = number1 / number2;
        return number1 + " / " + number2 + " = " + result;
    }

}
