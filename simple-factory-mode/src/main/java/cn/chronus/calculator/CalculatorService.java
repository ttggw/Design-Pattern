package cn.chronus.calculator;

/**
 * calculatorService 计算器业务类
 *
 * @author chronus
 * @since v1.0
 */
public class CalculatorService {

    /**
     * 计算
     * @param numberA 操作数1
     * @param numberB 操作数2
     * @param operate 操作符
     * @return 结果
     * @author chronus
     * @since v1.0
     */
    public double calculate(double numberA, double numberB, String operate) {
        Operation operation;
        operation = OperationFactory.createOperate(operate);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        return operation.getResult();
    }
}
