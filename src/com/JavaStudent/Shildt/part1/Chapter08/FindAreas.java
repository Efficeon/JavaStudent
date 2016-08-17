package com.JavaStudent.Shildt.part1.Chapter08;

public class FindAreas {
    public static void main(String args[]) {
        Figure01 f = new Figure01(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure01 figref;

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна" + figref.area());

        figref = f;
        System.out.println("Площадь равна " + figref.area());
    }
}
