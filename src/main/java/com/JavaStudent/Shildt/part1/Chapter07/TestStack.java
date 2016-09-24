package com.JavaStudent.Shildt.part1.Chapter07;

public class TestStack {
    public static void main(String args[]) {
        Stack01 mystack1 = new Stack01();
        Stack01 mystack2 = new Stack01();

        for(int i=0; i<10; i++) mystack1.push(i);
        for(int i=10; i<20; i++) mystack2.push(i);

        System.out.println("Стек в mystack1:");
        for(int i=0; i<10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2:");
        for(int i=0; i<10; i++)
            System.out.println(mystack2.pop());
    }
}
