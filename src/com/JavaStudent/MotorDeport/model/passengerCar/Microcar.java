package com.JavaStudent.MotorDeport.model.passengerCar;

import java.io.Serializable;

public class Microcar extends PassengerCar implements Serializable{
    //static final long serialVersionUID = 1847807168196659482L;
    public Microcar(String licensePlate, int numberOfPassengers, boolean technicalTrunk) {
        super(licensePlate, numberOfPassengers, technicalTrunk);
        type = "Микрокар";
    }
}
