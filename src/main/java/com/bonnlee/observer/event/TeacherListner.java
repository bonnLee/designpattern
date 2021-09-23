package com.bonnlee.observer.event;

public class TeacherListner implements RingListner {
    @Override
    public void heard(RingEvent event) {
        event.setSound(false);
        if(event.isSound()) System.out.println("老师们听到了铃声。。准备开始讲课");
        else System.out.println("下课铃响了。。老师准备拖堂。。");
    }
}
