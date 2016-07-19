package com.JavaStudent.Shildt.part1.Chapter08;

import java.lang.*;

public class B06 extends A07 {
    int k;

    B06(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("k: " + k);
    }
}
