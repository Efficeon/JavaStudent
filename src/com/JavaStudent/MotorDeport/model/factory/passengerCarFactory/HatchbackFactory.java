package com.JavaStudent.MotorDeport.model.factory.passengerCarFactory;

import com.JavaStudent.MotorDeport.model.passengerCar.Hatchback;
import com.JavaStudent.MotorDeport.model.passengerCar.PassengerCar;

public class HatchbackFactory implements PassengerCarFactory {
    @Override
    public PassengerCar create(int ID, byte numberOfPassengers, boolean technicalTrunk) {

        return new Hatchback(ID, numberOfPassengers, technicalTrunk);
    }
}
