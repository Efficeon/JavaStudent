package com.JavaStudent.Shildt.part1.Chapter09;

public class Client {
    public void callback(int p) {
        System.out.println("Метод callback() вызываемый со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("В классах реализующих интерфейсы " +  "могут определяться и другие члены");
    }
}
