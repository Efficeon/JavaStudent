package com.JavaStudent.DesignPattern.Command01.command;

import com.JavaStudent.DesignPattern.Command01.Multicooker;

public class Fry implements CookerCommand{
    Multicooker multicooker;

    public Fry(Multicooker multicooker) {
        this.multicooker = multicooker;
    }

    @Override
    public void doCommand() {
        multicooker.fry();
    }
}
