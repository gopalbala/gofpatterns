package com.gb.gofpatterns.creational.abstractfactory;

public class MahindraSuvDoorHandle extends DoorHandle {
    public MahindraSuvDoorHandle(Color color) {
        super(color);
        this.setColor(color);
        this.setProductId("MSUV001");
        this.setPrice(1802d);
        this.setDescription("SUV handle with color" + color);
    }
}
