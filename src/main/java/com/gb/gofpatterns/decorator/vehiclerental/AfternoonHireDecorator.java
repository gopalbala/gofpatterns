package com.gb.gofpatterns.decorator.vehiclerental;

public class AfternoonHireDecorator extends HireDecorator {

    public AfternoonHireDecorator(HireableVehicle hireableVehicle) {
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
        return hireableVehicle.getPrice() * .85;
    }
}
