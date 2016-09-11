package com.JavaStudent.MotorDeport.dao.employeeDao;

import com.JavaStudent.MotorDeport.model.employee.Operator;

public class OperatorDao {

    public static Operator createOperator(String name, String passportID ) {

        return new Operator(name, passportID);
    }
}
