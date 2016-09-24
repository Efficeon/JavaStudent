package com.JavaStudent.MotorDeport.model;

import com.JavaStudent.MotorDeport.model.employee.Driver;

public interface Car {
    public String getLicensePlate();
    public Driver getDriver();
    public void setDriver(Driver driver);
    public String toString();
}
