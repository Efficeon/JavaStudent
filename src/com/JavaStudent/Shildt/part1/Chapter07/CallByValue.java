package com.JavaStudent.Shildt.part1.Chapter07;

public class CallByValue {
    public static void main(String args[]) {
        Test03 ob = new Test03(15, 20);

        System.out.println("ob.a и ob.b до вызова: " +
                ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a и ob.b после вызова: " +
                ob.a + " " + ob.b);
    }
}
