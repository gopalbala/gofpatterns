package com.gb.gofpatterns.creational.abstractfactory;

public class TataSuvDoorHandle extends DoorHandle {
    public TataSuvDoorHandle(Color color) {
        super(color);
        this.setColor(color);
        this.setProductId("TSUV001");
        this.setPrice(1800d);
        this.setDescription("Tata SUV handle with color " + color);
    }
}
