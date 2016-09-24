package com.JavaStudent.MotorDeport.controller.command.routeCommand;

import com.JavaStudent.MotorDeport.controller.command.Command;
import com.JavaStudent.MotorDeport.View.ConsoleHelper;
import com.JavaStudent.MotorDeport.model.factory.routeFactory.RouteFactory;

import java.io.IOException;

public class AddRouteCommand implements Command{
    @Override
    public void execute() throws IOException, ClassNotFoundException {
        ConsoleHelper.writeMessage("Укажите точку отправления: ");
        String pointOfDeparture = ConsoleHelper.readString();

        ConsoleHelper.writeMessage("Укажите точку назначения: ");
        String pointOfDestination = ConsoleHelper.readString();

        RouteFactory routeFactory = new RouteFactory();
        routeFactory.create(pointOfDeparture, pointOfDestination);
        ConsoleHelper.writeMessage("\nСоздан следующий маршрут: " +
                                    pointOfDeparture + " - " + pointOfDestination +"\n");
    }
}
