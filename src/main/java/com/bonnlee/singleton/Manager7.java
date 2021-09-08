package com.bonnlee.singleton;

public class Manager7 {

    /*
    静态内部类写法
    JVM保证线程安全
    加载外部类时不会加载内部类，可以实现懒加载
     */

    private Manager7() {
    }

    private static class instanceHolder{
        private static final Manager7 instance = new Manager7();
    }

    private static Manager7 getInstance(){
        return instanceHolder.instance;
    }



    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Manager7.getInstance().hashCode())).start();
        }
    }
}
