package pro.sky.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


public class CalculatorServiceTest {
    private final CalculatorService calculatorServiceImpl = new CalculatorServiceImpl();

    @Test
    public void minusCalculatorTest(){
        String actual = calculatorServiceImpl.minusCalculator("4", "8");
        assertThat(actual).isEqualTo("4-8=-4");

        actual = calculatorServiceImpl.minusCalculator("8", "4");
        assertThat(actual).isEqualTo("8-4=4");

        actual = calculatorServiceImpl.minusCalculator("-8", "4");
        assertThat(actual).isEqualTo("-8-4=-12");
    }

    @Test
    public void plusCalculatorTest(){
        String actual = calculatorServiceImpl.plusCalculator("9", "7");
        assertThat(actual).isEqualTo("9+7=16");

        actual = calculatorServiceImpl.plusCalculator("-9", "7");
        assertThat(actual).isEqualTo("-9+7=-2");
    }

    @Test
    public void multiplyCalculatorTest(){
        String actual = calculatorServiceImpl.multiplyCalculator("2", "3");
        assertThat(actual).isEqualTo("2*3=6");

        actual = calculatorServiceImpl.multiplyCalculator("-2", "3");
        assertThat(actual).isEqualTo("-2*3=-6");
    }

    @Test
    public void divideCalculatorPositiveTest(){
        String actual = calculatorServiceImpl.divideCalculator("6", "3");
        assertThat(actual).isEqualTo("6:3=2.0");

        actual = calculatorServiceImpl.divideCalculator("-6", "-3");
        assertThat(actual).isEqualTo("-6:-3=2.0");

        actual = calculatorServiceImpl.divideCalculator("-6", "3");
        assertThat(actual).isEqualTo("-6:3=-2.0");

        actual = calculatorServiceImpl.divideCalculator("6", "-3");
        assertThat(actual).isEqualTo("6:-3=-2.0");
    }

    @Test
    public void divideCalculatorNegativeTest() {
        assertThatExceptionOfType(DivideByZeroException.class)
                .isThrownBy(() ->calculatorServiceImpl.divideCalculator("6", "0"))
                .withMessage("На 0 делить нельзя");
    }
}
