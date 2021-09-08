package com.bonnlee.singleton;

public class Manager2 {

    /*
    同1，只是实例化放在静态代码块中
     */

    public static final Manager2 instance ;

    static {
        instance = new Manager2();
    }

    private Manager2() {
    }

    public static Manager2 getInstance(){
        return instance;
    }


}
