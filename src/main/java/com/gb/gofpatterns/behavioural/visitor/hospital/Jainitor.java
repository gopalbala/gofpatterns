package com.gb.gofpatterns.behavioural.visitor.hospital;

public class Jainitor implements WardVisitor {
    @Override
    public void visit(GeneralWard generalWard) {
        System.out.println("Cleaned and sanitized " + generalWard.name());
    }

    @Override
    public void visit(EmergencyWard emergencyWard) {
        System.out.println("Cleaned and sanitized " + emergencyWard.name());
    }

    @Override
    public void visit(IcuWard icuWard) {
        System.out.println("Cleaned and sanitized " + icuWard.name());
    }
}
