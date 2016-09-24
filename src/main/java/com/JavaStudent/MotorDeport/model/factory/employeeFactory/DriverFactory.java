package com.JavaStudent.MotorDeport.model.factory.employeeFactory;

import com.JavaStudent.MotorDeport.dao.employeeDao.DriverDao;
import com.JavaStudent.MotorDeport.model.employee.Driver;

import java.io.IOException;

public class DriverFactory{
    public Driver create(String name, String passportID) throws IOException, ClassNotFoundException {
        DriverDao driverDao = new DriverDao();
        return driverDao.createDriver(name, passportID);
    }
}
