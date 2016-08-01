package com.JavaStudent.Shildt.part1.Chapter10;

class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Вызван метод compute(" + a + ")");
        if(a > 10)
            throw new MyException(a);
        System.out.println("Нормальное завершение");
    }

    public static void main(String args[]) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Перехвачено исключение " + e);
        }
    }
}