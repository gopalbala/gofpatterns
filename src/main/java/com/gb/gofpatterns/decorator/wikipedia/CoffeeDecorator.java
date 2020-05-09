package com.gb.gofpatterns.decorator.wikipedia;

import lombok.ToString;

@ToString
public abstract class CoffeeDecorator implements Coffee {
    private final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }

    @Override
    public String ingredients() {
        return decoratedCoffee.ingredients();
    }

}
