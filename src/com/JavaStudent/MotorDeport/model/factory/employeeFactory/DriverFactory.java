package com.JavaStudent.MotorDeport.model.factory.employeeFactory;


import com.JavaStudent.MotorDeport.model.Car;
import com.JavaStudent.MotorDeport.model.employee.Driver;

public class DriverFactory{
    public Driver create(int ID, String name, Car car) {
        return new Driver(ID, name, car);
    }
}
