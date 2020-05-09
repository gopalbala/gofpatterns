package com.gb.gofpatterns.decorator.wikipedia;

public class PlainCoffee extends Coffee {

    public PlainCoffee() {
    }

    @Override
    public double getCost() {
        return 1.0D;
    }

    @Override
    public String getIngredients() {
        return "decoction";
    }
}
