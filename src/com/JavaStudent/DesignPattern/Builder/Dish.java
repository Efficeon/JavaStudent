package com.JavaStudent.DesignPattern.Builder;

public class Dish {

    public Dish() {
    }

    private String name;
    private int price;
    private int portionsWeight;
    private FoodDiet foodDiet;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPortionsWeight(int portionsWeight) {
        this.portionsWeight = portionsWeight;
    }

    public void setFoodDiet(FoodDiet foodDiet) {
        this.foodDiet = foodDiet;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "Название блюда = '" + name + '\'' +
                ", цена = " + price +
                ", Вес порции = " + portionsWeight +
                ", Диета блюда = " + foodDiet +
                '}';
    }
}
