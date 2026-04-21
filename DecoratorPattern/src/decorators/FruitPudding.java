package decorators;

import base.IMilkTea;
import base.MilkTeaDecorator;

public class FruitPudding extends MilkTeaDecorator {
    public FruitPudding(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return super.cost() + 3;
    }
}
