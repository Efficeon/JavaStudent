package com.JavaStudent.DesignPattern.FactoryMethod01;

public class BedFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Bed();
    }
}
