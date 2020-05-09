package com.gb.gofpatterns.decorator.wikipedia;

public class PlainCoffee implements Coffee {

    public PlainCoffee() {
    }

    @Override
    public double cost() {
        return 1.0D;
    }

    @Override
    public String ingredients() {
        return "decoction";
    }
}
