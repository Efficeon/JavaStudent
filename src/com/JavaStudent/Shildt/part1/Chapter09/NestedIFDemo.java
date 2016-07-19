package com.JavaStudent.Shildt.part1.Chapter09;

public class NestedIFDemo {
    public static void main(String args[]) {

        A01.NestedIF nif = new B01();

        if(nif.isNotNegative(10))
            System.out.println("Число 10 неотрицательное");
        if(nif.isNotNegative(-12))
            System.out.println("Это не будет выведено");
    }
}
