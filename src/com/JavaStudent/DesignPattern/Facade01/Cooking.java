package com.JavaStudent.DesignPattern.Facade01;

public class Cooking {
    Cook cook = new Cook();
    Stove stove = new Stove();

    public void cookingMeal(){
        stove.tornOnStove();
        cook.doJob();
    }
}
