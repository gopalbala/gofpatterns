package com.gb.gofpatterns.behavioural.visitor.hospital;

public class Dietician implements WardVisitor {
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
            patient.setTreatment("Take proteins and vitamins");
            System.out.println("Dietician Prescribed General patient " + patient.getTreatment());
        }
    }

    @Override
    public void visit(EmergencyWard emergencyWard) {
        for (Patient patient : emergencyWard.patients) {
            System.out.println("Treated patient " + patient.getName());
            patient.setTreatment("Take more proteins");
            System.out.println("Dietician Prescribed Emergency ward patient " + patient.getTreatment());
        }
    }

    @Override
    public void visit(IcuWard icuWard) {
        for (Patient patient : icuWard.patients) {
            patient.setTreatment("Take no food");
            System.out.println("Dietician Prescribed ICU patient " + patient.getTreatment());
        }
    }
}
