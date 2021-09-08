package com.bonnlee.strategy.abnormal;


//price策略root接口
public interface PriceStragegy {
    /**
     * @param originalPrice 原始价格
     * @return  计算后的价格
     */
    double calculationPrice(double originalPrice);
}
