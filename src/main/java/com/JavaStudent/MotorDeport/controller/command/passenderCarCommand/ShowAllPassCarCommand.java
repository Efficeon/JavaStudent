package com.JavaStudent.MotorDeport.controller.command.passenderCarCommand;

import com.JavaStudent.MotorDeport.controller.command.Command;
import com.JavaStudent.MotorDeport.dao.passengerCarDao.*;
import com.JavaStudent.MotorDeport.View.ConsoleHelper;

import java.io.IOException;

public class ShowAllPassCarCommand implements Command{
    @Override
    public void execute() throws IOException, ClassNotFoundException {
        ConsoleHelper.writeMessage("Укажите тип автомобиля (1-Хэ́тчбек; 2-Микрокар; 3-Минивен; 4-Седан): ");
        int typeBody = ConsoleHelper.readInt();

        PassengerCarDao passengerCarDao = null;
        switch (typeBody){
            case 1:
                passengerCarDao = new HatchbackDao();
                break;
            case 2:
                passengerCarDao = new MicrocarDao();
                break;
            case 3:
                passengerCarDao = new MinivanDao();
                break;
            case 4:
                passengerCarDao = new SedanDao();
        }
        passengerCarDao.showDatabasePassengerCar();
    }
}
