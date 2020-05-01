package com.gb.gofpatterns.visitor.hospital;

import java.time.LocalDateTime;

public class Patient {
    private String name;
    private String treatment;
    private LocalDateTime dateOfAdmission;

    public Patient() {

    }

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public LocalDateTime getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDateTime dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
}
