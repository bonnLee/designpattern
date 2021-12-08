package com.bonnlee.proxy.staticproxy;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
//        new PersonEatTimeProxy(new PersonEatLogProxy(person)).eat();
        new PersonEatTimeProxy(person).eat();
    }
}
