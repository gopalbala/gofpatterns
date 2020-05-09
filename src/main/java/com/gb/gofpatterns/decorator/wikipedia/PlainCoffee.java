package com.gb.gofpatterns.decorator.wikipedia;

import java.util.List;

public class PlainCoffee extends Coffee {
    @Override
    public double getCost() {
        return 1.0D;
    }

    @Override
    public List<String> getIngredients() {
        return List.of("decoction");
    }
}
