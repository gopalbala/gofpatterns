package com.gb.gofpatterns.behavioural.visitor.hospital;

public interface WardVisitor {
    void visit(GeneralWard generalWard);

    void visit(EmergencyWard emergencyWard);

    void visit(IcuWard icuWard);
}
