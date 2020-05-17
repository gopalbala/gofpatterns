package com.gb.gofpatterns.abstractfactory.carspares;

public class MahindraSuvHandle extends Handle {
    public MahindraSuvHandle(Color color) {
        super(color);
        this.setColor(color);
        this.setProductId("MSUV001");
        this.setPrice(1800d);
        this.setDescription("SUV handle");
    }
}
