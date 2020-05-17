package com.gb.gofpatterns.abstractfactory.carspares;

public abstract class DoorFactory {
    public abstract Handle getHandle(CarType carType, Color color);
}
