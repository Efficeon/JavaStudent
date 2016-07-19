package com.JavaStudent.Shildt.part1.Chapter09.p2;


import com.JavaStudent.Shildt.part1.Chapter09.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("Конструктор из другого пакета");

        //  System.out.println("n = " + p.n);
        //  System.out.println("n_pri = " + p.n_pri);
        //  System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
