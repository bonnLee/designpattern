package com.bonnlee.proxy.staticproxy;

import java.util.Random;

public class Person implements Behavior {
    @Override
    public void eat() {

        try {
            //模拟 进食 业务
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("吃完了");
    }
}
