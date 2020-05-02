package com.gb.gofpatterns.visitor.wikipedia;

public class CarServiceEngineer implements CarPartVisitor {
    @Override
    public void visit(Door door) {
        System.out.println("Service engineer, serviced the car door. Locking problem is resolved.");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Service Engineer, Wheel alignments rare proper, air pressure is maintained.");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Service Engieer, Engine oil change is complete. Noise is less.");
    }
}
