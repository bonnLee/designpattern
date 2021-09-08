package com.bonnlee.factory.abstractfactory;

public class Car extends Vehicle{
    @Override
    void move() {
        System.out.println("A car goes by!");
    }
}
