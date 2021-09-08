package com.bonnlee.factory.simplefactory;

public enum CarFactory {
    INSTANCE;

    public Car create(){
        return new Car();
    }
}
