package com.gb.gofpatterns.decorator.vehiclerental;

public class HondaUnicorn extends HireableVehicle {
    @Override
    public String getRegistrationNumber() {
        return "KA01AA1234";
    }

    @Override
    public String getMake() {
        return "Honda";
    }

    @Override
    public String getModel() {
        return "Unicorn";
    }

    @Override
    public double getPrice() {
        return 800.0d;
    }
}
