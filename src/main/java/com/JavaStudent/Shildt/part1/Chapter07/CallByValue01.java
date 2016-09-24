package com.JavaStudent.Shildt.part1.Chapter07;

public class CallByValue01 {
    public static void main(String args[]) {
        Test02 ob = new Test02();
        int a = 15, b = 20;

        System.out.println("a и b до вызова: " +
                a + " " + b);

        ob.meth(a, b);

        System.out.println("a и b после вызова: " +
                a + " " + b);
    }
}
