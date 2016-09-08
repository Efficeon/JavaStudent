package com.JavaStudent.MotorDeport.model.passengerCar;

import com.JavaStudent.MotorDeport.model.Car;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public abstract class PassengerCar implements Car
{
    protected int ID;                         //ID автомобиля
    protected byte numberOfPassengers;        //Количество пасажиров
    protected boolean technicalTrunk;         //Техническая диагностика

    protected PassengerCar(int ID, byte numberOfPassengers, boolean technicalTrunk) {
        this.ID = ID;
        this.numberOfPassengers = numberOfPassengers;
        this.technicalTrunk = technicalTrunk;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public byte getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(byte numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean isTechnicalTrunk() {
        return technicalTrunk;
    }

    public void setTechnicalTrunk(boolean technicalTrunk) {
        this.technicalTrunk = technicalTrunk;
    }
}
