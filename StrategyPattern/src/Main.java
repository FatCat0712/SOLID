import java.util.Random;

public class Main {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            Ticket ticket = new Ticket();
            ticket.setPrice(50 * (i + 1));
            ticket.setName("Ticket " + i);
            assignStrategy(ticket);
            logTicketDetails(ticket);

            assignStrategy(ticket);
            logTicketDetails(ticket);

            System.out.println("------------------------------");

        }
    }

    private static void logTicketDetails(Ticket ticket) {
        System.out.printf("%s was promoted by %s strategy, promoted price is %.2f, original price is %.2f%n",
                ticket.getName(),
                ticket.getPromoteStrategy().getClass().getSimpleName(),
                ticket.getPromotedPrice(),
                ticket.getPrice());
    }

    public static void assignStrategy(Ticket ticket) {
        Random random = new Random();
        int strategyIndex = random.nextInt(3);
        switch (strategyIndex) {
            case 0:
                ticket.setPromoteStrategy(new QuarterDiscountStrategy());
                break;
            case 1:
                ticket.setPromoteStrategy(new HalfDiscountStrategy());
                break;
            case 2:
                ticket.setPromoteStrategy(new EightyPercentDiscountStrategy());
                break;
            default:
                ticket.setPromoteStrategy(new NoDiscountStrategy());
        }
    }
}
