package com.JavaStudent.Shildt.part1.Chapter08;

public class Rectangle extends Figure01 {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}
