package com.JavaStudent.DesignPattern.FactoryMethod;

public class JavaDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
