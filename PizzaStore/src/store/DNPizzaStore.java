package store;

import pizza.base.Pizza;
import pizza.dn.DNCheesePizza;
import pizza.dn.DNGreekPizza;
import pizza.dn.DNPepperoniPizza;
import store.base.PizzaStore;

public class DNPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new DNCheesePizza();
            case "greek" -> new DNGreekPizza();
            case "pepperoni" -> new DNPepperoniPizza();
            default -> null;
        };
    }
}
