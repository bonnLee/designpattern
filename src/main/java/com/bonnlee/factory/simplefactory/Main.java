package com.bonnlee.factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        Moveable vehicleCar = CarFactory.INSTANCE.create();
        Moveable vehicleBicycle = BicycleFactory.INSTANCE.create();
        vehicleCar.move();
        vehicleBicycle.move();
    }
}
