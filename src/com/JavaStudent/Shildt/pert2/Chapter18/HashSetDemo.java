package com.JavaStudent.Shildt.pert2.Chapter18;

import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);
    }
}
