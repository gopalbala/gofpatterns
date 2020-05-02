package com.gb.gofpatterns.visitor.wikipedia;

public class CarDeliveryInspector implements CarPartVisitor {
    @Override
    public void visit(Door door) {
        System.out.println("Inspected door");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Inspected wheel");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Inspected engine");
    }
}
