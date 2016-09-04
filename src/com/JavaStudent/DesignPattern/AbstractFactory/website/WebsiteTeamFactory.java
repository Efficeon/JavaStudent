package com.JavaStudent.DesignPattern.AbstractFactory.website;

import com.JavaStudent.DesignPattern.AbstractFactory.Developer;
import com.JavaStudent.DesignPattern.AbstractFactory.ProjectManager;
import com.JavaStudent.DesignPattern.AbstractFactory.ProjectTeamFactory;
import com.JavaStudent.DesignPattern.AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
