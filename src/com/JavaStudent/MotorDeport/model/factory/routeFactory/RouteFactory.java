package com.JavaStudent.MotorDeport.model.factory.routeFactory;

import com.JavaStudent.MotorDeport.dao.routeDao.RouteDao;
import com.JavaStudent.MotorDeport.model.route.Route;

import java.io.IOException;
import java.io.Serializable;

public class RouteFactory implements Serializable{
    public Route create(String pointOfDeparture, String pointOfDestination) throws IOException, ClassNotFoundException {
        RouteDao routeDao = new RouteDao();
        Route route = routeDao.createRoute(pointOfDeparture, pointOfDestination);
        return route;
    }
}
