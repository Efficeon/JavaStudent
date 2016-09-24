package com.JavaStudent.DesignPattern.Proxy01;

public class CookingRun {
    public static void main(String[] args) {
        CookingMeal cookingMeal = new ProxyCooling("Potatoes end meat");
        cookingMeal.cooking();
    }
}
