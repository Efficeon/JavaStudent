package com.JavaStudent.DesignPattern.AbstractFactory.website;

import com.JavaStudent.DesignPattern.AbstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("website PM manages website project...");
    }
}
