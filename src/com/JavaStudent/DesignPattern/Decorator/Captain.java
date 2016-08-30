package com.JavaStudent.DesignPattern.Decorator;

public class Captain extends SeafarerDecorator {
    public Captain(Seafarer seafarer) {
        super(seafarer);
    }

    public String DriverShip(){
        return "Drive a ship.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + DriverShip();
    }
}
