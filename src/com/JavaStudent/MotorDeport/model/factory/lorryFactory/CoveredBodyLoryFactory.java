package com.JavaStudent.MotorDeport.model.factory.lorryFactory;

import com.JavaStudent.MotorDeport.model.lorry.CoveredBodyLorry;
import com.JavaStudent.MotorDeport.model.lorry.Lorry;

public class CoveredBodyLoryFactory implements LorryFactory {
    @Override
    public Lorry createLorry(int ID, byte carryingCapacity, byte lengthOfBody, byte widthOfBody,
                             byte heightOfBody, boolean technicalDiagnostics) {
        return new CoveredBodyLorry(ID, carryingCapacity, lengthOfBody, widthOfBody,
                   heightOfBody, technicalDiagnostics);
    }
}
