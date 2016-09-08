package com.JavaStudent.MotorDeport.model.factory.ApplicationForTransportFactory;

import com.JavaStudent.MotorDeport.model.Car;
import com.JavaStudent.MotorDeport.model.application.ApplicationForLorry;

public class ApplicationForLorryFactory{
    public ApplicationForLorry create(byte lengthOfBody, byte widthOfBody, byte heightOfBody,
                                      byte cargoWeight, Car car) {
        return new ApplicationForLorry(lengthOfBody, widthOfBody, heightOfBody, cargoWeight, car);
    }
}
