package com.gb.gofpatterns.abstractfactory.carspares;

public class TataSuvDoorHandle extends DoorHandle {
    public TataSuvDoorHandle(Color color) {
        super(color);
        this.setColor(color);
        this.setProductId("TSUV001");
        this.setPrice(1800d);
        this.setDescription("Tata SUV handle");
    }
}
