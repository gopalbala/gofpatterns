package com.gb.gofpatterns.visitor.wikipedia;

public interface CarPartVisitor {
    String visit(Door door);

    String visit(Wheel wheel);

    String visit(Engine engine);
}
