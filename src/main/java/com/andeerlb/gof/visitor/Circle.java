package com.andeerlb.gof.visitor;

class Circle implements Shape {
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
