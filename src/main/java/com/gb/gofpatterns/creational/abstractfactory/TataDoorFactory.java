package com.gb.gofpatterns.creational.abstractfactory;

public class TataDoorFactory extends DoorFactory {
    @Override
    public DoorHandle getHandle(CarType carType, Color color) {
        switch (carType) {
            case SUV:
                return new TataSuvDoorHandle(color);
            case HATCHBACK:
                return new TataHatchbackDoorHandle(color);
            case SEDAN:
                return new TataSedanDoorHandle(color);
            default:
                return null;
        }
    }
}
