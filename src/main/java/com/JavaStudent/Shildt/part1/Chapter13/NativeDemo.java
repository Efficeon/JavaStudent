package com.JavaStudent.Shildt.part1.Chapter13;

public class NativeDemo {
    int i;
    public static void main(String args[]) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;
        System.out.println("Содержимое переменной ob.i перед вызовом" +
                "платформенно-ориентированного метода:" +
                ob.i);
        ob.test(); // Вызвать платформенно-ориентированный метод
        System.out.println("Содержимое переменной ob.i перед вызовом" +
                "платформенно-ориентированного метода:" +
                ob.i);
    }
    // обьявить платформенно-ориентированный метод
    public native void test() ;
    // загрузить библиотеку DLL содержащую статический метод
    static {
        System.loadLibrary("NativeDemo");
    }
}
