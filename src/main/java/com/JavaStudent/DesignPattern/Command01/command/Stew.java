package com.JavaStudent.DesignPattern.Command01.command;

import com.JavaStudent.DesignPattern.Command01.Multicooker;

public class Stew implements CookerCommand{
    Multicooker multicooker;

    public Stew(Multicooker multicooker) {
        this.multicooker = multicooker;
    }

    @Override
    public void doCommand() {
        multicooker.stew();
    }
}
