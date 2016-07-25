package com.JavaStudent.Shildt.pert2.Chapter18;

import java.util.Comparator;

public class TComp implements Comparator<String>{

    @Override
    public int compare(String aStr, String bStr) {
        int i, j, k;

        //найти индекс символа с которога начинается фамилия
        i = aStr.lastIndexOf(" ");
        j = bStr.lastIndexOf(" ");
        k = aStr.substring(i).compareTo(bStr.substring(j));

        if (k==0) //Фамили совпадают, проверить имя и фамилию полностью
            return aStr.compareTo(bStr);
        else
            return k;
    }
    //переопределять метор equals() не требуется
}
