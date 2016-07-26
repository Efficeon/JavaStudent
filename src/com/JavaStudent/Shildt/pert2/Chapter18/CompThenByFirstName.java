package com.JavaStudent.Shildt.pert2.Chapter18;

import java.util.Comparator;

public class CompThenByFirstName implements Comparator<String>{

    @Override
    public int compare(String aStr, String bStr) {
       int i, j;

        return aStr.compareToIgnoreCase(bStr);
    }
}
