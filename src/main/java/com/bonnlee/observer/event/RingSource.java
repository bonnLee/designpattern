package com.bonnlee.observer.event;

import java.util.ArrayList;
import java.util.List;

/*
 事件 源 - 铃声
 */
public class RingSource {
    private List<RingListner> listners;

    public RingSource() {
        listners = new ArrayList<>();
    }

    public void addListner(RingListner ringListner){
        listners.add(ringListner);
    }

    public void ring(boolean sound){
        String type = sound ? "上课铃" : "下课铃" ;
        System.out.println(type+"响" + "\r\n\r\n");
        RingEvent ringEvent = new RingEvent(this, sound);
        notify(ringEvent);
    }

    protected void notify(RingEvent event){
        listners.forEach(listener -> {
            listener.heard(event);
        });
    }
}
