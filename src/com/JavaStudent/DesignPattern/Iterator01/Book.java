package com.JavaStudent.DesignPattern.Iterator01;

public class Book implements Collection {
    private String name;
    private String[] line;

    public Book(String name, String[] line) {
        this.name = name;
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLine() {
        return line;
    }

    public void setLine(String[] line) {
        this.line = line;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator{
        int index;

        @Override
        public boolean hashNext() {
            if(index<line.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return line[index++];
        }
    }
}
