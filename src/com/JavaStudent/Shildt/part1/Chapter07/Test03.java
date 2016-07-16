package com.JavaStudent.Shildt.part1.Chapter07;

public class Test03 {
    int a, b;

    Test03(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test03 o) {
        o.a *=  2;
        o.b /= 2;
    }
}
