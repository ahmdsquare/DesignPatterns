package Decorator;

public class Main {
    public static void main(String[] args) {
        Sandwich meal = new Chesse(new Beef(new Basic()));
        System.out.print("Description: " + meal.getDescription() + " ");
        System.out.println("=> Price: " + meal.getCost() + " $");
    }

}
