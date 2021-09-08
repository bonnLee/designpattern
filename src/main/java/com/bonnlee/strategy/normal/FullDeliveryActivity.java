package com.bonnlee.strategy.normal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FullDeliveryActivity implements ActivityStrategy {

    /*
    满减活动
     */
    @Override
    public Order calculatePrice(Order order) {
        //这里通过活动ID获取用户具体选择了哪一个活动。
        String activityId = order.getActivityId();
        //查询数据库
        log.info("模拟查询数据库 ，当前的活动是满100减20的");
        if (order.getOrderPrice() > 100) {
            order.setOrderPrice(order.getOrderPrice() - 20);
        }
        return order;
    }
}
