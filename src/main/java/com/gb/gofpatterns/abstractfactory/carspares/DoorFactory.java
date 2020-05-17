package com.gb.gofpatterns.abstractfactory.carspares;

public abstract class DoorFactory {
    public abstract DoorHandle getHandle(CarType carType, Color color);
}
