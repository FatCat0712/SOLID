import base.MilkTea;
import decorators.*;

public class Main {
    public static void main(String[] args) {
        var ourMilkTea = new EggPudding(
                new FruitPudding(
                        new BlackSugar(
                                new Bubble(
                                        new MilkTea())))
        );

        System.out.println(ourMilkTea.cost());

        var secondMilkTea = new EggPudding(
            new BlackSugar(
                    new WhiteBubble(
                            new MilkTea()
                    )
            )
        );

        System.out.println(secondMilkTea.cost());


    }
}
