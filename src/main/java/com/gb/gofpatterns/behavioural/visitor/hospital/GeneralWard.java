package com.gb.gofpatterns.behavioural.visitor.hospital;

import java.util.List;

public class GeneralWard implements Ward {
    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

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
