package com.bonnlee.strategy.normal;

public interface ActivityStrategy {
    /*
    活动策略接口
     */
    Order calculatePrice(Order order);
}
