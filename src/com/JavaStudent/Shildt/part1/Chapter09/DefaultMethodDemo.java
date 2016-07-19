package com.JavaStudent.Shildt.part1.Chapter09;

public class DefaultMethodDemo implements MyIF01 {
    public static void main(String args[]) {

        MyIFImp obj = new MyIFImp();
        System.out.println(obj.getNumber());
        //System.out.println(obj.getString());
    }

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public String getString() {
        return null;
    }
}
