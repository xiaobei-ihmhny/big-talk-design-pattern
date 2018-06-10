package com.xiaobei.design_pattern.simple_factory;

/**
 * @author: xiaobei
 * @createTime: 2018-06-10 22:44
 * @since: JDK 1.8
 * @description: 运算类
 */
abstract class Operation<T> {

    private Double numberA;

    private Double numberB;

    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }

    abstract T getResult() throws Exception;
}
