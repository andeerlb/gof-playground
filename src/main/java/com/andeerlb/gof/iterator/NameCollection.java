package com.andeerlb.gof.iterator;

public class NameCollection implements Collection<String> {
    private String[] names = {"Lucas", "Diego", "Guilherme"};

    public Iterator<String> createIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        int index = 0;

        public boolean hasNext() {
            return index < names.length;
        }

        public String next() {
            return hasNext() ? names[index++] : null;
        }
    }
}
