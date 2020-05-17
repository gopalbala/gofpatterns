package com.gb.gofpatterns.abstractfactory.carspares;

public class TataDoorFactory extends DoorFactory {
    @Override
    public Handle getHandle(CarType carType, Color color) {
        switch (carType) {
            case SUV:
                return new TataSuvHandle(color);
            case HATCHBACK:
                return new TataHatchbackHandle(color);
            case SEDAN:
                return new TataSedanHandle(color);
            default:
                return null;
        }
    }
}
