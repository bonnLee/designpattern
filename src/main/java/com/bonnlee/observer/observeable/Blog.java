package com.bonnlee.observer.observeable;

import lombok.Data;

import java.util.Observable;

@Data
public class Blog extends Observable {
    private String url;

    private String content;

    public void publish(String url,String content){
        this.url = url;
        this.content = content;
        super.setChanged();
        super.notifyObservers();
    }
}
