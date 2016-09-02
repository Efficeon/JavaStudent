package com.JavaStudent.DesignPattern.Command01.command;

import com.JavaStudent.DesignPattern.Command01.Multicooker;

public class Bake implements CookerCommand{
    Multicooker multicooker;

    public Bake(Multicooker multicooker) {
        this.multicooker = multicooker;
    }

    @Override
    public void doCommand() {
        multicooker.bake();

    }
}
