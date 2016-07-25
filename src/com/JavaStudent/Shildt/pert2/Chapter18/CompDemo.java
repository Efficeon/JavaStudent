package com.JavaStudent.Shildt.pert2.Chapter18;

import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
        MyComp mc = new MyComp();

        //создать древовилное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<String>(mc.reversed());

        //внести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        //вывести элементы из древовидного множества
        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}
