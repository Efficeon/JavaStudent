package com.JavaStudent.Shildt.pert2.Chapter18;

import java.util.Comparator;

public class MyComp implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;

        //выполнить сравнение в обратном порядке
        return aStr.compareTo(bStr);
    }
        //переопределять метор equals() не требуется
}
