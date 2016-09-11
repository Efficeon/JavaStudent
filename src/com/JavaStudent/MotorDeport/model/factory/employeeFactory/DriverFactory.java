package com.JavaStudent.MotorDeport.model.factory.employeeFactory;

import com.JavaStudent.MotorDeport.dao.employeeDao.DriverDao;
import com.JavaStudent.MotorDeport.model.employee.Driver;

public class DriverFactory{
    public Driver create(String name, String passportID){
        return DriverDao.createDriver(name, passportID);
    }
}
