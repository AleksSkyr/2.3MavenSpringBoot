package pro.sky.calculator;

import homework.pro.sky.my.homework.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(name = "num1)") Integer a,
                       @RequestParam(name = "num2") Integer b) {
        return a + " - " + b + " = " + calculatorServis.plus(a, b);

    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(name = "num1)") Integer a,
                        @RequestParam(name = "num2") Integer b) {
        return a + " - " + b + " = " + calculatorServis.minus(a, b);

    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(name = "num1)") Integer a,
                           @RequestParam(name = "num2") Integer b) {
        return a + " - " + b + " = " + calculatorServis.multiply(a, b);

    }
//    1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".
//
//            2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате “5 + 5 = 10”.
//
//            3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате “5 − 5 = 0”.
//
//            4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате “5 * 5 = 25”.
//
//            5. Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате “5 / 5 = 1”.
}
