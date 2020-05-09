package com.gb.gofpatterns.decorator.wikipedia;

public class CreamCoffee extends CoffeeDecorator {
    public CreamCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.1D;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " Cream";
    }

}
