package com.xiaobei.design_pattern.simple_factory;

/**
 * @author: xiaobei
 * @createTime: 2018-06-10 23:13
 * @since: JDK 1.8
 * @description: 减法运算
 */
public class OperationSub extends Operation<Double> {

    @Override
    Double getResult() {
        return getNumberA() - getNumberB();
    }
}
