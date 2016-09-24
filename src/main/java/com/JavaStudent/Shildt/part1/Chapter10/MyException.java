package com.JavaStudent.Shildt.part1.Chapter10;

public class MyException extends Exception{
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}


