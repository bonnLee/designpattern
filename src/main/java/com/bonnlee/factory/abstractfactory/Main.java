package com.bonnlee.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory modernFactory = new ModernFactory();
        Food modernFood = modernFactory.createFood();
        Vehicle modernVehicle = modernFactory.createVehicle();
        Weapon modernWeapon = modernFactory.createWeapon();
        modernFood.taste();
        modernVehicle.move();
        modernWeapon.kill();
    }
}
