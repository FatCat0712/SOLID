package store;

import pizza.base.Pizza;
import pizza.hue.HUECheesePizza;
import pizza.hue.HUEGreekPizza;
import pizza.hue.HUEPepperoniPizza;
import store.base.PizzaStore;

public class HUEPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new HUECheesePizza();
            case "greek" -> new HUEGreekPizza();
            case "pepperoni" -> new HUEPepperoniPizza();
            default -> {
                System.out.println("We don't have " + type + " pizza ");
                yield null;
            }
        };
    }
}
