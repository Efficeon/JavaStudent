package com.JavaStudent.DesignPattern.Flyweigh01;

import java.util.HashMap;
import java.util.Map;

public class FoodFactory {
    Map<String, Food> foods = new HashMap<>();

    public Food getFood(String foodName){
        Food food = foods.get(foodName);

        if (food == null) {
         switch (foodName){
                case "Onion":
                    System.out.println("Buy " + foodName);
                    food = new Onion();
                    break;
                case  "Potatoes":
                    System.out.println("Buy " + foodName);
                    food = new Potatoes();
                    break;
                case "Tomatoes":
                    System.out.println("Buy " + foodName);
                    food = new Tomatoes();
            }
            foods.put(foodName, food);
        }
        return food;
    }
}
