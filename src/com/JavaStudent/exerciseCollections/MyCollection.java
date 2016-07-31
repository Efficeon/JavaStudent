package com.JavaStudent.exerciseCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class MyCollection extends ArrayList {
    //размер коллекции по умолканию
    private static final int COLLECTION_SIZE_DEFAULT = 10;

    public static int[] collection;
    public int size;

    public MyCollection() {
        this.collection = new int[COLLECTION_SIZE_DEFAULT];
        size = collection.length;
        fillingDefaultArray();
    }

    //автозаполнение коллекции случайными числами
    private void fillingDefaultArray() {
        int element;
        int min = 20;
        int max = 100;

        for (int i = 0; i < size; i++) {
            element = min + (int) (Math.random() * ((max - min) + 1));
            this.collection[i] = element;
        }
    }

    //добавление элемента в начало коллекции
    public void addToFirst(int newElement) {
        ensureCapacity(++size);
        System.arraycopy(collection, 0, collection, 1, size - 1);
        collection[0] = newElement;
        incElements(newElement);
    }

    //добавление элемента по номеру индекса элемента
    public void addToIndex(int index, int newElement) {
        ensureCapacity(++size);
        System.arraycopy(collection, index, collection, index + 1, size - (index + 1));
        collection[index] = newElement;
        incElements(newElement);
    }

    //добавление элемента в конец коллекции
    public void addToEnd(int newElement) {
        ensureCapacity(++size);
        collection[size - 1] = newElement;
        incElements(newElement);
    }

    //удаление элемента в начале коллекции
    public void delToFirst() {
        int temp[] = new int[size - 1];
        int dellElementValue = collection[0];
        System.arraycopy(collection, 1, temp, 0, temp.length);
        collection = temp;
        ensureCapacity(--size);
        decElements(dellElementValue);
    }

    //удаление элемента по номеру индекса элемента
    public void delToIndex(int index) {

        int temp[] = new int[size - 1];
        int dellElementValue = collection[index];
        System.arraycopy(collection, 0, temp, 0, index);
        System.arraycopy(collection, index + 1, temp, index, size - (index + 1));
        collection = temp;
        ensureCapacity(--size);
        decElements(dellElementValue);
    }

    //удаление последнего элемента коллекции
    public void delToEnd() {
        int temp[] = new int[size - 1];
        int dellElementValue = collection[size - 1];
        System.arraycopy(collection, 0, temp, 0, temp.length);
        collection = temp;
        ensureCapacity(--size);
        decElements(dellElementValue);
    }


    // увеличение каждого элемента коллекции на заначение добавленного элемента
    private void incElements(int newElement) {
        for (int i = 0; i < size; i++) {
            collection[i] += newElement;
        }
    }

    // вычитание из каждого элемента коллекции на заначение удаленного элемента
    private void decElements(int newElement) {
        for (int i = 0; i < size; i++) {
            collection[i] -= newElement;
        }
    }

    @Override
    public void ensureCapacity(int newSizeCollection) {
        collection = Arrays.copyOf(collection, newSizeCollection);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuffer line = new StringBuffer();
        line.append("[ ");
        for (int i = 0; i < collection.length; i++) {
            line.append(collection[i]);
            line.append(" ");
        }
        line.append("]");
        return line.toString();
    }
}
