import Addon.Cheese;
import Addon.Tomato;
import Base.ThinCrust;
import Decorator.Pizza;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new Tomato(new Cheese(new ThinCrust()));

        System.out.println(pizza.getCost() + " " + pizza.getDesc());
    }
}
