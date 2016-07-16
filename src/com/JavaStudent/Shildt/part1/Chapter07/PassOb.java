package com.JavaStudent.Shildt.part1.Chapter07;

public class PassOb {
    public static void main(String args[]) {
        Test01 ob1 = new Test01(100, 22);
        Test01 ob2 = new Test01(100, 22);
        Test01 ob3 = new Test01(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));

        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
