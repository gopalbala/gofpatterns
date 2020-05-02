package com.gb.gofpatterns.visitor.wikipedia;

public class Door implements CarPart {
    @Override
    public void accept(CarPartVisitor carPartVisitor) {
        carPartVisitor.visit(this);
    }
}
