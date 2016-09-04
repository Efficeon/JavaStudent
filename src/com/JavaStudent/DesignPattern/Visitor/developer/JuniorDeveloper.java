package com.JavaStudent.DesignPattern.Visitor.developer;

import com.JavaStudent.DesignPattern.Visitor.developer.Developer;
import com.JavaStudent.DesignPattern.Visitor.projectElement.DataBase;
import com.JavaStudent.DesignPattern.Visitor.projectElement.ProjectClass;
import com.JavaStudent.DesignPattern.Visitor.projectElement.Test;

public class JuniorDeveloper implements Developer {

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Drop database...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Creating not reliable test...");
    }
}
