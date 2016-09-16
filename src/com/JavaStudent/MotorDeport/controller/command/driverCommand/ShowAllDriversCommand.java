package com.JavaStudent.MotorDeport.controller.command.driverCommand;

import com.JavaStudent.MotorDeport.controller.command.Command;
import com.JavaStudent.MotorDeport.dao.employeeDao.DriverDao;

import java.io.IOException;

public class ShowAllDriversCommand implements Command {
    @Override
    public void execute() throws IOException, ClassNotFoundException {
        DriverDao driverDao = new DriverDao();
        driverDao.showDatabaseDriver();
    }
}
