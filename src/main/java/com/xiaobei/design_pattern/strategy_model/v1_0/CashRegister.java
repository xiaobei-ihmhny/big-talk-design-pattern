package com.xiaobei.design_pattern.strategy_model.v1_0;

/**
 * @author: xiaobei
 * @createTime: 2018-06-11 21:53
 * @since: JDK 1.8
 * @description: 收银核心代码
 */
public class CashRegister {

    private double total;

    /**
     * 计算每一种商品的价格
     * @param _unitPrice
     * @param _count
     */
    public void okClick(String _unitPrice, String _count){
        Double unitPrice = Double.valueOf(_unitPrice);
        int count = Integer.valueOf(_count);
        double totalPrices = unitPrice*count;
        total += totalPrices;
        System.out.println("单价：" + unitPrice + " 数量：" + count + " 合计：" + totalPrices);
        System.out.println("当前总计为：" + total);
    }

}
