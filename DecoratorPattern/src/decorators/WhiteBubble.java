package decorators;

import base.IMilkTea;
import base.MilkTeaDecorator;

public class WhiteBubble extends MilkTeaDecorator {
    public WhiteBubble(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }
}
