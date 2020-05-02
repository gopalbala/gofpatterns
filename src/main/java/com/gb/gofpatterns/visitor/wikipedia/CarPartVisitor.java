package com.gb.gofpatterns.visitor.wikipedia;

public interface CarPartVisitor {
    void visit(Door door);

    void visit(Wheel wheel);

    void visit(Engine engine);
}
