package com.JavaStudent.MotorDeport.model.order;

import com.JavaStudent.MotorDeport.model.Car;

public class OrderForPassengerCar {
    private static int ID = 0;         //ID заявки
    private int numberOfPassengers;    //Количество пассажиров
    private Car car;                   //Автомобиль

    public OrderForPassengerCar(int numberOfPassengers, Car car) {
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
