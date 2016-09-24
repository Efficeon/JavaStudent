package com.JavaStudent.DesignPattern.Command01;

import com.JavaStudent.DesignPattern.Command01.command.*;

public class Cook {
    CookerCommand bake;
    CookerCommand boil;
    CookerCommand fry;
    CookerCommand stew;

    public Cook(CookerCommand bake, CookerCommand boil, CookerCommand fry, CookerCommand stew) {
        this.bake = bake;
        this.boil = boil;
        this.fry = fry;
        this.stew = stew;
    }

    public void commandBake(){
        bake.doCommand();
    }

    public void commandBoil(){
        boil.doCommand();
    }

    public void commandFry(){
        fry.doCommand();
    }

    public void commandStew(){
        stew.doCommand();
    }
}
