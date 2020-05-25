package com.gb.gofpatterns.behavioural.visitor.wikipedia;

public interface CarPartVisitor {
    void visit(Door door);

    void visit(Wheel wheel);

    void visit(Engine engine);
}
