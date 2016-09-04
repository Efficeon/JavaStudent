package com.JavaStudent.DesignPattern.Visitor.developer;

import com.JavaStudent.DesignPattern.Visitor.developer.Developer;
import com.JavaStudent.DesignPattern.Visitor.projectElement.DataBase;
import com.JavaStudent.DesignPattern.Visitor.projectElement.ProjectClass;
import com.JavaStudent.DesignPattern.Visitor.projectElement.Test;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after Junior...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Creating reliable test...");
    }
}
