package com.JavaStudent.MotorDeport.controller.command.lorryComand;

import com.JavaStudent.MotorDeport.controller.command.Command;
import com.JavaStudent.MotorDeport.dao.employeeDao.DriverDao;
import com.JavaStudent.MotorDeport.dao.lorryDao.CoveredBodyLorryDao;
import com.JavaStudent.MotorDeport.dao.lorryDao.IsothermalLorryDao;
import com.JavaStudent.MotorDeport.dao.lorryDao.RefrigeratorLorryDao;
import com.JavaStudent.MotorDeport.dao.lorryDao.UncoveredBodyLorryDao;
import com.JavaStudent.MotorDeport.View.ConsoleHelper;

import java.io.IOException;

public class AddDriverToLorryCommand implements Command{

    @Override
    public void execute() throws IOException, ClassNotFoundException {
        ConsoleHelper.writeMessage("Укажите тип автомобиля (1-Крытый кузов; 2-Изотермический кузов;" +
                "3-Рефрижераторный кузов; 4-Открытый кузов): ");
        int typeBody = ConsoleHelper.readInt();

        ConsoleHelper.writeMessage("Укажите номер автомобиля: ");
        String licensePlate = ConsoleHelper.readString();

        ConsoleHelper.writeMessage("Укажите номер паспорта водителя: ");
        String passportID = ConsoleHelper.readString();

        DriverDao driverDao = new DriverDao();

        switch (typeBody){
            case 1:
                CoveredBodyLorryDao coveredLorryDao = new CoveredBodyLorryDao();
                coveredLorryDao.addDriverToLorry(coveredLorryDao.getCoveredBodyLorry(licensePlate),
                                                 driverDao.gerDriver(passportID));
                break;
            case 2:
                IsothermalLorryDao isothermalLorryDao = new IsothermalLorryDao();
                isothermalLorryDao.addDriverToLorry(isothermalLorryDao.getIsothermalLorry(licensePlate),
                                                    driverDao.gerDriver(passportID));
                break;
            case 3:
                RefrigeratorLorryDao refrigeratorLorryDao = new RefrigeratorLorryDao();
                refrigeratorLorryDao.addDriverToLorry(refrigeratorLorryDao.getRefrigeratorLorry(licensePlate),
                                                      driverDao.gerDriver(passportID));
                break;
            case 4:
                UncoveredBodyLorryDao uncoveredLorryDao = new UncoveredBodyLorryDao();
                uncoveredLorryDao.addDriverToLorry(uncoveredLorryDao.getUncoveredBodyLorry(licensePlate),
                                                   driverDao.gerDriver(passportID));
        }
    }
}
