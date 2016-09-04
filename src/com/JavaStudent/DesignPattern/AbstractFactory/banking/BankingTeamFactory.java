package com.JavaStudent.DesignPattern.AbstractFactory.banking;

import com.JavaStudent.DesignPattern.AbstractFactory.Developer;
import com.JavaStudent.DesignPattern.AbstractFactory.ProjectManager;
import com.JavaStudent.DesignPattern.AbstractFactory.ProjectTeamFactory;
import com.JavaStudent.DesignPattern.AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
