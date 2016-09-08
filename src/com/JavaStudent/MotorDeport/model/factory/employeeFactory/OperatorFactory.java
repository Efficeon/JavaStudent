package com.JavaStudent.MotorDeport.model.factory.employeeFactory;

import com.JavaStudent.MotorDeport.model.employee.Operator;

public class OperatorFactory{

    public Operator create(int ID, String name) {
       return new Operator(ID, name);
    }
}
