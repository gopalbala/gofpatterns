package com.gb.gofpatterns.decorator.vehiclerental;

public class PeakSeasonDecorator extends HireDecorator {
    public PeakSeasonDecorator(HireableVehicle hireableVehicle) {
        super(hireableVehicle);
    }

    @Override
    public String getRegistrationNumber() {
        return hireableVehicle.getRegistrationNumber();
    }

    @Override
    public String getMake() {
        return hireableVehicle.getMake();
    }

    @Override
    public String getModel() {
        return hireableVehicle.getModel();
    }

    @Override
    public double getPrice() {
        return hireableVehicle.getPrice() + hireableVehicle.getPrice() * .15;
    }
}
