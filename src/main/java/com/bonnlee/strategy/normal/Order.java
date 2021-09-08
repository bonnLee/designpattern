package com.bonnlee.strategy.normal;

import lombok.Data;

@Data
public class Order {
    /*
    学习贴：https://www.cnblogs.com/qdhxhz/p/12961182.html
    正常情况是交给Spring管理的，以电商系统-订单为例实现简单的策略模式
    订单实体类
     */

    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 订单编号
     */
    private String orderNumber;
    /**
     * 购买数量
     */
    private Integer goodsNumber;
    /**
     * 订单运费
     */
    private Double orderFreight;
    /**
     * 订单总价(订单价格 + 运费)
     */
    private Double orderPrice;
    /**
     * 活动类型 1、包邮 2、满减送 3、限时折扣
     */
    private String activityType;
    /**
     * 活动ID
     */
    private String activityId;

}
