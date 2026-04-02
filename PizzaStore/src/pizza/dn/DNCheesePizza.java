package pizza.dn;

import pizza.base.Pizza;

import java.util.List;

public class DNCheesePizza extends Pizza {
    public DNCheesePizza() {
        this.name = "DN The best cheese pizza";
        this.dough = "DN Very thin dough";
        this.sauce = "DN Very spicy sauce";
        this.toppings = List.of("Black Olives", "Cheese");
    }

    @Override
    public void box() {
        super.box();
        System.out.println(dough);
    }
}
