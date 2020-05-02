package com.gb.gofpatterns.visitor.wikipedia;

public class CarDeliveryInspector implements CarPartVisitor {
    @Override
    public String visit(Door door) {
        return "Inspected door";
    }

    @Override
    public String visit(Wheel wheel) {
        return "Inspected wheel";
    }

    @Override
    public String visit(Engine engine) {
        return "Inspected engine";
    }
}
