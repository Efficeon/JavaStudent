package com.JavaStudent.Shildt.part1.Chapter09;

public class DynStack01 implements IntStack01 {
    private int stck[];
    private int tos;

    DynStack01(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if(tos==stck.length-1) {
            int temp[] = new int[stck.length * 2];
            for(int i=0; i<stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }

    public int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
