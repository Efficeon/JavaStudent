package com.JavaStudent.DesignPattern.Visitor.projectElement;

import com.JavaStudent.DesignPattern.Visitor.developer.Developer;


public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }

    @Override
    public void beWriting(Developer developer) {
        for (ProjectElement element : projectElements){
            element.beWriting(developer);
        }
    }
}
