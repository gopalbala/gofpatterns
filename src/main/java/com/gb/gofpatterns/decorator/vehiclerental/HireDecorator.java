package com.gb.gofpatterns.decorator.vehiclerental;

public class HireDecorator extends HireableVehicle {

    HireableVehicle hireableVehicle;

    public HireDecorator(HireableVehicle hireableVehicle) {
        this.hireableVehicle = hireableVehicle;
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
        return hireableVehicle.getPrice();
    }
}
