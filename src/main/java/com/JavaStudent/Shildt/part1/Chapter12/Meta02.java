package com.JavaStudent.Shildt.part1.Chapter12;

import java.lang.reflect.Method;

public class Meta02 {

    @MyAnno(str = "Два параметра", val = 19)
    public static void myMeth(String str, int i) {
        Meta02 ob = new Meta02();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден. ");
        }
    }

    public static void main(String[] args) {
        myMeth("Тест", 10);
    }
}
