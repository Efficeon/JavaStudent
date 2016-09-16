package com.JavaStudent.MotorDeport.model.factory.passengerCarFactory;

import com.JavaStudent.MotorDeport.dao.passengerCarDao.HatchbackDao;
import com.JavaStudent.MotorDeport.model.passengerCar.PassengerCar;

import java.io.IOException;

public class HatchbackFactory implements PassengerCarFactory {
    @Override
    public PassengerCar create(String licensePlate, int numberOfPassengers, boolean technicalTrunk) throws IOException, ClassNotFoundException {

        HatchbackDao hatchbackDao = new HatchbackDao();
        return hatchbackDao.createPassengerCar(licensePlate, numberOfPassengers, technicalTrunk);
    }
}
