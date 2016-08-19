package com.JavaStudent.Shildt.part1.Chapter11;

public class Caller01 implements Runnable{
    String msg;
    Callme01 target;
    Thread t;

    public Caller01(Callme01 targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
