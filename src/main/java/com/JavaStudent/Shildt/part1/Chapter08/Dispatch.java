package com.JavaStudent.Shildt.part1.Chapter08;

public class Dispatch {
    public static void main(String args[]) {
        A09 a09 = new A09();
        B09 b09 = new B09();
        C c = new C();
        A09 r;

        r = a09;
        r.callme();

        r = b09;
        r.callme();

        r = c;
        r.callme();
    }
}
