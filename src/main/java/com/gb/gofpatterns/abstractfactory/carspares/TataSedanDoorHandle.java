package com.gb.gofpatterns.abstractfactory.carspares;

public class TataSedanDoorHandle extends DoorHandle {
    public TataSedanDoorHandle(Color color) {
        super(color);
        this.setColor(color);
        this.setProductId("TSDN001");
        this.setPrice(1404d);
        this.setDescription("Tata Sedan handle with color " + color);
    }
}
