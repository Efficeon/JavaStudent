package com.JavaStudent.Shildt.part1.Chapter07;

public class RetOb {
    public static void main(String args[]) {
        Test04 ob1 = new Test04(2);
        Test04 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения значения: " + ob2.a);
    }
}
