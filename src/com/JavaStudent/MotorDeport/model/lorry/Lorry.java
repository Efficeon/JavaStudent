package com.JavaStudent.MotorDeport.model.lorry;

import com.JavaStudent.MotorDeport.model.Car;

public abstract class Lorry implements Car
{
    protected int ID;                        //ID автомобиля
    protected byte carryingCapacity;         //Грузоподъемность
    protected byte lengthOfBody;             //Длинна
    protected byte widthOfBody;              //Ширина
    protected byte heightOfBody;             //Высота
    protected boolean technicalDiagnostics;  //Техническая диагностика

    protected Lorry(int ID, byte carryingCapacity, byte lengthOfBody, byte widthOfBody,
                             byte heightOfBody, boolean technicalDiagnostics) {
        this.ID = ID;
        this.carryingCapacity = carryingCapacity;
        this.lengthOfBody = lengthOfBody;
        this.widthOfBody = widthOfBody;
        this.heightOfBody = heightOfBody;
        this.technicalDiagnostics = technicalDiagnostics;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public byte getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(byte carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public byte getLengthOfBody() {
        return lengthOfBody;
    }

    public void setLengthOfBody(byte lengthOfBody) {
        this.lengthOfBody = lengthOfBody;
    }

    public byte getWidthOfBody() {
        return widthOfBody;
    }

    public void setWidthOfBody(byte widthOfBody) {
        this.widthOfBody = widthOfBody;
    }

    public byte getHeightOfBody() {
        return heightOfBody;
    }

    public void setHeightOfBody(byte heightOfBody) {
        this.heightOfBody = heightOfBody;
    }

    public boolean isTechnicalDiagnostics() {
        return technicalDiagnostics;
    }

    public void setTechnicalDiagnostics(boolean technicalDiagnostics){
        this.technicalDiagnostics = technicalDiagnostics;
    }
}

