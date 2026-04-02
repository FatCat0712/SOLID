package pizza.hcm;

import pizza.base.Pizza;

import java.util.List;

public class HCMGreekPizza extends Pizza {
    public HCMGreekPizza() {
        this.name = "HCM A good Greek pizza";
        this.dough = "HCM Thin dough";
        this.sauce = "HCM Chilli sauce";
        this.toppings = List.of("Tomato" ,"Potato");
    }

    @Override
    public void box() {
        System.out.println(name);
    }
}
