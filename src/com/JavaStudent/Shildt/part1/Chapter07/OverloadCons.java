package com.JavaStudent.Shildt.part1.Chapter07;

public class OverloadCons {
    public static void main(String args[]) {

        Box02 mybox1 = new Box02(10, 20, 15);
        Box02 mybox2 = new Box02();
        Box02 mycube = new Box02(7);

        double vol;

        vol = mybox1.volume();
        System.out.println("Обьем mybox1 равен " + vol);

        vol = mybox2.volume();
        System.out.println("Обьем mybox2 равен " + vol);

        vol = mycube.volume();
        System.out.println("Обьем mycube равен " + vol);
    }
}
