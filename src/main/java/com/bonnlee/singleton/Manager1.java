package com.bonnlee.singleton;

public class Manager1 {
    /*
    hungry饿汉式单例模式
    类加载到内存中后，会直接实例化一个单利，
    简单实用，推荐！
    唯一缺点：类加载时直接实例化，但（如果不使用，干嘛要装载呢？）
     */

    public static final Manager1 instance = new Manager1();

    private Manager1() {
    }

    public static Manager1 geteInstance(){
        return instance;
    }

}
