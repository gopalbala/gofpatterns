package com.gb.gofpatterns.visitor.hospital;

import java.util.List;

public class IcuWard implements Ward {
    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

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
