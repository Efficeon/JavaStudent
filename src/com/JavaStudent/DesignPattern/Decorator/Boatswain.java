package com.JavaStudent.DesignPattern.Decorator;

public class Boatswain extends SeafarerDecorator{
    public Boatswain(Seafarer seafarer) {
        super(seafarer);
    }

    public String ManageTeam(){
        return "Manages the team. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + ManageTeam();
    }
}
