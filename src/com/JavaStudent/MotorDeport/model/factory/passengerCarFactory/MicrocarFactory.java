package com.JavaStudent.MotorDeport.model.factory.passengerCarFactory;

import com.JavaStudent.MotorDeport.model.passengerCar.Microcar;
import com.JavaStudent.MotorDeport.model.passengerCar.PassengerCar;

public class MicrocarFactory implements PassengerCarFactory{
    @Override
    public PassengerCar create(int ID, byte numberOfPassengers, boolean technicalTrunk) {
        return new Microcar(ID, numberOfPassengers, technicalTrunk);
    }
}
