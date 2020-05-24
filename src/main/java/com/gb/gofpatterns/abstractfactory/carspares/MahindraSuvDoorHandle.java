package com.gb.gofpatterns.abstractfactory.carspares;

public class MahindraSuvDoorHandle extends DoorHandle {
    public MahindraSuvDoorHandle(Color color) {
        super(color);
        this.setColor(color);
        this.setProductId("MSUV001");
        this.setPrice(1802d);
        this.setDescription("SUV handle with color" + color);
    }
}
