package com.JavaStudent.DesignPattern.Builder;

public class LasagnaDish extends DishBuilder{
    @Override
    public void buildName() {
        dish.setName("Lasagna");
    }

    @Override
    public void buildPrice() {
        dish.setPrice(35);
    }

    @Override
    public void buildPotrionsWeight() {
        dish.setPortionsWeight(300);
    }

    @Override
    public void buildDiet() {
        dish.setFoodDiet(FoodDiet.NORMAL);
    }
}
