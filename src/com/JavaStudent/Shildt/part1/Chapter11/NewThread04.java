package com.JavaStudent.Shildt.part1.Chapter11;

public class NewThread04 implements Runnable{
    String name;
    Thread t;
    boolean suspendFlaf;

    NewThread04(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток " + t);
        suspendFlaf = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlaf){
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + "прерван.");
        }
        System.out.println(name + " завершен.");
    }

    synchronized void mysuspend(){
        suspendFlaf = true;
    }

    synchronized void muresume(){
        suspendFlaf = false;
        notify();
    }
}
