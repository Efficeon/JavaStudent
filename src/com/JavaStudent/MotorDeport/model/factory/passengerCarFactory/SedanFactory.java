package com.JavaStudent.MotorDeport.model.factory.passengerCarFactory;

import com.JavaStudent.MotorDeport.model.passengerCar.PassengerCar;
import com.JavaStudent.MotorDeport.model.passengerCar.Sedan;

public class SedanFactory implements PassengerCarFactory {
    @Override
    public PassengerCar create(int ID, byte numberOfPassengers, boolean technicalTrunk) {
        return new Sedan(ID, numberOfPassengers, technicalTrunk);
    }
}
