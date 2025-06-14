package com.andeerlb.gof.visitor;

class Dot implements Shape {
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
