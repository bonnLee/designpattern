package com.bonnlee.observer.observeable;

import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        recieveMessage(o);
    }

    private void recieveMessage(Observable o){
        Blog blog = (Blog) o;
        String url = blog.getUrl();
        String content = blog.getContent();
        System.out.println(name+"接收到来自"+url+"的消息："+content);
    }
}
