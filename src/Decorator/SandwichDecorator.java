package Decorator;

public class SandwichDecorator implements Sandwich {
    protected Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public double getCost() {
        return sandwich.getCost();
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription();
    }
}
