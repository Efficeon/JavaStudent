package com.JavaStudent.Shildt.part1.Chapter12;

public class EnumDemo {
    public static void main(String args[])
    {
        Apple ap;
        ap = Apple.RedDel;

        System.out.println("Значение ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if(ap == Apple.GoldenDel)
            System.out.println("Переменная ap содержит GoldenDel.\n");

        switch(ap) {
            case Jonathan:
                System.out.println("Сорт Jonathan крассный.");
                break;
            case GoldenDel:
                System.out.println("Сорт Golden Delicious желтый.");
                break;
            case RedDel:
                System.out.println("Сорт Red Delicious крассный.");
                break;
            case Winesap:
                System.out.println("Сорт Winesap крассный.");
                break;
            case Cortland:
                System.out.println("Сорт Cortland крассный.");
                break;
        }
    }
}
