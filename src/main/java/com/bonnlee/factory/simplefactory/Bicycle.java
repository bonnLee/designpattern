package com.bonnlee.factory.simplefactory;

public class Bicycle implements Moveable {
    @Override
    public void move() {
        System.out.println("A Bicycle passed on");
    }
}
