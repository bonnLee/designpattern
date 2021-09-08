package com.bonnlee.singleton;

import com.bonnlee.singleton.model.Student;

public enum  Manager8 {

    /*
    枚举单利模式，effectiveJava作者推荐，最高效最安全，并且避免了反射和反序列化
     */

    INSTANCE;

    private Student student;

    Manager8() {
        student = new Student();
    }

    public Student getStudent(){
        return student;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            new Thread(() -> System.out.println(Manager8.INSTANCE.getStudent().hashCode()) ).start();
//        }
        String str = "\r\n\r\n";
        System.out.println(str);
    }




}
