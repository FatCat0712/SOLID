package pizza.hue;

import pizza.base.Pizza;

import java.util.List;

public class HUEPepperoniPizza extends Pizza {
    public HUEPepperoniPizza() {
        this.name = "HUE The best pepperoni pizza";
        this.dough = "HUE Thick dough";
        this.sauce = "HUE Sweet sauce";
        this.toppings = List.of("Tomato");
    }
}
