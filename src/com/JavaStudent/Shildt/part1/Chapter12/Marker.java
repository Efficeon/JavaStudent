package com.JavaStudent.Shildt.part1.Chapter12;

import java.lang.reflect.Method;

public class Marker {

    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();

        try{
            Method m = ob.getClass().getMethod("myMeth");

            if (m.isAnnotationPresent(MyMarker.class))
                System.out.println("Аннотация-маркер MyMarker присутствует.");

        } catch (NoSuchMethodException e) {
            System.out.println("Метод не нейден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
