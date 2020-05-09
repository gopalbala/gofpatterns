package com.gb.gofpatterns.decorator.wikipedia;

public class DecoratorMain {
    public static void main(String[] args) {
        Coffee c = new PlainCoffee();
        c = new CoffeeWithMilk(c);
        c = new CreamCoffee(c);
        System.out.println(c.cost());
        System.out.println(c.ingredients());
    }
}
