package com.bonnlee.strategy.normal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class ActivityContext {

    @Autowired
    FreePostageActivity freePostageActivity;

    @Autowired
    FullDeliveryActivity fullDeliveryActivity;

    @Autowired
    LimitDisCountActivity limitDisCountActivity;

    private static final Map<String, ActivityStrategy> activityStrategyMap = new HashMap<>();

    /**
     * 初始化 把这几个活动的示例 初始化的时候就装到一个map集合中
     */
    @PostConstruct
    public void init() {
        //1、包邮 2、满减送 3、限时折扣
        activityStrategyMap.put(ActivityTypeEnum.FreePostage.getCode(), freePostageActivity);
        activityStrategyMap.put(ActivityTypeEnum.FullDelivery.getCode(), fullDeliveryActivity);
        activityStrategyMap.put(ActivityTypeEnum.LimitDisCount.getCode(), limitDisCountActivity);
    }

    //计算价格
    public Order calculate(Order order){
        //匹配map中的活动类型
        ActivityStrategy stragegy = activityStrategyMap.get(order.getActivityType());
        //多态 分具体类型计算
        stragegy.calculatePrice(order);
        return order;
    }

}
