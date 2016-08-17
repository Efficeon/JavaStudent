package com.JavaStudent.Shildt.part1.Chapter13;

public class MyClass01 {
    int a;
    int b;

    // инициализировать поля a и b по отдельности
    MyClass01(int i, int j) {
        a = i;
        b = j;
    }

    // инициализировать поля a и b одним и тем же значением
    MyClass01(int i) {
        a = i;
        b = i;
    }

    // присвоить полям a и b нулевое знвчение по умолчанию
    MyClass01( ) {
        a = 0;
        b = 0;
    }
}
