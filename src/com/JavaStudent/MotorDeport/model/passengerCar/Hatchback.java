package com.JavaStudent.MotorDeport.model.passengerCar;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Hatchback extends PassengerCar{
    public Hatchback(int ID, byte numberOfPassengers, boolean technicalTrunk) {
        super(ID, numberOfPassengers, technicalTrunk);
    }
}