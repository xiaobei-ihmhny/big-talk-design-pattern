package com.xiaobei.design_pattern.strategy_model.v1_1;

/**
 * @author: xiaobei
 * @createTime: 2018-06-11 21:53
 * @since: JDK 1.8
 * @description: 收银核心代码
 */
public class CashRegisterV1_1 {

    private double total;

    static {

    }

    /**
     * 计算每一种商品的价格
     * @param _unitPrice
     * @param _count
     * @param key
     */
    public void okClick(String _unitPrice, String _count, String key){
        Double unitPrice = Double.valueOf(_unitPrice);
        int count = Integer.valueOf(_count);
        switch (key) {

        }
    }

}
