package com.gb.gofpatterns.creational.abstractfactory;

public class TataHatchbackDoorHandle extends DoorHandle {

    public TataHatchbackDoorHandle(Color color) {
        super(color);
        this.setColor(color);
        this.setProductId("THBK001");
        this.setPrice(1100d);
        this.setDescription("Tata Hatchback handle with color " + color);
    }
}
