package com.xiaobei.design_pattern.simple_factory;

/**
 * @author: xiaobei
 * @createTime: 2018-06-10 23:14
 * @since: JDK 1.8
 * @description: 除法运算
 */
public class OperationDiv extends Operation<Double> {

    @Override
    Double getResult() throws Exception {
        Double zero = Double.valueOf(0);
        if(zero.equals(getNumberB())){
            throw new Exception("除数不能为0.");
        }
        return getNumberA() / getNumberB();
    }
}
