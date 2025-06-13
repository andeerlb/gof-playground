package com.andeerlb.gof.iterator;

interface Collection<T> {
    Iterator<T> createIterator();
}
