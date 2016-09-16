package com.JavaStudent.MotorDeport.controller.command.routeCommand;

import com.JavaStudent.MotorDeport.controller.command.Command;
import com.JavaStudent.MotorDeport.dao.routeDao.RouteDao;
import com.JavaStudent.MotorDeport.View.ConsoleHelper;
import com.JavaStudent.MotorDeport.model.route.Route;

import java.io.IOException;

public class ShowRouteCommand implements Command{
    @Override
    public void execute() throws IOException, ClassNotFoundException {
        ConsoleHelper.writeMessage("Укажите номер маршрута: ");
        int routingNumber = ConsoleHelper.readInt();

        RouteDao routeDao = new RouteDao();
        Route route = routeDao.getRouteByNumber(routingNumber);
        ConsoleHelper.writeMessage(route.toString());
    }
}
