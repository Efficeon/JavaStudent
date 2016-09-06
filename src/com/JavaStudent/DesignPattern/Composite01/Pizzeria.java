package com.JavaStudent.DesignPattern.Composite01;

import com.JavaStudent.DesignPattern.Composite01.food.Onion;
import com.JavaStudent.DesignPattern.Composite01.food.Potatoes;
import com.JavaStudent.DesignPattern.Composite01.food.Tomatoes;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Onion onion = new Onion();
        Potatoes potatoes = new Potatoes();
        Tomatoes tomatoes = new Tomatoes();

        pizza.addFood(onion);
        pizza.addFood(potatoes);
        pizza.addFood(tomatoes);

        pizza.createPizza();
    }
}
