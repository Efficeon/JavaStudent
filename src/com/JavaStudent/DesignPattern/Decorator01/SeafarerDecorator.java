package com.JavaStudent.DesignPattern.Decorator01;

public class SeafarerDecorator implements Seafarer{
    Seafarer seafarer;

    public SeafarerDecorator(Seafarer seafarer) {
        this.seafarer = seafarer;
    }

    @Override
    public String makeJob() {
        return seafarer.makeJob();
    }
}
