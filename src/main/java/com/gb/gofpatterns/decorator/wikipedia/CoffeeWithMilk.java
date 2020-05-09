package com.gb.gofpatterns.decorator.wikipedia;

public class CoffeeWithMilk extends CoffeeDecorator {

    public CoffeeWithMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost();
    }

    @Override
    public String ingredients() {
        return super.ingredients() + "Milk";
    }
}
