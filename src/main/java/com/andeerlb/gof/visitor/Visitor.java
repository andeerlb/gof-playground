package com.andeerlb.gof.visitor;

public interface Visitor {
    String visit(Dot dot);
    String visit(Circle circle);
}
