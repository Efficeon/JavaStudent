package com.JavaStudent.Shildt.part1.Chapter07;

public class VarArgs2 {
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length +
                " Содержимое: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        vaTest("Один параметр переменной длинны: ", 10);
        vaTest("Три параметра переменной длинны: ", 1, 2, 3);
        vaTest("Без параметров переменной длинны: ");
    }
}
