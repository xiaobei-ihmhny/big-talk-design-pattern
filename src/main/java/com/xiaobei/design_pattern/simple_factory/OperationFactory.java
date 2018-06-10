package com.xiaobei.design_pattern.simple_factory;

/**
 * @author: xiaobei
 * @createTime: 2018-06-10 22:50
 * @since: JDK 1.8
 * @description: 运算工厂类
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation operation = null;
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
                operation = new OperationError();
                break;
        }
        return operation;
    }

}
