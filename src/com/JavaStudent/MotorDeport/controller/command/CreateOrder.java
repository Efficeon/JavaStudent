package com.JavaStudent.MotorDeport.controller.command;

import com.JavaStudent.MotorDeport.model.ConsoleHelper;

import java.io.IOException;

public class CreateOrder implements Command{
    @Override
    public void execute() throws IOException {
        ConsoleHelper.writeMessage("Выберите тип заявки: ");
        ConsoleHelper.writeMessage("Заявка на грузовую перевозку - укажите 1");
        ConsoleHelper.writeMessage("Заявка на перевозку пассажиров - укажите 2");

        int command = ConsoleHelper.readInt();

        /*if (command == 1) {
            byte lengthOfBody = (byte) ConsoleHelper.readInt();
            byte widthOfBody = (byte) ConsoleHelper.readInt();
            byte heightOfBody = (byte) ConsoleHelper.readInt();
            byte cargoWeight = (byte) ConsoleHelper.readInt();
            Car car =
            ApplicationForLorryFactory applicationForLorry = null;
            applicationForLorry.create();
        }*/
    }
}
