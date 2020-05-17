package com.gb.gofpatterns.abstractfactory.carspares;

public class MahindraHatchbackDoorHandle extends DoorHandle {

    public MahindraHatchbackDoorHandle(Color color) {
        super(color);
        this.setColor(color);
        this.setProductId("MHBK001");
        this.setPrice(1200d);
        this.setDescription("Mahindra Hatchback handle");
    }
}
