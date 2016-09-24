package com.JavaStudent.DesignPattern.FactoryMethod01;

public class Program {
    public static void main(String[] args) {
        FurnitureFactory factory = createFurnitureFactoryByType("Sofa");
        Furniture furniture = factory.createFurniture();
        furniture.writeName();
    }

    static FurnitureFactory createFurnitureFactoryByType(String type){
        if (type.equals("Chair")){
            return new ChairFactory();
        } else if (type.equals("Bed")){
            return new BedFactory();
        } else if (type.equals("Sofa")){
            return new SofaFactory();
        } else throw new RuntimeException("This furniture not found.");
    }
}
