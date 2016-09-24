package com.JavaStudent.Shildt.part1.Chapter07;

public class Outer01 {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }
}

