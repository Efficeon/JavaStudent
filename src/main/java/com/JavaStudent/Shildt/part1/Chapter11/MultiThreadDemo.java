package com.JavaStudent.Shildt.part1.Chapter11;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread03("Один");
        new NewThread03("Два");
        new NewThread03("Три");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
