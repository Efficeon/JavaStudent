package com.JavaStudent.MotorDeport.model.application;

import com.JavaStudent.MotorDeport.model.Car;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class ApplicationForLorry implements ApplicationForTransport{
    private static int ID = 0;       //ID заявки
    private byte lengthOfBody;       //Длинна груза
    private byte widthOfBody;        //Ширина груза
    private byte heightOfBody;       //Высота груза
    private byte cargoWeight;        //Вес груза
    private Car car;                 //Автомобиль

    public ApplicationForLorry(byte lengthOfBody, byte widthOfBody, byte heightOfBody, byte cargoWeight, Car car){
        this.ID++;
        this.lengthOfBody = lengthOfBody;
        this.widthOfBody = widthOfBody;
        this.heightOfBody = heightOfBody;
        this.cargoWeight = cargoWeight;
        this.car = car;
    }

    public static int getID() {
        return ID;
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

    public byte getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(byte cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
