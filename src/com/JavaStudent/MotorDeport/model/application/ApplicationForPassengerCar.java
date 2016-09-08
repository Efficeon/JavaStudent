package com.JavaStudent.MotorDeport.model.application;

import com.JavaStudent.MotorDeport.model.Car;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class ApplicationForPassengerCar implements ApplicationForTransport{
    private static int ID = 0;         //ID заявки
    private int numberOfPassengers;    //Количество пассажиров
    private Car car;                   //Автомобиль

    public ApplicationForPassengerCar(int numberOfPassengers, Car car) {
        this.ID = ID++;
        this.numberOfPassengers = numberOfPassengers;
        this.car = car;
    }

    public int getID() {
        return ID;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
