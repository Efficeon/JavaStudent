package com.JavaStudent.DesignPattern.Template;

public abstract class WebsiteTemplate {
    public void showPage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("footer");
    }

    public abstract void showPageContent();
}
