package com.JavaStudent.DesignPattern.Builder;

public class Fricassee extends DishBuilder{
    @Override
    public void buildName() {
        dish.setName("Fricassee");
    }

    @Override
    public void buildPrice() {
        dish.setPrice(40);
    }

    @Override
    public void buildPotrionsWeight() {
        dish.setPortionsWeight(250);
    }

    @Override
    public void buildDiet() {
        dish.setFoodDiet(FoodDiet.DIET);
    }
}
