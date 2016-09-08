package com.JavaStudent.MotorDeport.model.lorry;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class IsothermalLorry extends Lorry{
    public IsothermalLorry(int ID, byte carryingCapacity, byte lengthOfBody, byte widthOfBody,
                           byte heightOfBody, boolean technicalDiagnostics) {
        super(ID, carryingCapacity, lengthOfBody, widthOfBody, heightOfBody, technicalDiagnostics);
    }
}
