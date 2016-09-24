package com.JavaStudent.Shildt.part1.Chapter11;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread04 ob1 = new NewThread04("Один");
        NewThread04 ob2 = new NewThread04("Два");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока Один.");
            Thread.sleep(1000);
            ob1.muresume();
            System.out.println("Возобновление потока Один.");
            Thread.sleep(1000);
            ob2.mysuspend();
            System.out.println("Приостановка потока Два.");
            Thread.sleep(1000);
            ob2.muresume();
            System.out.println("Возобновление потока Два.");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }

        try {
            System.out.println("Ожидание завершения потоков");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }


}
