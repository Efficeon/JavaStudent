package com.JavaStudent.MotorDeport.model.factory.OrderForTransportFactory;

import com.JavaStudent.MotorDeport.model.Car;
import com.JavaStudent.MotorDeport.model.order.OrderForLorry;

public class ApplicationForLorryFactory{
    public OrderForLorry create(byte lengthOfBody, byte widthOfBody, byte heightOfBody,
                                byte cargoWeight, Car car) {
        return new OrderForLorry(lengthOfBody, widthOfBody, heightOfBody, cargoWeight, car);
    }
}
