package com.JavaStudent.DesignPattern.Bridge;

public class StockExchange extends Program{
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stoke Exchange development in progress...");
        developer.writeCode();
    }
}
