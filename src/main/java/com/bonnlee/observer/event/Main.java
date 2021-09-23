package com.bonnlee.observer.event;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RingSource ringSource = new RingSource();
        ringSource.addListner(new StudentListner());
        ringSource.addListner(new TeacherListner());

        ringSource.ring(true);
//        System.out.println("==================");
//        Thread.sleep(2000);
//        ringSource.ring(false);
    }
}
