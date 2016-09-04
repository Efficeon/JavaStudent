package com.JavaStudent.DesignPattern.Observer;

public interface Odserved {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
