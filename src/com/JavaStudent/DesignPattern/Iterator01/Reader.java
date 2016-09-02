package com.JavaStudent.DesignPattern.Iterator01;

public class Reader {
    public static void main(String[] args) {
        String[] line = {"one", "two", "three", "four", "five"};
        Book book = new Book("History", line);

        Iterator iterator = book.getIterator();
        System.out.println("Book: " + book.getName());

        while (iterator.hashNext()){
            System.out.println(iterator.next().toString()+ " ");
        }
    }
}
