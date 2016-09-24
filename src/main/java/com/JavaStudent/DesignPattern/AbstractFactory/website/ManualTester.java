package com.JavaStudent.DesignPattern.AbstractFactory.website;

import com.JavaStudent.DesignPattern.AbstractFactory.Tester;

public class ManualTester implements Tester{
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
