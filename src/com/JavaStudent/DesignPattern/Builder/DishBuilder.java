package com.JavaStudent.DesignPattern.Builder;

public abstract class DishBuilder {

    Dish dish;

    public void creareDish(){
        dish = new Dish();
    }

    public abstract void buildName();

    public abstract void buildPrice();

    public abstract void buildPotrionsWeight();

    public abstract void buildDiet();

    public Dish getDish() {
        return dish;
    }
}
