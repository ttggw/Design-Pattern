package cn.chronus.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * CalculatorService UT
 *
 * @author chronus
 * @since v1.0
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

    @InjectMocks
    private CalculatorService calculatorService;

    /**
     * 测试加法 UT
     *
     * @author chronus
     * @since v1.0
     */
    @Test
    public void calculateAddTest() {
        double numberA = 8.0d;
        double numberB = 7.21d;
        double target = numberA + numberB;
        String operate = "+";
        double result = calculatorService.calculate(numberA, numberB, operate);
        assertThat(result, equalTo(target));
    }

    /**
     * 测试减法 UT
     *
     * @author chronus
     * @since v1.0
     */
    @Test
    public void calculateSubTest() {
        double numberA = 8.0d;
        double numberB = 7.21d;
        double target = numberA - numberB;
        String operate = "-";
        double result = calculatorService.calculate(numberA, numberB, operate);
        assertThat(result, equalTo(target));
    }

    /**
     * 测试乘法 UT
     *
     * @author chronus
     * @since v1.0
     */
    @Test
    public void calculateMulTest() {
        double numberA = 8.0d;
        double numberB = 7.21d;
        double target = numberA * numberB;
        String operate = "*";
        double result = calculatorService.calculate(numberA, numberB, operate);
        assertThat(result, equalTo(target));
    }

    /**
     * 测试除法 UT
     *
     * @author chronus
     * @since v1.0
     */
    @Test
    public void calculateDivTest() {
        double numberA = 8.0d;
        double numberB = 7.21d;
        double target = numberA / numberB;
        String operate = "/";
        double result = calculatorService.calculate(numberA, numberB, operate);
        assertThat(result, equalTo(target));
    }

    /**
     * 测试除数为0的情况 UT
     *
     * @author chronus
     * @since v1.0
     */
    @Test
    public void calculateDivZeroTest() {
        double numberA = 8.0d;
        double numberB = 0.0d;
        String operate = "/";
        try{
            calculatorService.calculate(numberA, numberB, operate);
        } catch (Exception ex) {
            assertThat(ex, instanceOf(ArithmeticException.class));
            assertThat(ex.getMessage(), equalTo("除数不能为0！"));
        }
    }

    /**
     * 测试非法操作符的情况 UT
     *
     * @author chronus
     * @since v1.0
     */
    @Test
    public void calculateIllegalOperate() {
        double numberA = 8.0d;
        double numberB = 7.21d;
        String operate = "%";
        try {
            calculatorService.calculate(numberA, numberB, operate);
        } catch (Exception ex) {
            assertThat(ex, instanceOf(RuntimeException.class));
            assertThat(ex.getMessage(), equalTo("非法操作！"));
        }

    }
}
