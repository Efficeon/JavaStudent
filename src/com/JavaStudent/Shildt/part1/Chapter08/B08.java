package com.JavaStudent.Shildt.part1.Chapter08;

public class B08 extends A08 {
    int k;

    B08(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // overload show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}
