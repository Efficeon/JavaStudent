package com.JavaStudent.Shildt.part1.Chapter07;

public class Stack01 {
    private int stck[] = new int[10];
    private int tos;

    Stack01() {
        tos = -1;
    }

    void push(int item) {
        if(tos==9)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
