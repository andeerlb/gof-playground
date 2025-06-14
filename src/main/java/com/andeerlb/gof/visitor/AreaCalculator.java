package com.andeerlb.gof.visitor;

class AreaCalculator implements Visitor {
    @Override
    public String visit(Dot dot) {
        return "Calculating area for Dot.";
    }

    @Override
    public String visit(Circle circle) {
        return "Calculating area for Circle.";
    }
}
