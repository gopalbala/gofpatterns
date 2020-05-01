package com.gb.gofpatterns.visitor.hospital;

import java.util.List;

public class EmergencyWard implements Ward {
    int floor;
    List<Patient> patients;

    @Override
    public String name() {
        return "EmergencyWard";
    }

    @Override
    public void accept(WardVisitor wardVisitor) {
        wardVisitor.visit(this);
    }
}
