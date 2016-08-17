package com.JavaStudent.Shildt.part1.Chapter07;

public class Test04 {
    int a;

    Test04(int i) {
        a = i;
    }

    Test04 incrByTen() {
        Test04 temp = new Test04(a+10);
        return temp;
    }
}
