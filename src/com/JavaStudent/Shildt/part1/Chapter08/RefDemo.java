package com.JavaStudent.Shildt.part1.Chapter08;

public class RefDemo {
    public static void main(String args[]) {
        BoxWeight01 weightbox = new BoxWeight01(3, 5, 7, 8.37);
        Box01 plainbox = new Box01();
        double vol;

        vol = weightbox.volume();
        System.out.println("Обьем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        plainbox = weightbox;

        vol = plainbox.volume(); // OK, volume() defined in Box02
        System.out.println("Обьем plainbox равен " + vol);

//  System.out.println("Вес plainbox равен " + plainbox.weight);
    }
}
