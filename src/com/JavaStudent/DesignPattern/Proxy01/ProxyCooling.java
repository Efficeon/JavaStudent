package com.JavaStudent.DesignPattern.Proxy01;

public class ProxyCooling implements CookingMeal{
    String products;

    CookingPoridge cookingPoridge;

    public ProxyCooling(String products) {
        this.products = products;
    }

    @Override
    public void cooking() {
        if (cookingPoridge == null){
            cookingPoridge = new CookingPoridge(products);
        }
        cookingPoridge.cooking();
    }
}
