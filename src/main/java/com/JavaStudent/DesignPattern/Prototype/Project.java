package com.JavaStudent.DesignPattern.Prototype;

public class Project implements Copyable{
    private int id;
    private String nameProject;
    private String sourceCode;

    public Project(int id, String nameProject, String sourceCode) {
        this.id = id;
        this.nameProject = nameProject;
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id, nameProject, sourceCode);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", nameProject='" + nameProject + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
