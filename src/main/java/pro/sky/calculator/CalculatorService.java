package pro.sky.calculator;

public interface CalculatorService {
    String calculator();

    String minusCalculator(String num1, String num2);

    String plusCalculator(String num1, String num2);

    String multiplyCalculator(String num1, String num2);

    String divideCalculator(String num1, String num2);
}
