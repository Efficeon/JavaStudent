package com.JavaStudent.Shildt.part1.Chapter08;

public class Box01 {
    double width;
    double height;
    double depth;

    Box01(Box01 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box01(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box01() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box01(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
