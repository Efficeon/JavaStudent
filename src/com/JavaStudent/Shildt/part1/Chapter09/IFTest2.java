package com.JavaStudent.Shildt.part1.Chapter09;

public class IFTest2 {
    public static void main(String args[]) {
        DynStack01 mystack1 = new DynStack01(5);
        DynStack01 mystack2 = new DynStack01(8);

        for(int i=0; i<12; i++) mystack1.push(i);
        for(int i=0; i<20; i++) mystack2.push(i);

        System.out.println("Стек в mystack1:");
        for(int i=0; i<12; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2:");
        for(int i=0; i<20; i++)
            System.out.println(mystack2.pop());
    }
}
