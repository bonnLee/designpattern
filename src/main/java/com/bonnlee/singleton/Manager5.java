package com.bonnlee.singleton;

public class Manager5 {

    /*
    对比4，缩小synchronized的范围来提升效率,引出线程不安全
     */

    public static Manager5 instance;

    private Manager5() {
    }

    public  static Manager5 getInstance(){
        if (instance == null){
            synchronized (Manager5.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance = new Manager5();
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Manager5.getInstance().hashCode())).start();
        }
    }
}
