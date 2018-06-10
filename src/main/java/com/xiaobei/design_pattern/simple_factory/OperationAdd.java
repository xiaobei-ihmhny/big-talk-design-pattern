package com.xiaobei.design_pattern.simple_factory;

/**
 * @author: xiaobei
 * @createTime: 2018-06-10 22:48
 * @since: JDK 1.8
 * @description: 加法运算
 */
public class OperationAdd extends Operation<Double> {

    @Override
    Double getResult() {
        return getNumberA()+getNumberB();
    }
}
