package com.JavaStudent.DesignPattern.Builder01;

public class BuildDishRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new Fricassee());

        Dish dish = director.buildDish();

        System.out.println(dish.toString());
    }
}
