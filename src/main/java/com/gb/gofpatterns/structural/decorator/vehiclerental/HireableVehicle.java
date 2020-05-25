package com.gb.gofpatterns.structural.decorator.vehiclerental;

public abstract class HireableVehicle {
    private String registrationNumber;
    private String make;
    private String model;
    private double price;

    public abstract String getRegistrationNumber();

    public abstract String getMake();

    public abstract String getModel();

    public abstract double getPrice();

}
