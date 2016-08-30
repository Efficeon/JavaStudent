package com.JavaStudent.DesignPattern.Composite01;

import com.JavaStudent.DesignPattern.Composite01.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<Food> foods = new ArrayList<Food>();

    public void addFood(Food food){
        foods.add(food);
    }

    public void removeFood(Food food){
        foods.remove(food);
    }

    public void createPizza(){
        System.out.println("Create Pizza");
        for(Food food : foods){
            food.writeName();
        }
    }
}
