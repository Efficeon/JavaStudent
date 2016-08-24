package com.JavaStudent.Shildt.part1.Chapter12;

import java.lang.reflect.Method;

public class Meta01 {

    @MyAnno(str = "Пример анотации", val = 100)
    public static void myMeth(){
        Meta01 ob = new Meta01();

        try{
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() +  " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
