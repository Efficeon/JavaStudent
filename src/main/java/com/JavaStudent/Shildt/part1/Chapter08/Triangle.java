package com.JavaStudent.Shildt.part1.Chapter08;

public class Triangle extends Figure01 {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}
