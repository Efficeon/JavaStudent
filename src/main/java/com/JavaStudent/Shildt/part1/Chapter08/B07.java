package com.JavaStudent.Shildt.part1.Chapter08;

public class B07 extends A07 {
    int k;

    B07(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}
