package com.bonnlee.proxy.staticproxy;

public class PersonEatLogProxy implements Behavior {

    Behavior behavior;

    public PersonEatLogProxy(Behavior behavior) {
        this.behavior = behavior;
    }

    @Override
    public void eat() {
        System.out.println("日志输出：======   开吃");
        behavior.eat();

    }
}
