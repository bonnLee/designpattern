package com.bonnlee.singleton;

public class Manager3 {

    /*
    lazy懒汉式单例模式
    类加载到内存中后，不会直接实例化一个单利，
    而是等到调用时再进行实例化；
    虽然达到了按需初始化的要求，但是同时引来线程不安全
     */

    public static Manager3 instance;

    private Manager3() {
    }

    public static Manager3 getInstance(){
        if (instance == null){
            instance = new Manager3();
        }
        return instance;
    }


}
