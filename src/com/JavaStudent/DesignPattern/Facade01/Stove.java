package com.JavaStudent.DesignPattern.Facade01;

public class Stove {
    private boolean conditionStove;

    public boolean conditionStove() {
        return conditionStove;
    }

    public void tornOnStove(){
        System.out.println("Stove is torn on.");
        conditionStove = true;
    }

    public void tornOffStove(){
        System.out.println("Stove is torn off.");
        conditionStove = true;
    }
}
