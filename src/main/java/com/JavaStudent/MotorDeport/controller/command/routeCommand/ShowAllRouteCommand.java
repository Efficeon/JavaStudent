package com.JavaStudent.MotorDeport.controller.command.routeCommand;

import com.JavaStudent.MotorDeport.controller.command.Command;
import com.JavaStudent.MotorDeport.dao.routeDao.RouteDao;

import java.io.IOException;

public class ShowAllRouteCommand implements Command{
    @Override
    public void execute() throws IOException, ClassNotFoundException {
        RouteDao routeDao = new RouteDao();
        routeDao.showDatabaseRoute();
    }
}
