package com.JavaStudent.Shildt.part1.Chapter08;

public class Box02 {
    private double width;
    private double height;
    private double depth;

    Box02(Box02 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box02(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box02() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box02(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
