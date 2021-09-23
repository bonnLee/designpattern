package com.bonnlee.observer.observeable;

public class Main {
    public static void main(String[] args) {
        Blog blog = new Blog();
        blog.addObserver(new Reader("老二"));
        blog.addObserver(new Reader("金标"));
        blog.addObserver(new Reader("水根"));
        blog.publish("www.baidu.com","今日多云转晴");
    }
}
