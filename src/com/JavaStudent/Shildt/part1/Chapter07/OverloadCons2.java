package com.JavaStudent.Shildt.part1.Chapter07;

public class OverloadCons2 {
    public static void main(String args[]) {

        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Обьем mybox1 равен " + vol);

        System.out.println("Обьем mybox2 равен " + vol);

        vol = mycube.volume();
        System.out.println("Обьем cube равен " + vol);

        vol = myclone.volume();
        System.out.println("Обьем clone равен " + vol);
    }
}
