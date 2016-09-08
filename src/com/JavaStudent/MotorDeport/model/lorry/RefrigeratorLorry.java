package com.JavaStudent.MotorDeport.model.lorry;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class RefrigeratorLorry extends Lorry {

    public RefrigeratorLorry(int ID, byte carryingCapacity, byte lengthOfBody, byte widthOfBody,
                             byte heightOfBody, boolean technicalDiagnostics) {
        super(ID, carryingCapacity,lengthOfBody, widthOfBody, heightOfBody, technicalDiagnostics);
    }
}
