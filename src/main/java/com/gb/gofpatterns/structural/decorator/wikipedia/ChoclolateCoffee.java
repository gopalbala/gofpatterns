package com.gb.gofpatterns.structural.decorator.wikipedia;

public class ChoclolateCoffee extends CoffeeDecorator {
    public ChoclolateCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.0d;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " Chocolate";
    }
}
