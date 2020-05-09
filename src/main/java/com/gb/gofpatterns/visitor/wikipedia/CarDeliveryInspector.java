package com.gb.gofpatterns.visitor.wikipedia;

public class CarDeliveryInspector implements CarPartVisitor {
    @Override
    public void visit(Door door) {
        System.out.println("Inspected the door. Lock and unlock verified.");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Inspected all wheels, Wheels are fine. Air pressure is maintained");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Inspected the engine, serviced, no noise");
    }
}
