package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        Square drawSquare = new Square();
        Circle drawCircle = new Circle();

        drawSquare.finalMethod();
        System.out.println("------------------------");
        drawCircle.finalMethod();
    }

}
