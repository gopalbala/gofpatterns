package com.gb.gofpatterns.decorator.wikipedia;

public class CreamCoffee extends CoffeeDecorator {
    public CreamCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 2.1D;
    }

    @Override
    public String ingredients() {
        return super.ingredients() + " Cream";
    }

}
