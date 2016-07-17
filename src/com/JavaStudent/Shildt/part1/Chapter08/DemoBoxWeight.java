package com.JavaStudent.Shildt.part1.Chapter08;

public class DemoBoxWeight {
    public static void main(String args[]) {
        BoxWeight01 mybox1 = new BoxWeight01(10, 20, 15, 34.3);
        BoxWeight01 mybox2 = new BoxWeight01(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Обьем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Обьем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
    }
}
