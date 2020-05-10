package com.gb.gofpatterns.decorator.vehiclerental;

public class HondaCity extends HireableVehicle {
    @Override
    public String getRegistrationNumber() {
        return "KA01AC3322";
    }

    @Override
    public String getMake() {
        return "Honda";
    }

    @Override
    public String getModel() {
        return "City 2020 ZX";
    }

    @Override
    public double getPrice() {
        return 4000.0d;
    }
}
