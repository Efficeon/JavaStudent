package com.JavaStudent.Shildt.part1.Chapter08;

public class SimpleInheritance {
    public static void main(String args[]) {
        A01 superOb = new A01();
        B01 subOb = new B01();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержиммое обьекта superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержиммое обьекта subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Сумма of i, j и k в обьекте subOb:");
        subOb.sum();
    }
}
