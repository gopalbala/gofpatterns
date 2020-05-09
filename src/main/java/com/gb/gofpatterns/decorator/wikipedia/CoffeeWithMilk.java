package com.gb.gofpatterns.decorator.wikipedia;

public class CoffeeWithMilk extends CoffeeDecorator {

    public CoffeeWithMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " Milk";
    }
}