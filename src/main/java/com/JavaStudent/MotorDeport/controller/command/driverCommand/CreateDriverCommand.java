package com.JavaStudent.MotorDeport.controller.command.driverCommand;

import com.JavaStudent.MotorDeport.controller.command.Command;

import com.JavaStudent.MotorDeport.View.ConsoleHelper;
import com.JavaStudent.MotorDeport.model.employee.Driver;
import com.JavaStudent.MotorDeport.model.factory.employeeFactory.DriverFactory;

import java.io.IOException;

public class CreateDriverCommand implements Command{
    @Override
    public void execute() throws IOException, ClassNotFoundException {
        DriverFactory driverFactory = new DriverFactory();

        ConsoleHelper.writeMessage("Введите инициалы водителя: ");
        String name = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("Введите номер паспорта водителя: ");
        String passportID = ConsoleHelper.readString();
        Driver driver = driverFactory.create(name , passportID);
        ConsoleHelper.writeMessage("Водитель: " + name + " " + passportID + " добавлен!\n");
    }
}
