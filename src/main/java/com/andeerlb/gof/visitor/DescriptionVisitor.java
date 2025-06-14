package com.andeerlb.gof.visitor;

class DescriptionVisitor implements Visitor {
    @Override
    public String visit(Dot dot) {
        return "Visiting Dot";
    }

    @Override
    public String visit(Circle circle) {
        return "Visiting Circle";
    }
}
