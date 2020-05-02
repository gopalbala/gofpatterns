package com.gb.gofpatterns.visitor.wikipedia;

public interface CarPart {
    void accept(CarPartVisitor carPartVisitor);
}
