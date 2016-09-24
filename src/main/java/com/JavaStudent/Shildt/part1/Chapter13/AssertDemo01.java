package com.JavaStudent.Shildt.part1.Chapter13;

public class AssertDemo01 {
    static int val = 3;

    // вазвратить целочисленное значение.
    static int getnum() {
        return val--;
    }

    public static void main(String args[])
    {
        int n;

        for(int i=0; i < 10; i++) {
            n = getnum();
            assert n > 0 : "n отрицательное!";
            System.out.println("n равно " + n);
        }
    }
}
