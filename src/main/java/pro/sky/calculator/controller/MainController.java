package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class MainController {

    private final CalculatorService calculatorService;

    public MainController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showGreeting() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String showPlusOperation(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.showPlusOperation(num1, num2);
    }

    @GetMapping("/minus")
    public String showMinusOperation(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.showMinusOperation(num1, num2);
    }

    @GetMapping("/multiply")
    public String showMultiplyOperation(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.showMultiplyOperation(num1, num2);
    }

    @GetMapping("/divide")
    public String showDivisionOperation(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.showDivisionOperation(num1, num2);
    }

}
