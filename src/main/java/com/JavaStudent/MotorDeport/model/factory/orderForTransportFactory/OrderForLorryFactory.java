package com.JavaStudent.MotorDeport.model.factory.orderForTransportFactory;

import com.JavaStudent.MotorDeport.dao.orderDao.OrderForLorryDao;
import com.JavaStudent.MotorDeport.exception.ExceptionLorrySelectionNotFound;
import com.JavaStudent.MotorDeport.exception.ExceptionRouteSelectionNotFound;
import com.JavaStudent.MotorDeport.model.order.OrderForLorry;

import java.io.IOException;

public class OrderForLorryFactory {
    public OrderForLorry create(int typeTransport,
                                double lengthOfBody,
                                double widthOfBody,
                                double heightOfBody,
                                int cargoWeight,
                                int routeNumber) throws ClassNotFoundException, ExceptionLorrySelectionNotFound, ExceptionRouteSelectionNotFound, IOException {

        OrderForLorryDao orderForLorryDao = new OrderForLorryDao();
        OrderForLorry orderForLorry;
        return orderForLorryDao.createOrderForLorry(typeTransport,lengthOfBody, widthOfBody, heightOfBody,
                                                    cargoWeight, routeNumber);
    }
}
