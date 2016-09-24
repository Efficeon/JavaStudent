package com.JavaStudent.Shildt.part1.Chapter12;

public enum Apple {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);

    Apple(int p){
        price = p;
    }

    Apple(){
        price = -1;
    }

    private int price;

    int getPrice(){
        return price;
    }
}
