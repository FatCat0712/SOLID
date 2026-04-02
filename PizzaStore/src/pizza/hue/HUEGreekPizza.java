package pizza.hue;

import pizza.base.Pizza;

import java.util.List;

public class HUEGreekPizza extends Pizza {
    public HUEGreekPizza() {
        this.name = "HUE A good Greek pizza";
        this.dough = "HUE Thin dough";
        this.sauce = "HUE Chilli sauce";
        this.toppings = List.of("Tomato" ,"Potato");
    }

    @Override
    public void box() {
        System.out.println(name);
    }
}
