package com.bonnlee.factory.abstractfactory;

public class ModernFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Hamburger();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
