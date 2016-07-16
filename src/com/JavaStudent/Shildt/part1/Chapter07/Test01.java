package com.JavaStudent.Shildt.part1.Chapter07;

public class Test01 {
    int a, b;

    Test01(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test01 o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
