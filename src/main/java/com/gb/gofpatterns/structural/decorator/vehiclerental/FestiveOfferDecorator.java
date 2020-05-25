package com.gb.gofpatterns.structural.decorator.vehiclerental;

public class FestiveOfferDecorator extends HireDecorator {
    public FestiveOfferDecorator(HireableVehicle hireableVehicle) {
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
        return hireableVehicle.getPrice() * .85d;
    }
}
