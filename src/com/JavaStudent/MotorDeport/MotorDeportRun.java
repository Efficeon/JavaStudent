package com.JavaStudent.MotorDeport;

import com.JavaStudent.MotorDeport.View.CommandExecutor;

import java.io.IOException;

public class MotorDeportRun {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.askOperation();
    }
}
