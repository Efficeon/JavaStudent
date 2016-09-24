package com.JavaStudent.DesignPattern.Flyweigh01;

import java.util.ArrayList;
import java.util.List;

public class CookRunner {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        List<Food> foods = new ArrayList<>();

        foods.add(foodFactory.getFood("Onion"));
        foods.add(foodFactory.getFood("Onion"));
        foods.add(foodFactory.getFood("Onion"));
        foods.add(foodFactory.getFood("Potatoes"));
        foods.add(foodFactory.getFood("Tomatoes"));

        for (Food food : foods){
            food.writeName();
        }
    }
}
