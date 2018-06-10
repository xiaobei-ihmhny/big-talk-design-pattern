package com.xiaobei.design_pattern.simple_factory;

/**
 * @author: xiaobei
 * @createTime: 2018-06-10 22:56
 * @since: JDK 1.8
 * @description: 计算器
 */
public class Program {

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("/");
        operation.setNumberA((double) 1);
        operation.setNumberB((double) 0);
        Object result = null;
        try {
            result = operation.getResult();
        } catch (Exception e) {
            System.out.println("发生错误：" + e.getMessage());
            return;
        }
        System.out.println("计算结果为：" + result);

    }

}
