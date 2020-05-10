package com.gb.gofpatterns.decorator.wikipedia;

public class DecoratorMain {
    public static void main(String[] args) {
        Coffee c = new PlainCoffee();
        c = new CoffeeWithMilk(c);
        c = new CreamCoffee(c);
        c = new ChoclolateCoffee(c);
        System.out.println(c.getCost());
        System.out.println(c.getIngredients());
    }
}
