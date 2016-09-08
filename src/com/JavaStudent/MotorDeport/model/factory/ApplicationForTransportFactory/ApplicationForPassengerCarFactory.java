package com.JavaStudent.MotorDeport.model.factory.ApplicationForTransportFactory;

import com.JavaStudent.MotorDeport.model.Car;
import com.JavaStudent.MotorDeport.model.application.ApplicationForPassengerCar;
import com.JavaStudent.MotorDeport.model.application.ApplicationForTransport;

public class ApplicationForPassengerCarFactory {
    public ApplicationForTransport create(int numberOfPassengers, Car car) {
        return new ApplicationForPassengerCar(numberOfPassengers, car);
    }
}
