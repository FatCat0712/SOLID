package decorators;

import base.IMilkTea;
import base.MilkTeaDecorator;

public class Bubble extends MilkTeaDecorator {
    public Bubble(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return super.cost() + 1;
    }
}
