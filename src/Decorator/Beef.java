package Decorator;

public class Beef extends SandwichDecorator {
    Beef(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Beef";
    }
}
