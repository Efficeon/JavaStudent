package com.JavaStudent.Shildt.part1.Chapter08;

public class Box02Weight extends Box02 {
    double weight;

    Box02Weight(Box02Weight ob) {
        super(ob);
        weight = ob.weight;
    }

    Box02Weight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    Box02Weight() {
        super();
        weight = -1;
    }

    Box02Weight(double len, double m) {
        super(len);
        weight = m;
    }
}
