package com.JavaStudent.DesignPattern.AbstractFactory.banking;

import com.JavaStudent.DesignPattern.AbstractFactory.Developer;

public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
