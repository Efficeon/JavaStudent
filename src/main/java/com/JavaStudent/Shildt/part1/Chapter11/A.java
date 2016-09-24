package com.JavaStudent.Shildt.part1.Chapter11;

public class A {
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();

        System.out.println(name + "Вошел в метод A.foo()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс А прерван");
        }
        System.out.println(name + " пытается вызвать метод B.last()");
        b.last();
    }
    synchronized void last(){
        System.out.println("В методе A.last()");
    }
}
