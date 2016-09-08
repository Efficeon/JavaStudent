package com.JavaStudent.MotorDeport.model.factory.lorryFactory;

import com.JavaStudent.MotorDeport.model.lorry.IsothermalLorry;
import com.JavaStudent.MotorDeport.model.lorry.Lorry;

public class IsothermalLorryFactory implements LorryFactory {
    @Override
    public Lorry createLorry(int ID, byte carryingCapacity, byte lengthOfBody, byte widthOfBody,
                             byte heightOfBody, boolean technicalDiagnostics) {
        return new IsothermalLorry(ID, carryingCapacity, lengthOfBody, widthOfBody,
                   heightOfBody, technicalDiagnostics);
    }
}
