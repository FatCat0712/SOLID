package pizza.hue;

import pizza.base.Pizza;

import java.util.List;

public class HUECheesePizza extends Pizza {
    public HUECheesePizza() {
        this.name = "HUE The best cheese pizza";
        this.dough = "HUE Very thin dough";
        this.sauce = "HUE Very spicy sauce";
        this.toppings = List.of("Black Olives", "Cheese");
    }

    @Override
    public void box() {
        super.box();
        System.out.println(dough);
    }
}
