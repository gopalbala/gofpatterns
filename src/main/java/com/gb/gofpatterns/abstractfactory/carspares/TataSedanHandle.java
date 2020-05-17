package com.gb.gofpatterns.abstractfactory.carspares;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TataSedanHandle extends Handle {
    public TataSedanHandle(Color color) {
        super(color);
        this.setColor(color);
        this.setProductId("TSDN001");
        this.setPrice(1400d);
        this.setDescription("Tata Sedan handle");
    }
}
