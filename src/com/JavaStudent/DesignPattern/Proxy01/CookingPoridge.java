package com.JavaStudent.DesignPattern.Proxy01;

public class CookingPoridge implements  CookingMeal{
    String products;

    public CookingPoridge(String products) {
        this.products = products;
        cleaningProducts();
    }

    @Override
    public void cooking() {
        System.out.println("Add products: " + products);
    }

    public void cleaningProducts(){
        System.out.println("Clreaning products: " + products);
    }
}
