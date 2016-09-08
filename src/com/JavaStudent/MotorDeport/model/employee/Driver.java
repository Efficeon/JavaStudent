package com.JavaStudent.MotorDeport.model.employee;

import com.JavaStudent.MotorDeport.model.Car;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Driver{
    private int ID;
    private String name;
    private Car car;

    public Driver(int ID, String name, Car car) {
        this.ID = ID;
        this.name = name;
        this.car = car;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
