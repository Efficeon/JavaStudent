package com.JavaStudent.Shildt.part1.Chapter09;

public interface MyIF01 {
    int getNumber();

    default String getString() {
        return "Обьект типа String по умолчанию";
    }
}
