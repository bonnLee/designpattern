package com.bonnlee.factory.abstractfactory;

public class Hamburger extends Food {

    @Override
    public void taste() {
        System.out.println("It tastes delicious!");
    }

    void waste(){
        System.out.println("Don't waste your hamburger!");
    }

}
