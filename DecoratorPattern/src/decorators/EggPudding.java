package decorators;

import base.IMilkTea;
import base.MilkTeaDecorator;

public class EggPudding extends MilkTeaDecorator {
    public EggPudding(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return super.cost() + 3;
    }
}
