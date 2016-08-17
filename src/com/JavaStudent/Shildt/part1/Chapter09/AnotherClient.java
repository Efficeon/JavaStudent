package com.JavaStudent.Shildt.part1.Chapter09;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Еще один вариант метода callback() ");
        System.out.println("p в квадрате равно " + (p*p));
    }
}
