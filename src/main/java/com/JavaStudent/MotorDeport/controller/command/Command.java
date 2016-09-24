package com.JavaStudent.MotorDeport.controller.command;

import java.io.IOException;

public interface Command {
    void execute() throws IOException, ClassNotFoundException;
}
