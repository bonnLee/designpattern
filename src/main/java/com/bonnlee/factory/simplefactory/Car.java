package com.bonnlee.factory.simplefactory;

import lombok.Data;

@Data
public class Car implements Moveable {

    @Override
    public void move() {
        System.out.println("A car goes by");
    }

}
