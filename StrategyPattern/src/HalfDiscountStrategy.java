public class HalfDiscountStrategy implements PromoteStrategy{
    @Override
    public double doPromote(double price) {
        return price * 0.5;
    }
}
