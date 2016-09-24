package com.JavaStudent.DesignPattern.AbstractFactory.banking;

import com.JavaStudent.DesignPattern.AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Banking PM managers banking project...");
    }
}
