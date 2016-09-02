package com.JavaStudent.DesignPattern.Command01;

import com.JavaStudent.DesignPattern.Command01.command.Bake;
import com.JavaStudent.DesignPattern.Command01.command.Boil;
import com.JavaStudent.DesignPattern.Command01.command.Fry;
import com.JavaStudent.DesignPattern.Command01.command.Stew;

public class MulticookerRunner {
    public static void main(String[] args) {
        Multicooker multicooker = new Multicooker();
        Cook cook = new Cook(new Bake(multicooker), new Boil(multicooker), new Fry(multicooker), new Stew(multicooker));

        cook.commandBake();
        cook.commandFry();
        cook.commandStew();
        cook.commandBoil();
    }
}
