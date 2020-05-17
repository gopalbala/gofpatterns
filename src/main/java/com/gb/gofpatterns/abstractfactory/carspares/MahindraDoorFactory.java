package com.gb.gofpatterns.abstractfactory.carspares;

public class MahindraDoorFactory extends DoorFactory {
    @Override
    public DoorHandle getHandle(CarType carType, Color color) {
        switch (carType) {
            case SUV:
                return new MahindraSuvDoorHandle(color);
            case HATCHBACK:
                return new MahindraHatchbackDoorHandle(color);
            case SEDAN:
            default:
                return null;
        }
    }
}
