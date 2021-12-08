package com.bonnlee.flyweight;



import cn.hutool.core.bean.BeanUtil;

import java.util.HashMap;
import java.util.Map;

public class CirclePool {
    public static Map<Double, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(Double radius){
        Circle target = circleMap.get(radius);
        if(BeanUtil.isNotEmpty(target)) return target;
        Circle circle = new Circle(radius);
        circleMap.put(radius,circle);
        return circle;
    }
}
