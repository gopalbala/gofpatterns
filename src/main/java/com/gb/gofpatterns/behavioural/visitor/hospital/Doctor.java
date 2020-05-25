package com.gb.gofpatterns.behavioural.visitor.hospital;

public class Doctor implements WardVisitor {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void visit(GeneralWard generalWard) {
        for (Patient patient : generalWard.patients) {
            System.out.println("Treated patient " + patient.getName());
            patient.setTreatment("Take med1");
            System.out.println("Prescribed patient " + patient.getTreatment());
        }
    }

    @Override
    public void visit(EmergencyWard emergencyWard) {
        for (Patient patient : emergencyWard.patients) {
            System.out.println("Treated patient " + patient.getName());
            patient.setTreatment("Take med1, Take this theraphy");
            System.out.println("Prescribed patient " + patient.getTreatment());
        }
    }

    @Override
    public void visit(IcuWard icuWard) {
        for (Patient patient : icuWard.patients) {
            System.out.println("Treated patient " + patient.getName());
            patient.setTreatment("Take med1");
            System.out.println("Prescribed patient " + patient.getTreatment());
        }
    }
}
