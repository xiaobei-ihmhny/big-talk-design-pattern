package com.xiaobei.design_pattern.strategy_model;

import com.xiaobei.design_pattern.strategy_model.v1_0.CashRegister;
import org.junit.Test;

/**
 * @author: xiaobei
 * @createTime: 2018-06-11 21:54
 * @since: JDK 1.8
 * @description: 主程序
 */
public class Program {

    @Test
    public void testV1_0() {
        CashRegister cashRegister = new CashRegister();
        String unitPrice1 = "2.0";
        String count1 = "2";
        cashRegister.okClick(unitPrice1,count1);
        String unitPrice2 = "2.5";
        String count2 = "3";
        cashRegister.okClick(unitPrice2,count2);
    }
}
