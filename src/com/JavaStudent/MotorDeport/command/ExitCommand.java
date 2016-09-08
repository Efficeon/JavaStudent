package com.JavaStudent.MotorDeport.command;

import com.JavaStudent.MotorDeport.model.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
