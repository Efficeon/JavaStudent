package com.JavaStudent.DesignPattern.Builder01;

public class Director {
    DishBuilder builder;

    public void setBuilder(DishBuilder builder) {
        this.builder = builder;
    }

    public Dish buildDish(){
        builder.creareDish();
        builder.buildName();
        builder.buildPotrionsWeight();
        builder.buildPrice();
        builder.buildDiet();

        Dish dish = builder.getDish();

        return dish;
    }
}
