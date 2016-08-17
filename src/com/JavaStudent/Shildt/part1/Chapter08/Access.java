package com.JavaStudent.Shildt.part1.Chapter08;

public class Access {
    public static void main(String args[]) {
        B02 subOb = new B02();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
