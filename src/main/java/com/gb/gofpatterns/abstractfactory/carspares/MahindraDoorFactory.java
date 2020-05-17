package com.gb.gofpatterns.abstractfactory.carspares;

public class MahindraDoorFactory extends DoorFactory {
    @Override
    public Handle getHandle(CarType carType, Color color) {
        switch (carType) {
            case SUV:
                return new MahindraSuvHandle(color);
            case HATCHBACK:
                return new MahindraHatchbackHandle(color);
            case SEDAN:
            default:
                return null;
        }
    }
}
