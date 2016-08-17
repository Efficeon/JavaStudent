package com.JavaStudent.exerciseCollections;

public class TestMyCollection {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();

        //проверка автозаполнения коллекции
        System.out.println(myCollection);

        //проверка добавления элемента в начало коллекции
        myCollection.addToFirst(10);
        System.out.println(myCollection);
        //System.out.println(myCollection.size());

        //проверка добавления элемента в конец коллекции
        myCollection.addToEnd(10);
        System.out.println(myCollection);
        //System.out.println(myCollection.size());

        //проверка добавления элемента в средину коллекции
        myCollection.addToIndex(1, 10);
        System.out.println(myCollection);
        //System.out.println(myCollection.size());

        //проверка удаления элемента из начала коллекции
        myCollection.delToFirst();
        System.out.println(myCollection);
        //System.out.println(myCollection.size());

        //проверка удаления элемента из конца коллекции
        myCollection.delToEnd();
        System.out.println(myCollection);
        //System.out.println(myCollection.size());

        //проверка удаления элемента из средины коллекции
        myCollection.delToIndex(1);
        System.out.println(myCollection);
        //System.out.println(myCollection.size());
    }
}
