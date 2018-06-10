package com.xiaobei.design_pattern.simple_factory;

/**
 * @author: xiaobei
 * @createTime: 2018-06-10 23:14
 * @since: JDK 1.8
 * @description: 乘法运算
 */
public class OperationMul extends Operation<Double> {

    @Override
    Double getResult() {
        return getNumberA() * getNumberB();
    }
}