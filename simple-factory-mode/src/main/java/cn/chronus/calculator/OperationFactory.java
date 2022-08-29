package cn.chronus.calculator;

/**
 * Operation工厂类，提供operation的实例化
 *
 * @author chronus
 * @since v1.0
 */
public class OperationFactory {

    /**
     * 根据传入的参数实例化operate
     *
     * @param operate 参数，操作符号
     * @return Operation 实例
     * @author chronus
     * @since v1.0
     */
    public static Operation createOperate(String operate) {
        Operation operation;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("非法操作！");
        }
        return operation;
    }
}
