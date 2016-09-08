package com.JavaStudent.MotorDeport.model.passengerCar;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Minivan extends PassengerCar{
    public Minivan(int ID, byte numberOfPassengers, boolean technicalTrunk) {
        super(ID, numberOfPassengers, technicalTrunk);
    }
}
