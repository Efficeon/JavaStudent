package com.JavaStudent.Shildt.part1.Chapter12;

public class UnboxingError {
    public static void main(String args[]) {

        Integer iOb = 1000;
        int i = iOb.byteValue();

        System.out.println(i);
    }
}
