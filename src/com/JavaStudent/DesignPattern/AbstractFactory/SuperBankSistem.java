package com.JavaStudent.DesignPattern.AbstractFactory;

import com.JavaStudent.DesignPattern.AbstractFactory.banking.BankingTeamFactory;

public class SuperBankSistem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.managerProject();
    }
}
