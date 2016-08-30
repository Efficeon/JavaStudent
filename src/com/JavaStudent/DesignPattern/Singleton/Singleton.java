package com.JavaStudent.DesignPattern.Singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){
    }

    public static synchronized Singleton getSingletonObject(){
        if (singleton == null) singleton = new Singleton();
        return singleton;
    }
}
