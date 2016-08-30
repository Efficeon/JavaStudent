package com.JavaStudent.DesignPattern.FactoryMethod01;

public class ChairFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Chair();
    }
}
