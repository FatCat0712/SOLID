public class NoDiscountStrategy implements PromoteStrategy{
    @Override
    public double doPromote(double price) {
        return price;
    }
}
