package com.JavaStudent.DesignPattern.AbstractFactory.website;

import com.JavaStudent.DesignPattern.AbstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code...");
    }
}
