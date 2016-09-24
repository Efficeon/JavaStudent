package com.JavaStudent.DesignPattern.FactoryMethod01;

public class SofaFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Sofa();
    }
}
