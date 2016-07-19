package com.JavaStudent.Shildt.part1.Chapter09;

public class IFTest {
    public static void main(String args[]) {
        FixedStack01 mystack1 = new FixedStack01(5);
        FixedStack01 mystack2 = new FixedStack01(8);

        for(int i=0; i<5; i++) mystack1.push(i);
        for(int i=0; i<8; i++) mystack2.push(i);

        System.out.println("Стек в  mystack1:");
        for(int i=0; i<5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2:");
        for(int i=0; i<8; i++)
            System.out.println(mystack2.pop());
    }
}
