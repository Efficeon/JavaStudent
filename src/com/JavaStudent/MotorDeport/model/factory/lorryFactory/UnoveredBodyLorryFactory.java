package com.JavaStudent.MotorDeport.model.factory.lorryFactory;

import com.JavaStudent.MotorDeport.model.lorry.Lorry;
import com.JavaStudent.MotorDeport.model.lorry.UnoveredBodyLorry;

public class UnoveredBodyLorryFactory implements LorryFactory{
    @Override
    public Lorry createLorry(int ID, byte carryingCapacity, byte lengthOfBody, byte widthOfBody,
                             byte heightOfBody, boolean technicalDiagnostics) {
        return new UnoveredBodyLorry(ID, carryingCapacity, lengthOfBody, widthOfBody,
                   heightOfBody, technicalDiagnostics);
    }
}
