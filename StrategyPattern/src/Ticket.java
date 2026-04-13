public class Ticket {
    private double price;
    private PromoteStrategy promoteStrategy;
    private String name;

    public Ticket() {
    }

    public Ticket(PromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPromoteStrategy(PromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public PromoteStrategy getPromoteStrategy() {
        return promoteStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPromotedPrice() {
        return promoteStrategy.doPromote(price);
    }
}
