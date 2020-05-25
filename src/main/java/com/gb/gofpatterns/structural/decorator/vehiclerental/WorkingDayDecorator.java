package com.gb.gofpatterns.structural.decorator.vehiclerental;

public class WorkingDayDecorator extends HireDecorator {
    public WorkingDayDecorator(HireableVehicle hireableVehicle) {
        super(hireableVehicle);
    }

    @Override
    public String getRegistrationNumber() {
        return super.getRegistrationNumber();
    }

    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
