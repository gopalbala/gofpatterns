package com.gb.gofpatterns.abstractfactory.carspares;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TataSuvHandle extends Handle {
    public TataSuvHandle(Color color) {
        super(color);
        this.setColor(color);
        this.setProductId("TSUV001");
        this.setPrice(1800d);
        this.setDescription("Tata SUV handle");
    }
}
