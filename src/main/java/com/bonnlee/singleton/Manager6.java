package com.bonnlee.singleton;

public class Manager6 {

    /*
    对比5，缩小同步代码块的同时，进行双判断
     */

    public static Manager6 instance;

    private Manager6() {
    }

    public  static Manager6 getInstance(){
        if (instance == null){
            synchronized (Manager6.class){
                if (instance == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Manager6();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Manager6.getInstance().hashCode())).start();
        }
    }
}
