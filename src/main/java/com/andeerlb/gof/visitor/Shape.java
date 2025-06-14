package com.andeerlb.gof.visitor;

interface Shape {
    String accept(Visitor visitor);
}
