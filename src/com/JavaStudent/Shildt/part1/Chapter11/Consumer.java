package com.JavaStudent.Shildt.part1.Chapter11;

public class Consumer implements  Runnable{
    Q q;
   Consumer(Q q){
       this.q = q;
       new Thread(this, "Потребитель").start();
   }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}
