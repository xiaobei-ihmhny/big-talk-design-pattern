package com.xiaobei.design_pattern.simple_factory;

/**
 * @author: xiaobei
 * @createTime: 2018-06-10 23:01
 * @since: JDK 1.8
 * @description: 暂时不支持的运算
 */
public class OperationError extends Operation<String> {

    @Override
    String getResult() {
        return "暂时不支持该操作";
    }
}
