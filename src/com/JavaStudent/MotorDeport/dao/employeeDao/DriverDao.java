package com.JavaStudent.MotorDeport.dao.employeeDao;

import com.JavaStudent.MotorDeport.model.employee.Driver;

public class DriverDao {

    public static Driver createDriver(String name, String passportID) {
            return new Driver(name, passportID);
    }
}

