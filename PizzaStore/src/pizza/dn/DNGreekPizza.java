package pizza.dn;

import pizza.base.Pizza;

import java.util.List;

public class DNGreekPizza extends Pizza {
    public DNGreekPizza() {
        this.name = "DN A good Greek pizza";
        this.dough = "DN Thin dough";
        this.sauce = "DN Chilli sauce";
        this.toppings = List.of("Tomato" ,"Potato");
    }

    @Override
    public void box() {
        System.out.println(name);
    }
}
