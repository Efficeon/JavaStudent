package com.JavaStudent.Shildt.pert2.Chapter18;

import java.util.Comparator;

public class CompLastNames implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        int i, j;

        //найти индекс символа с которого начинается фамилия
        i = aStr.lastIndexOf(" ");
        j = bStr.lastIndexOf(" ");

        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
