package pizza.hcm;

import pizza.base.Pizza;

import java.util.List;

public class HCMPepperoniPizza extends Pizza {
    public HCMPepperoniPizza() {
        this.name = "HCM The best pepperoni pizza";
        this.dough = "HCM Thick dough";
        this.sauce = "HCM Sweet sauce";
        this.toppings = List.of("Tomato");
    }
}
