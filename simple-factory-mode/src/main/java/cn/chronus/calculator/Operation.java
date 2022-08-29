package cn.chronus.calculator;

/**
 * 超类 运算类
 *
 * @author chronus
 * @since v1.0
 */
public class Operation {
    public static final double ZERO = 0.0d;
    private double numberA;
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    /**
     * 获取结果
     *
     * @return double 结果
     * @author chronus
     * @since v1.0
     */
    public double getResult() {
        return 0.0d;
    }
}

/**
 * 加法类，继承 Operation 类，定义加法
 *
 * @author chronus
 * @since v1.0
 */
class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return this.getNumberA() + this.getNumberB();
    }
}

/**
 * 减法类，继承 Operation 类，定义减法
 *
 * @author chronus
 * @since v1.0
 */
class OperationSub extends Operation {
    @Override
    public double getResult() {
        return this.getNumberA() - this.getNumberB();
    }
}

/**
 * 乘法类，继承 Operation 类，定义乘法
 *
 * @author chronus
 * @since v1.0
 */
class OperationMul extends Operation {
    @Override
    public double getResult() {
        return this.getNumberA() * this.getNumberB();
    }
}

/**
 * 除法类，继承 Operation 类，定义除法
 *
 * @author chronus
 * @since v1.0
 */
class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if (this.getNumberB() - ZERO == ZERO) {
            throw new ArithmeticException("除数不能为0！");
        }
        return this.getNumberA() / this.getNumberB();
    }
}

