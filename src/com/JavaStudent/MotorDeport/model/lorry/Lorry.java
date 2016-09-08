package com.JavaStudent.MotorDeport.model.lorry;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public abstract class Lorry
{
    private int ID;                        //ID автомобиля
    private byte carryingCapacity;         //Грузоподъемность
    private byte lengthOfBody;             //Длинна
    private byte widthOfBody;              //Ширина
    private byte heightOfBody;             //Высота
    private boolean technicalDiagnostics;  //Техническая диагностика

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

