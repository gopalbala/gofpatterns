package com.gb.gofpatterns.behavioural.visitor.wikipedia;

public interface CarPart {
    void accept(CarPartVisitor carPartVisitor);
}
