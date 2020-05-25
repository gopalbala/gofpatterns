package com.gb.gofpatterns.behavioural.visitor.hospital;

import java.time.LocalDateTime;
import java.util.List;

public class HospitalMain {
    public static void main(String[] args) {
        Ward generalWard = new GeneralWard();
        Ward emergencyWard = new EmergencyWard();
        Ward icuWaard = new IcuWard();

        Patient gwp1 = new Patient("general ward p1");
        gwp1.setDateOfAdmission(LocalDateTime.now());
        Patient gwp2 = new Patient("general ward p2");
        gwp2.setDateOfAdmission(LocalDateTime.now());
        ((GeneralWard) generalWard).setPatients(List.of(gwp1, gwp2));

        Patient ewp1 = new Patient("emergency ward p1");
        gwp1.setDateOfAdmission(LocalDateTime.now());
        Patient ewp2 = new Patient("emergency ward p2");
        gwp2.setDateOfAdmission(LocalDateTime.now());
        ((EmergencyWard) emergencyWard).setPatients(List.of(gwp1, gwp2));

        Patient icup1 = new Patient("ICU ward p1");
        gwp1.setDateOfAdmission(LocalDateTime.now());
        Patient icup2 = new Patient("ICU ward p2");
        gwp2.setDateOfAdmission(LocalDateTime.now());
        ((IcuWard) icuWaard).setPatients(List.of(icup1, icup2));

        Doctor physician = new Doctor();
        Jainitor jainitor = new Jainitor();

        physician.setName("Dr.Ram");

        Dietician dietician = new Dietician();
        dietician.setName("Sita");

        generalWard.accept(physician);
        icuWaard.accept(physician);
        emergencyWard.accept(physician);
        System.out.println("----------------------------");
        generalWard.accept(dietician);
        System.out.println("----------------------------");
        generalWard.accept(jainitor);
        emergencyWard.accept(jainitor);
        icuWaard.accept(jainitor);
        System.out.println("----------------------------");

    }
}
