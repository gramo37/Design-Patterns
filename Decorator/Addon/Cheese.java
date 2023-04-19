package Addon;

import Decorator.Pizza;

public class Cheese implements Pizza {
    private int price = 20;

    private String description = "Cheese";

    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + price;
    }

    @Override
    public String getDesc() {
        return this.pizza.getDesc() + " " + description;
    }
}
