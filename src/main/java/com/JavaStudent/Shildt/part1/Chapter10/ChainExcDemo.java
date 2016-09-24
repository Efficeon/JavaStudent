package com.JavaStudent.Shildt.part1.Chapter10;

public class ChainExcDemo {
    static void demoproc() {
        // создать исключение
        NullPointerException e = new NullPointerException("верхний уровень");

        // добавить причину исключения
        e.initCause(new ArithmeticException("причена"));

        throw e;
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            // вывести исключение верхнего уровня
            System.out.println("Перехвачено исключение: " + e);

            // вывести исключение послужившее причиной
            // для исключения верхнего уровня
            System.out.println("OПервопричина: " + e.getCause());
        }
    }
}
