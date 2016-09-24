package com.JavaStudent.MotorDeport.dao.lorryDao;

import com.JavaStudent.MotorDeport.exception.ExceptionLorrySelectionNotFound;
import com.JavaStudent.MotorDeport.model.employee.Driver;
import com.JavaStudent.MotorDeport.model.lorry.Lorry;

import java.io.IOException;

public interface LorryDao {
    public void addDriverToLorry(Lorry lorry, Driver driver) throws IOException, ClassNotFoundException;
    public Lorry lorrySelection(double lengthOfBody, double widthOfBody, double heightOfBody, int carryingCapacity) throws IOException, ClassNotFoundException, ExceptionLorrySelectionNotFound;
}
