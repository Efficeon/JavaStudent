package com.JavaStudent.Shildt.part1.Chapter08;

public class DemoSuper {
    public static void main(String args[]) {
        Box02Weight mybox1 = new Box02Weight(10, 20, 15, 34.3);
        Box02Weight mybox2 = new Box02Weight(2, 3, 4, 0.076);
        Box02Weight mybox3 = new Box02Weight();
        Box02Weight mycube = new Box02Weight(3, 2);
        Box02Weight myclone = new Box02Weight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Обем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Обем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Обемf mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Обем myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Обем mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();
    }
}
