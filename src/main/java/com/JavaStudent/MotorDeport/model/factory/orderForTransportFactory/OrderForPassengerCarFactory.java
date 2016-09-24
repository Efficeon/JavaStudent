package com.JavaStudent.MotorDeport.model.factory.orderForTransportFactory;

import com.JavaStudent.MotorDeport.dao.orderDao.OrderForPassengerCarDao;
import com.JavaStudent.MotorDeport.exception.ExceptionPassengerCarSelectionNotFound;
import com.JavaStudent.MotorDeport.exception.ExceptionRouteSelectionNotFound;
import com.JavaStudent.MotorDeport.model.order.OrderForPassengerCar;

import java.io.IOException;

public class OrderForPassengerCarFactory {
    public OrderForPassengerCar create(int typeTransport,int numberOfPassengers, int routeNumber) throws ClassNotFoundException, ExceptionRouteSelectionNotFound, ExceptionPassengerCarSelectionNotFound, IOException {
        OrderForPassengerCarDao orderForPassengerCarDao = new OrderForPassengerCarDao();
        OrderForPassengerCar orderForPassengerCar;
        return orderForPassengerCarDao.createOrderForPassengerCar(typeTransport, numberOfPassengers, routeNumber);
    }
}
