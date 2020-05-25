package com.gb.gofpatterns.creational.abstractfactory;

public abstract class DoorFactory {
    public abstract DoorHandle getHandle(CarType carType, Color color);
}
