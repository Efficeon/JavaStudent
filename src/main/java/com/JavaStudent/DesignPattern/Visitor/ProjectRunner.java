package com.JavaStudent.DesignPattern.Visitor;

import com.JavaStudent.DesignPattern.Visitor.developer.Developer;
import com.JavaStudent.DesignPattern.Visitor.developer.JuniorDeveloper;
import com.JavaStudent.DesignPattern.Visitor.developer.SeniorDeveloper;
import com.JavaStudent.DesignPattern.Visitor.projectElement.Project;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in action...");
        project.beWriting(junior);

        System.out.println("\n========================================\n");

        System.out.println("Senior in action...");
        project.beWriting(senior);
    }
}
