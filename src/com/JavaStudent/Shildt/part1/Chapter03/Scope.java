package com.JavaStudent.Shildt.part1.Chapter03;

public class Scope {
    public static void main(String args[]) {
        int x;

        x = 10;
        if(x == 10) {
            int y = 20;

            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100;

        System.out.println("x равно " + x);
    }
}