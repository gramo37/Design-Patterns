package Base;
import Decorator.Pizza;

public class ThinCrust implements Pizza{
    private int price = 200;

    private String description = "Thin Crust";

    @Override
    public int getCost() {
        return price;
    }

    @Override
    public String getDesc() {
        return description;
    }
}
