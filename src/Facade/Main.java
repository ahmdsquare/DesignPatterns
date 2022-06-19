package Facade;

public class Main {
    public static void main(String[] args) {

        FacadeClass facade = new FacadeClass();

        System.out.println("Beef Menu " + facade.getBeefMenu());
        System.out.println("Veg Menu " + facade.getVegMenu());
    }
}
