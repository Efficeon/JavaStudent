package com.JavaStudent.DesignPattern.Chain;

public class SimpleReportNotifier extends Notifier{


    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using report: " + message);
    }
}
