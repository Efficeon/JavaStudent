package com.JavaStudent.DesignPattern.Command01.command;

import com.JavaStudent.DesignPattern.Command01.Multicooker;

public class Boil implements CookerCommand{
    Multicooker multicooker;

    public Boil(Multicooker multicooker) {
        this.multicooker = multicooker;
    }

    @Override
    public void doCommand() {
        multicooker.boil();
    }
}
