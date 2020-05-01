package com.gb.gofpatterns.visitor.hospital;

public class Dietician implements WardVisitor {
    @Override
    public void visit(GeneralWard generalWard) {
        for (Patient patient : generalWard.patients) {
            System.out.println("Treated patient " + patient.getName());
            patient.setTreatment("Take proteins and vitamins");
            System.out.println("Prescribed patient " + patient.getTreatment());
        }
    }

    @Override
    public void visit(EmergencyWard emergencyWard) {
        for (Patient patient : emergencyWard.patients) {
            System.out.println("Treated patient " + patient.getName());
            patient.setTreatment("Take more proteins");
            System.out.println("Prescribed patient " + patient.getTreatment());
        }
    }

    @Override
    public void visit(IcuWard icuWard) {
        for (Patient patient : icuWard.patients) {
            patient.setTreatment("Take no food");
            System.out.println("Prescribed patient " + patient.getTreatment());
        }
    }
}
