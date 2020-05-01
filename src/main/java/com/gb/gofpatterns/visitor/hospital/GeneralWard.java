package com.gb.gofpatterns.visitor.hospital;

import java.util.List;

public class GeneralWard implements Ward {
    int floor;
    List<Patient> patients;

    @Override
    public String name() {
        return "GeneralWard";
    }

    @Override
    public void accept(WardVisitor wardVisitor) {
        wardVisitor.visit(this);
    }
}
