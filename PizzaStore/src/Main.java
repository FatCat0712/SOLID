import store.DNPizzaStore;
import store.HCMPizzaStore;
import store.HUEPizzaStore;


public class Main {
    public static void main(String[] args) {
        var huePizzaStore = new HUEPizzaStore();
        huePizzaStore.orderPizza("cheese");
        var dnPizzaStore = new DNPizzaStore();
        dnPizzaStore.orderPizza("cheese");
        var hcmPizzaStore = new HCMPizzaStore();
        hcmPizzaStore.orderPizza("cheese");
    }
}
