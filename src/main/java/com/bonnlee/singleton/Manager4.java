package com.bonnlee.singleton;

public class Manager4 {

    /*
    对比3，在获取实例的方法上加上synchronized
    能够保证线程安全，但是效率会变得很低
     */

    public static Manager4 instance;

    private Manager4() {
    }

    public synchronized static Manager4 getInstance(){
        if (instance == null){
            instance = new Manager4();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Manager4.getInstance().hashCode())).start();
        }
    }
}
