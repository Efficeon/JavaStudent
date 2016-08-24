package com.JavaStudent.Shildt.part1.Chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "Аннотация тестового класса")
@MyAnno(str = "Meta2", val = 99)
public class Meta {

    @What(description = "Аннотация тестового класса")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth(){
        Meta ob = new Meta();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();
            System.out.println("Все аннотации для класса Meta2:");
            for (Annotation a : annos)
                System.out.println(a);
            System.out.println();

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("Все аннотации для метода myMeth():");
            for (Annotation a : annos)
                System.out.println(a);

        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
