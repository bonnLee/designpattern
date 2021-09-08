package com.bonnlee.factory.simplefactory;

public enum  BicycleFactory {
    INSTANCE;

    public Bicycle create(){
        return new Bicycle();
    }
}
