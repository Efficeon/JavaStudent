package com.JavaStudent.DesignPattern.Visitor.developer;

import com.JavaStudent.DesignPattern.Visitor.projectElement.DataBase;
import com.JavaStudent.DesignPattern.Visitor.projectElement.ProjectClass;
import com.JavaStudent.DesignPattern.Visitor.projectElement.Test;

public interface Developer {
    public void create(ProjectClass projectClass);

    public void create(Test test);

    public void create(DataBase dataBase);
}
