package pizza.base;

import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings;

    public Pizza() {
    }

    public Pizza(String name, String dough, String sauce, List<String> toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce");
        System.out.println("Adding toppings");
        if(toppings != null) {
            toppings.forEach(item -> System.out.println("\t" + item));
        }

    }

    public void bake() {
        System.out.println("Baking: " + name + " in 30 mins");
    }

    public void cut() {
        System.out.println("Cutting: " + name);
    }

    public void box() {
        System.out.println("Boxing: " + name);
    }


}
