package com.JavaStudent.MotorDeport.model.employee;

import com.JavaStudent.MotorDeport.model.Car;

import java.io.Serializable;

public class Driver implements Serializable{
    //static final long serialVersionUID = 5037585225066001448L;
    private final String name;
    private final String passportID;
    private Car car;

    public Driver(String name, String passportID) {
       this.name = name;
       this.passportID = passportID;
    }

    public String getName() {
        return name;
    }

    public String getPassportID() {
        return passportID;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
