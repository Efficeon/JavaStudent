package com.JavaStudent.MotorDeport.model.factory.passengerCarFactory;

import com.JavaStudent.MotorDeport.dao.passengerCarDao.MinivanDao;
import com.JavaStudent.MotorDeport.model.passengerCar.PassengerCar;

import java.io.IOException;

public class MinivanFactory implements PassengerCarFactory{
    @Override
    public PassengerCar create(String licensePlate, int numberOfPassengers, boolean technicalTrunk) throws IOException, ClassNotFoundException {

        MinivanDao minivanDao = new MinivanDao();
        return minivanDao.createPassengerCar(licensePlate, numberOfPassengers, technicalTrunk);
    }
}
