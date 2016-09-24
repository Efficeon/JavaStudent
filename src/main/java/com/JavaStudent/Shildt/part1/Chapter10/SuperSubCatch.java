package com.JavaStudent.Shildt.part1.Chapter10;

public class SuperSubCatch {
    public static void main(String args[]) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch(Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
        }
    /* Этот оператор catch вообще не будет достигнут т.к. подкласс
       ArithmeticException является производным от класса Exception. */
       // catch(ArithmeticException e) { // ОШИБКА! - недостижимый код
       //    System.out.println("This is never reached.");
       // }
    }
}
