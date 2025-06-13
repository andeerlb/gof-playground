package com.andeerlb.gof.iterator;

interface Iterator<T> {
    boolean hasNext();
    T next();
}