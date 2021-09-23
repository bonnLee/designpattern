package com.bonnlee.observer.event;

public class StudentListner implements RingListner {
    @Override
    public void heard(RingEvent event) {
        if(event.isSound()) System.out.println("学生们听到了铃声。。开始认真上课");
        else System.out.println("下课铃响了。。休息一下");
    }
}
