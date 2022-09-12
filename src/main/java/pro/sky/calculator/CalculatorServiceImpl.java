package pro.sky.calculator;

import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceImpl implements CalculatorService {

//1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".
    public String calculator(){
        return "Добро пожаловать в калькулятор";
    }
    //2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате “5 + 5 = 10”.
    public String plusCalculator(String num1, String num2){
        return num1 + "+" + num2 + "=" + (Integer.parseInt(num1)+Integer.parseInt(num2));
    }
//3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате “5 − 5 = 0”.
    public String minusCalculator(String num1, String num2){
        return num1 + "-" + num2 + "=" + (Integer.parseInt(num1)-Integer.parseInt(num2));
    }
//4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате “5 * 5 = 25”.
    public String multiplyCalculator(String num1, String num2){
        return num1 + "*" + num2 + "=" + (Integer.parseInt(num1)*Integer.parseInt(num2));
    }
//5. Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате “5 / 5 = 1”.
    public String divideCalculator(String num1, String num2){
        if(num1!=null&&num2!=null) {
            if (Integer.parseInt(num2) != 0) {
                return num1 + ":" + num2 + "=" + (Double.parseDouble(num1) / Double.parseDouble(num2));
            } else {
                return "На 0 делить нельзя";
            }
        }else{
        return "Задайте числа для деления";
    }
    }
}
