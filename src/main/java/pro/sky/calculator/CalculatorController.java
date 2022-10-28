package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService=calculatorService;
    }
    @GetMapping(path = "calculator")
    public String calculator(){
        return calculatorService.calculator();
    }

    @GetMapping(path = "calculator/plus")
    public String plusCalculator(String num1, String num2){
         if(num1!=null&&num2!=null&&num1.equals("")&&num2.equals("")) {
             return calculatorService.minusCalculator(num1, num2);
         }else{
             return "Задайте числа для вычитания";
         }
     }
//    public String plusCalculator(@RequestParam (value = "num1", required = false ) Integer a,
//                                 @RequestParam (value = "num2", required = false ) Integer b){
//        if(Objects.isNull(a)||Objects.isNull(b)) {
//            return buildResulte(a, b, calculatorService.plusCalculator(a, b),"+");
//        }else{
//            return "Задайте числа для сложения";
//        }
//    }
    @GetMapping(path = "calculator/minus")
    public String minusCalculator(String num1, String num2){
        if(num1!=null&&num2!=null&&num1.equals("")&&num2.equals("")) {
            return calculatorService.minusCalculator(num1, num2);
        }else{
            return "Задайте числа для вычитания";
        }
    }
    @GetMapping(path = "calculator/multiply")
    public String multiplyCalculator(String num1, String num2){
        if(num1!=null&&num2!=null&&num1.equals("")&&num2.equals("")) {
            return calculatorService.multiplyCalculator(num1, num2);
        }else{
            return "Задайте числа для умножения";
        }
    }
    @GetMapping(path = "calculator/divide")
    public String divideCalculator(String num1, String num2){
        if(num1!=null&&num2!=null&&num1.equals("")&&num2.equals("")) {
            return calculatorService.divideCalculator(num1, num2);
        }else{
            return "Задайте числа для деления";
        }
    }
}
