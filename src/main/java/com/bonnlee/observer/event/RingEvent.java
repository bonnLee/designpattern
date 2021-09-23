package com.bonnlee.observer.event;

public class RingEvent {

    private static final long serialVersionUID = 1L;
    private boolean sound;    //true表示上课铃声,false表示下课铃声

    public RingEvent(RingSource ringSource,boolean sound) {
        this.sound = sound;
    }

    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}
