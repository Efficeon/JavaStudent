package com.JavaStudent.Shildt.part1.Chapter08;

public class B03 extends A03 {
    int i;

    B03(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}
