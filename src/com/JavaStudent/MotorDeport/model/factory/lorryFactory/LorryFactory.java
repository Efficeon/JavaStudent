package com.JavaStudent.MotorDeport.model.factory.lorryFactory;

import com.JavaStudent.MotorDeport.model.lorry.Lorry;

public interface LorryFactory {
    Lorry createLorry(int ID, byte carryingCapacity, byte lengthOfBody, byte widthOfBody,
                      byte heightOfBody, boolean technicalDiagnostics);
}
