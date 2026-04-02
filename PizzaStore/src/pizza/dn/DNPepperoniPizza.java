package pizza.dn;

import pizza.base.Pizza;

import java.util.List;

public class DNPepperoniPizza extends Pizza {
    public DNPepperoniPizza() {
        this.name = "DN The best pepperoni pizza";
        this.dough = "DN Thick dough";
        this.sauce = "DN Sweet sauce";
        this.toppings = List.of("Tomato");
    }
}
