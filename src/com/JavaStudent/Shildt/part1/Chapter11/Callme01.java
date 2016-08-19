package com.JavaStudent.Shildt.part1.Chapter11;

public class Callme01 {
   void call(String msg){
        System.out.print("["+ msg);
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}
