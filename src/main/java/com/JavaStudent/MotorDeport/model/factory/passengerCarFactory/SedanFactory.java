package com.JavaStudent.MotorDeport.model.factory.passengerCarFactory;

import com.JavaStudent.MotorDeport.dao.passengerCarDao.SedanDao;
import com.JavaStudent.MotorDeport.model.passengerCar.PassengerCar;

import java.io.IOException;

public class SedanFactory implements PassengerCarFactory {
    @Override
    public PassengerCar create(String licensePlate, int numberOfPassengers, boolean technicalTrunk) throws IOException, ClassNotFoundException {

        SedanDao sedanDao = new SedanDao();
        return sedanDao.createPassengerCar(licensePlate, numberOfPassengers, technicalTrunk);
    }
}
