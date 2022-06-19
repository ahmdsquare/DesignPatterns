package Decorator;

public class Chesse extends SandwichDecorator {
    Chesse(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chesse";
    }
}
