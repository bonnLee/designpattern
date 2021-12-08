package com.bonnlee.flyweight;

public class Main {
    public static void main(String[] args) {
        System.out.println(CirclePool.getCircle(1.25) == CirclePool.getCircle(1.25));
        System.out.println(CirclePool.getCircle(1.88));
    }
}
