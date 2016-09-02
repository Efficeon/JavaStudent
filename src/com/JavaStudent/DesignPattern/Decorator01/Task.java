package com.JavaStudent.DesignPattern.Decorator01;

public class Task {
    public static void main(String[] args) {
        Seafarer seafarer = new Captain(new Boatswain(new Sailor()));
        System.out.println(seafarer.makeJob());
    }
}


