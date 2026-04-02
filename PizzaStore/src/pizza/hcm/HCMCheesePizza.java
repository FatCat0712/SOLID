package pizza.hcm;

import pizza.base.Pizza;

import java.util.List;

public class HCMCheesePizza extends Pizza {
    public HCMCheesePizza() {
        this.name = "HCM The best cheese pizza";
        this.dough = "HCM Very thin dough";
        this.sauce = "HCM Very spicy sauce";
        this.toppings = List.of("Black Olives", "Cheese");
    }

    @Override
    public void box() {
        super.box();
        System.out.println(dough);
    }
}
