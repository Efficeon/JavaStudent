package com.JavaStudent.DesignPattern.Visitor.projectElement;

import com.JavaStudent.DesignPattern.Visitor.developer.Developer;

public class DataBase implements ProjectElement {
    @Override
    public void beWriting(Developer developer) {
        developer.create(this);
    }
}
