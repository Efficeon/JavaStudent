package com.JavaStudent.MotorDeport.model.factory.lorryFactory;

import com.JavaStudent.MotorDeport.model.lorry.Lorry;

import java.io.IOException;

public interface LorryFactory {
    Lorry createLorry(String ID, double carryingCapacity, double lengthOfBody, double widthOfBody,
                      double heightOfBody, boolean technicalDiagnostics) throws IOException, ClassNotFoundException;
}
