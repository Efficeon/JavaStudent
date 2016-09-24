package com.JavaStudent.DesignPattern.Bridge;

import com.JavaStudent.DesignPattern.Bridge.Developer;

public abstract class Program {
    protected Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
