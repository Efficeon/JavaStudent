package com.JavaStudent.Shildt.part1.Chapter13;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Hypot02 {
    public static void main(String args[]) {
        double side1, side2;
        double hypot;

        side1 = 3.0;
        side2 = 4.0;

        // Здесь методы sqrt() и pow() можно вызвать
        // непосредственно, опуская их имя класса
        hypot = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println("При заданной длинне сторон " + side1 + " и " + side2 + " гипотенуза равна " + hypot);
    }
}
