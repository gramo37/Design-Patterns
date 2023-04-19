package Base;

import Decorator.Pizza;

public class ThickCrust implements Pizza {

    private int price = 100;
    private String description = "Thick Crust";

    @Override
    public int getCost() {
        return price;
    }

    @Override
    public String getDesc() {
        return description;
    }
}
