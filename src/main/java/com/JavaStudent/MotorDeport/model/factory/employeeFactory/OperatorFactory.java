package com.JavaStudent.MotorDeport.model.factory.employeeFactory;

import com.JavaStudent.MotorDeport.dao.employeeDao.OperatorDao;
import com.JavaStudent.MotorDeport.model.employee.Operator;

public class OperatorFactory{

    public Operator create(String name, String passportID) {
       return OperatorDao.createOperator(name, passportID);
    }
}
