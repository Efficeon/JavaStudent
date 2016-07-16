package com.JavaStudent.Shildt.part1.Chapter07;

public class OverloadDemo01 {
    void test() {
        System.out.println("Параметры отсутствуют.");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}
