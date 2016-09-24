package com.JavaStudent.Shildt.part1.Chapter11;

public class Syncl01 {
    public static void main(String[] args) {
        Callme01 target = new Callme01();
        Caller01 ob1 = new Caller01(target, "Добро пожаловать");
        Caller01 ob2 = new Caller01(target, "в синхронизированный");
        Caller01 ob3 = new Caller01(target, "мир!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}
