package com.JavaStudent.Shildt.part1.Chapter09;

public class TestIface2 {
    public static void main(String args[]) {
        Callback c = new Client01();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;
        c.callback(42);
    }
}
