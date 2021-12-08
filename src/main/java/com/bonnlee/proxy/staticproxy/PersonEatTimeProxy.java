package com.bonnlee.proxy.staticproxy;

public class PersonEatTimeProxy implements Behavior {

    Behavior behavior;

    public PersonEatTimeProxy(Behavior behavior) {
        this.behavior = behavior;
    }

    @Override
    public void eat() {
        long pre = System.currentTimeMillis();
        System.out.println("current:"+pre);
        behavior.eat();
        long after = System.currentTimeMillis();
        System.out.println("这个person，eat了"+(after-pre)+"ms");
    }
}
