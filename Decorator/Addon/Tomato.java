package Addon;

import Decorator.Pizza;

public class Tomato implements Pizza {

    private int price = 10;

    private String description = "Tomato";

    private Pizza pizza;

    public Tomato(Pizza pizza) {
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
