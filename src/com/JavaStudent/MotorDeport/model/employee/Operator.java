package com.JavaStudent.MotorDeport.model.employee;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Operator implements Employee{
    private int ID;
    private String name;

    public Operator(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
