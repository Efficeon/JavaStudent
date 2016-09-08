package com.JavaStudent.MotorDeport.model.passengerCar;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Microcar extends PassengerCar{
    public Microcar(int  ID, byte numberOfPassengers, boolean technicalTrunk) {
        super(ID, numberOfPassengers, technicalTrunk);
    }
}
