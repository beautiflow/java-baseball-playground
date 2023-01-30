package study;

import PlayGround.firstTest.Calculator;
import PlayGround.stringCalculator.StringCalculator;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();


    @Test
    @DisplayName("더하기 테스트")
    public void addTest(){
        assertEquals(7, stringCalculator.add(3,4));
    }

    @Test
    @DisplayName("빼기 테스트")
    public void subtractTest(){
        assertEquals(1, stringCalculator.subtract(5,4));
    }

    @Test
    @DisplayName("곱하기 테스트")
    public void multiplyTest(){
        assertEquals(6, stringCalculator.multiply(2,3));
    }

    @Test
    @DisplayName("나누기 테스트")
    public void divideTest(){
        assertEquals(2, stringCalculator.divide(8,4));
    }

    @Test
    @DisplayName("문자열 계산")
     public void stringCalculateTest(){
        int a = stringCalculator.stringCalculate("2 + 3 * 4 / 2");
        assertThat(a).isEqualTo(10);
    }


}
