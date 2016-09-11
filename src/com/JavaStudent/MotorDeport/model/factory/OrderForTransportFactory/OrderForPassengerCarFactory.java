package com.JavaStudent.MotorDeport.model.factory.OrderForTransportFactory;

import com.JavaStudent.MotorDeport.model.Car;
import com.JavaStudent.MotorDeport.model.order.OrderForPassengerCar;

public class OrderForPassengerCarFactory {
    public OrderForPassengerCar create(int numberOfPassengers, Car car) {
        return new OrderForPassengerCar(numberOfPassengers, car);
    }
}
