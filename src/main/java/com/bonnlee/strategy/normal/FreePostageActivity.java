package com.bonnlee.strategy.normal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FreePostageActivity implements ActivityStrategy {
    @Override
    public Order calculatePrice(Order order) {
        //包邮活动是一个大的主题 ,里面可以创建很多小活动 比如价格满100包邮活动,或者满2件以上包邮活动，江浙沪包邮活动等等
        //如果这里通过活动ID获取用户具体选择了哪一个活动。
        String activityId = order.getActivityId();
        Double postage = 0D;
        //查询数据库
        if (activityId.startsWith("1")){
            System.out.println("模拟查询数据库 ，当前的活动是满100包邮");
            //包邮 邮费不做操作
        }else{
            System.out.println("模拟查询数据库 ，当前活动不包邮");
            //再根据业务 匹配对应的 发货地 到 签收地的运费
            postage = 8D;
        }
        order.setOrderFreight(postage);
        return order;
    }
}
