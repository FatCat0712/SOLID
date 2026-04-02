package store;

import pizza.base.Pizza;
import pizza.dn.DNCheesePizza;
import pizza.dn.DNGreekPizza;
import pizza.dn.DNPepperoniPizza;
import pizza.hcm.HCMCheesePizza;
import pizza.hcm.HCMGreekPizza;
import pizza.hcm.HCMPepperoniPizza;
import store.base.PizzaStore;

public class HCMPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        return switch (type) {
            case "cheese" -> new HCMCheesePizza();
            case "greek" -> new HCMGreekPizza();
            case "pepperoni" -> new HCMPepperoniPizza();
            default -> {
                System.out.println("We don't have " + type + " pizza ");
                yield null;
            }
        };
    }
}
