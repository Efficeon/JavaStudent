package com.JavaStudent.MotorDeport.model.passengerCar;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Sedan extends PassengerCar{
    public Sedan(int ID, byte numberOfPassengers, boolean technicalTrunk) {
        super(ID, numberOfPassengers, technicalTrunk);
    }
}
