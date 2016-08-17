package com.JavaStudent.Shildt.part1.Chapter07;

public class Overload01 {
    public static void main(String args[]) {
        OverloadDemo01 ob = new OverloadDemo01();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Результат вызова: " + result);
    }
}
